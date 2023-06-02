package com.Stepdefinition1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class googlestep {
 WebDriver driver;	


 @Given("^User must launch the Browser$")
 public void user_must_launch_the_Browser() throws Throwable {
	 driver = new ChromeDriver();
 }

@When("^User Must Lauch the Url \"([^\"]*)\"$")
public void user_Must_Lauch_the_Url(String arg1) throws Throwable {
	
	driver.get(arg1);
}



}
