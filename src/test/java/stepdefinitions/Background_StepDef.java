package stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import pages.*;
import util.ConfigUtil;


public class Background_StepDef {
	SignInPage sp = new SignInPage(DriverFactory.getDriver());
	CreateAnAccountPage capg = new CreateAnAccountPage(DriverFactory.getDriver());

	String title = null;

	@When("User gets the page title")
	public void user_gets_the_page_title() {
		title = DriverFactory.getDriver().getTitle();
		System.out.println("Title :" + title);
	}

	@Then("title of the page is {string}")
	public void title_of_the_page_is(String string) {
		Assert.assertEquals(title, string);
	}

}
