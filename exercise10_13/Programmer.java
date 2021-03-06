package exercise10_13;

import exercise14.IWebsiteCreator;

public class Programmer extends Employee implements IWebsiteCreator {
	
	public Programmer(String firstnameInput, String lastnameInput) {
		super(firstnameInput, lastnameInput);
	}

	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
	
	public void createWebsite(String template, String titleName) {
		System.out.println("create web site " + template + " " + titleName);
	}
	
	public void installWindows(String version, String productKey) {
		System.out.println("install windows " + version + " " + productKey);
	}

}
