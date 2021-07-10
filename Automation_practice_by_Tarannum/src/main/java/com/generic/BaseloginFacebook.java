package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Base_Config;
import com.utility.Highlight;
import com.utility.ScreenShot;

public class BaseloginFacebook {
	public void getlogin() {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(Base_Config.getfile("URL"));
	driver.manage().window().maximize();
	MasterPageFactory obj = new MasterPageFactory(driver);
	ScreenShot.getpics(driver,"homepage");
	ScreenShot.getpics(driver,"login page");
	ScreenShot.getpics(driver,"after login");
	Highlight.addcolor( driver,obj.getEmail());
	obj.getEmail().sendKeys(Base_Config.getfile("Email"));
	Highlight.addcolor(driver, obj.getPassword());
	obj.getPassword().sendKeys(Base_Config.getfile("Password"));
	Highlight.addcolor(driver, obj.getlogin());
	obj.getlogin().click();
	driver.quit();

}
}
