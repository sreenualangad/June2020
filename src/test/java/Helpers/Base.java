package Helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
public static WebDriver driver;
//public static Select s;
public static WebDriver lb() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Addactin\\dri\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	return driver;
}
public static void url(String url) {
	driver.get("url");
}

public static void fill(WebElement e, String value) {
e.sendKeys(value);
}

public static void click(WebElement e) {
	e.click();

}
public static void select(WebElement s, String value) {
Select s1= new Select(s);
s1.selectByValue(value);
}

public void moveToElement(WebElement e ) {
Actions acc =new Actions(driver);
acc.moveToElement(e).perform();
}

public void Screenshot() throws IOException {


	TakesScreenshot tk = (TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Addactin\\screenshots\\name.jpeg");
	FileUtils.copyFile(src,dest);
}

}
