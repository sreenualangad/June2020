package Helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePojo extends Base {
	public HomePojo() {
	PageFactory.initElements(driver,this);
	
	}
	@FindBy(id="username")
	private WebElement usr;
	@FindBy(id="password")
	private WebElement pw;
	@FindBy(id="login")
	private WebElement log;
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement firsttime;
	public WebElement getUsr() {
		return usr;
	}
	public WebElement getPw() {
		return pw;
	}
	public WebElement getLog() {
		return log;
	}
	public WebElement getFirsttime() {
		return firsttime;
	}

}
