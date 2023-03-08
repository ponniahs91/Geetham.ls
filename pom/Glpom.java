package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Glpom {
	
	 WebDriver driver;
@FindBy(xpath = "//*[@name='q']")
private WebElement clickSearchBar;

@FindBy(xpath = "//*[@class='G43f7e']/li" )
private  List<WebElement> getListOfSeleniumInSearchBar;
// like hard coding the value from list we can pass value from outside.
//@FindBy(xpath = "//*[@class='G43f7e']//child::*[@class='pcTkSc']//following::*//*[@aria-label='%s']")
//private WebElement inputInSearch;

public Glpom(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public Glpom searchBoxEntry(String sendkeys) throws InterruptedException {
	clickSearchBar.sendKeys(sendkeys);
	Thread.sleep(3000);
	return this;
}

public String getListFromSearch1(String value) throws InterruptedException {
//	String inputInSearch="//*[@class='G43f7e']//child::*[@class='pcTkSc']//following::*//*[@aria-label='%s']";
//	System.out.println(String.format(inputInSearch, value.toLowerCase()));
//	driver.findElement(By.xpath(String.format(inputInSearch, value.toLowerCase()))).click();
	System.out.println(value);
	System.out.println(getListOfSeleniumInSearchBar.size());

	for (WebElement webElement : getListOfSeleniumInSearchBar) {
		//System.out.println(webElement.getSize());
		if (webElement.getText().equalsIgnoreCase(value)) {
			webElement.click(); 
		Thread.sleep(3000);
		// value =webElement.getText(); 
		break;
		}
		
	//inputInSearch.click();
//	System.out.println(driver.getTitle());
//	Assert.assertEquals(driver.getTitle(),"java interview questions - Google Search");
		}
	return driver.getTitle();
	}



public boolean getListFromSearch(String value) throws InterruptedException {
	for (WebElement webElement : getListOfSeleniumInSearchBar) {
		//System.out.println(webElement.getSize());
		if (webElement.getText().equalsIgnoreCase(value)) {
			webElement.click(); 
		Thread.sleep(3000);
		// value =webElement.getText(); 
		break;
		}
		}
	return driver.getTitle().contains(value);
	}}





