package com.qa.hubspot.util;

/**
 * The reason behind to create this class we want to accumulate the constant
 * value under this class which will be constant thru out the the Test Cases
 * 
 * @author ASHUTOSH SINGH
 *
 */

public class Constants {
	
	//final keyword will make sure it that no-one could rename it.
	// Static keyword will sure that it can be call thru out the program without creating Object.
	public static final String LOGIN_PAGE_TITLE= "HubSpot Login";
	public static final String HOME_PAGE_TITLE= "Reports dashboard";
	public static final String HOME_PAGE_HEADER= "Sales Dashboard";

	//********************SheetNames****************************
	public static final String CONTACT_SHEET_NAME= "contacts";
	
	
	//*********timeout*************
	public static final int DEFAULT_EXPLICIT_WAIT_TIMEOUT = 16;
	
	
	
}
