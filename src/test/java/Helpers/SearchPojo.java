package Helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends Base {
	public SearchPojo() {
	PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(id="room_nos")
	private WebElement nos;
	@FindBy(id="datepick_in")
	private WebElement date1;
	@FindBy(id="datepick_out")
	private WebElement date2;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(id="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement search;
	
	
	@FindBy (xpath="//a[text()='Go back to Login page']")
	private WebElement back;


	public WebElement getLoc() {
		return loc;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRoom() {
		return room;
	}


	public WebElement getNos() {
		return nos;
	}


	public WebElement getDate1() {
		return date1;
	}


	public WebElement getDate2() {
		return date2;
	}


	public WebElement getAdult() {
		return adult;
	}


	public WebElement getChild() {
		return child;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getBack() {
		return back;
	}
}
