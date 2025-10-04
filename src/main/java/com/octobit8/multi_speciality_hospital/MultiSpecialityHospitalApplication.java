package com.octobit8.multi_speciality_hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiSpecialityHospitalApplication {

	// private constructor prevents direct instantiation
	private MultiSpecialityHospitalApplication() {
	}

	// Initialization-on-demand holder for lazy, thread-safe singleton
	private static class Holder {
		private static final MultiSpecialityHospitalApplication INSTANCE = new MultiSpecialityHospitalApplication();
	}

	public static MultiSpecialityHospitalApplication getInstance() {
		return Holder.INSTANCE;
	}

	/**
	 * Start the application. Kept as an instance method to demonstrate singleton
	 * usage.
	 */
	public void start(String[] args) {
		// Print a friendly message for Jenkins / CI logs
		System.out.println("Hello Jenkins");
		SpringApplication.run(MultiSpecialityHospitalApplication.class, args);
	}

	public static void main(String[] args) {
		// Use the singleton to start the application
		MultiSpecialityHospitalApplication.getInstance().start(args);
	}

}
