package google_search_verification;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.GoogleSearchSelectDropdown;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Glpom;
import testdata.SendKeyData;
import testdata.val_ipsearch;

public class GoogleSearchTestCase extends GoogleSearchSelectDropdown {

	@Test
public 	void getListFromSearch()  throws InterruptedException{
		
//		Glpom pompage = new Glpom(driver);
//		String str= pompage.searchBoxEntry(SendKeyData.Send_key.getsendkeys())
//       .getListFromSearch1(val_ipsearch.Input.getValue());
//		Assert.assertEquals(str,"java interview questions - Google Search");

		Glpom pompage = new Glpom(driver);
		boolean str= pompage.searchBoxEntry(SendKeyData.Send_key.getsendkeys())
       .getListFromSearch(val_ipsearch.Input.getValue());
		Assert.assertTrue(str,"java interview questions - Google Search should get disply");

}}
