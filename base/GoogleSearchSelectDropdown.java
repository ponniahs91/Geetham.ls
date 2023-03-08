package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class GoogleSearchSelectDropdown {
public static WebDriver driver;
public static Properties prop= new Properties();
public static FileInputStream file;

	@BeforeMethod
public	void searchDropdown() throws IOException, InterruptedException {
		file=new FileInputStream("C:\\Users\\sundar\\eclipse-workspace\\google-groups\\src\\test\\resources\\configfiles\\config.properties");
		prop.load(file);
		Thread.sleep(1000);
System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");

 if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sundar\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver(); 
		driver.get(prop.getProperty("loginurl"));
		driver.manage().window().maximize();
}
}}
