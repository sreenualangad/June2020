package Helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPojo extends Base {
	public BookPojo() {
PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
    private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cc16;
	@FindBy(id="cc_type")
	private WebElement cardType;
	@FindBy(id="cc_exp_month")
	private WebElement exmnth;
	@FindBy(id="cc_exp_year")
	private WebElement exyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvno;
	@FindBy(id="book_now")
	private WebElement bookbtn;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc16() {
		return cc16;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExmnth() {
		return exmnth;
	}
	public WebElement getExyear() {
		return exyear;
	}
	public WebElement getCvvno() {
		return cvvno;
	}
	public WebElement getBookbtn() {
		return bookbtn;
	}
	
}
