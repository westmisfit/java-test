package org.example;

public class TestShutdownHook {
	public static void main(final String[] args) throws InterruptedException {
		System.out.println("Program started.");

		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Shutdown hook ran!");
			}
		});

		while (true) {
			Thread.sleep(1000);
		}
	}
}