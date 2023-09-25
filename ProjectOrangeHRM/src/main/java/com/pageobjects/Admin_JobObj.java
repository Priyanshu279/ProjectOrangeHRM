package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_JobObj {
	
	@FindBy(xpath = "//span[text()='Job ']") 
	public static WebElement selectJob;
	
	@FindBy(xpath = "//a[text()='Job Titles']")
	public static WebElement selectJobTitle;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	public static WebElement clickAddJobTitle;
	
	@FindBy(xpath = "//form[@class='oxd-form']/div/div/div[2]/input")
	public static WebElement enterTheTitle;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	public static WebElement clickSaveJobTitle;
	
	@FindBy(xpath = "//a[text()='Pay Grades']")
	public static WebElement selectPayGrades;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	public static WebElement clickAddPayGrades;
	
	@FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div[2]/input")
	public static WebElement entertheName;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	public static WebElement clickSavePayGrades;
}
