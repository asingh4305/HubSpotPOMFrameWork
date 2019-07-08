package com.qa.hubspot.util;

public class TimeUtil {

	public static void shortWait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

	public static void meduimWait() {
		try {
			Thread.sleep(19000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	
	public static void longWait() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
