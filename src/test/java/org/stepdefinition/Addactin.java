package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Helpers.Base;
import Helpers.BookPojo;
import Helpers.HomePojo;
import Helpers.SearchPojo;
import Helpers.SelectPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addactin extends Base {
	


@Given("load url")
public void load_url() {
lb();
}

@When("user has to fill{string} and {string}")
public void user_has_to_fill_and(String s1, String s2) {
	HomePojo h=new HomePojo();
    fill(h.getUsr(), s1);
    fill(h.getPw(), s2);
}

@When("user can click Login")
public void user_can_click_Login() {
	HomePojo h1=new HomePojo();
	click(h1.getLog());
}

@Then("verify user is in Search page")
public void verify_user_is_in_Search_page() {
System.out.println("user clicked Login");
}

@When("user fill details")
public void user_fill_details() {
	SearchPojo sp=new SearchPojo();
	Actions acc=new Actions(driver);
select(sp.getLoc(), "London");
select(sp.getHotel(), "Hotel Hervey");
fill(sp.getRoom(), "Standard");
fill(sp.getNos(), "3");
fill(sp.getDate1(),"07/07/2020");
fill(sp.getDate2(), "14/07/2020");
select(sp.getAdult(), "2");
select(sp.getChild(),"1");

}

@When("user click search")
public void user_click_search() {
	SearchPojo sp = new SearchPojo(); 
	moveToElement(sp.getSearch());
	click(sp.getSearch());
}

@Then("verify user see his own details")
public void verify_user_see_his_own_details() {
System.out.println("user can see his details");
}

@When("user select and proceed")
public void user_select_and_proceed() {
	
	SelectPojo s1 = new SelectPojo();
	moveToElement(s1.getBtn());
	click(s1.getBtn());
	moveToElement(s1.getContinuebtn());
	click(s1.getContinuebtn());
}
@When("user proceed to pay")
public void user_proceed_to_pay() {
	
	BookPojo b=new BookPojo();
	fill(b.getFirstname(), "sreenivasan");
	fill(b.getLastname(), "A U");
	fill(b.getAddress(), "No.65,perumgudi,chennai");
	fill(b.getCc16(), "1234567899874561");
	fill(b.getCardType(), "visa");
	fill(b.getExmnth(), "November");
	fill(b.getExyear(), "2020");
	fill(b.getCvvno(), "18456");
	moveToElement(b.getBookbtn());
	click(b.getBookbtn());
}

@Then("verify user is own payment page")
public void verify_user_is_own_payment_page() {
System.out.println("user is own payment page ");
}

@When("user select and click continue")
public void user_select_and_click_continue() {
System.out.println("directed to payment details");
}

@Then("verify user in payment page")
public void verify_user_in_payment_page() {
System.out.println("proceed payment");
}


@Then("verify his code generated")
public void verify_his_code_generated() {
System.out.println("code generated");
}


}


	