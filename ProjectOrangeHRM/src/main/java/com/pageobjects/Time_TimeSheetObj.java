package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Time_TimeSheetObj {
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")
	public static WebElement TimeTab;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	public static WebElement EmployeeNameInput;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button")
	public static WebElement ViewBtn;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/button[1]")
	public static WebElement CreateTimeSheetBtn;

}