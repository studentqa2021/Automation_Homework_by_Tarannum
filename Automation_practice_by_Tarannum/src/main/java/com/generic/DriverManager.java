package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Base_Config;

public class DriverManager {
public void getdriver() {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(Base_Config.getfile("URL"));
	driver.manage().window().maximize();
}
}
