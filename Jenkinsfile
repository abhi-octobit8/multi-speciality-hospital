pipeline {
  agent any

  stages {

    stage('Checkout') {
      steps {
        checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/abhi-octobit8/multi-speciality-hospital.git']])
      }
    }
    stage('Build') {
      steps {
              sh 'mvn clean'
              sh 'mvn package'
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
        echo 'Deployment done...'
        
      }
    }
}

