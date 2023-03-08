package base;

import java.io.FileReader;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseXp {
	@Test
	public	void getListFromSearch()  throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
    WebElement search=	driver.findElement(By.xpath("//*[@name='q']"));
        search. sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> listofdropdown = driver.findElements(By.xpath("//*[@class='G43f7e']/li"));
		int count = listofdropdown.size();
		System.out.println(count);
		for (WebElement googletextlist : listofdropdown) {
			System.out.println(googletextlist.getText());
			if(googletextlist.getText().equalsIgnoreCase("java interview questions")) {
				googletextlist.click();
				break;
			}}
			Assert.assertEquals(driver.getTitle(),"java interview questions - Google Search");
			
}}


 