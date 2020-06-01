package Helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPojo extends Base {
	public SelectPojo() {
    PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement btn;
	@FindBy(id="continue")
	private WebElement continuebtn;
	public WebElement getBtn() {
		return btn;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	

}
