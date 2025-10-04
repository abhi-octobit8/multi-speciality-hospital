pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        script {
          // prefer project-provided Maven wrapper when available
          if (isUnix()) {
            if (fileExists('./mvnw')) {
              sh './mvnw -B -DskipTests clean package'
            } else {
              sh 'mvn -B -DskipTests clean package'
            }
          } else {
            if (fileExists('mvnw.cmd')) {
              bat 'mvnw.cmd -B -DskipTests clean package'
            } else {
              bat 'mvn -B -DskipTests clean package'
            }
          }
        }
      }
    }
    stage('Test') {
      steps {
        echo 'Testing...'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying...'
      }
    }
  }

}