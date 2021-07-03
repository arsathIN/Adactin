package org.addacinStepDefinition;

import org.addacinUserLab.AddacinPom;
import org.addacinUserLab.BaseCls_UsrDfindCls;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddacinStepDefinition extends BaseCls_UsrDfindCls {

	@Given("User is in adactinhotel login page")
	public void user_is_in_adactinhotel_login_page() {
		launchUrl("https://adactinhotelapp.com/");

	}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
		AddacinPom ap1 = new AddacinPom();
		passValue(ap1.getUsername(), "mkck4695");
		passValue(ap1.getPassword(), "mkck4695");

	}

	@When("User click login button")
	public void user_click_login_button() {
		AddacinPom ap2 = new AddacinPom();
		click_Normal(ap2.getClick());

	}

	@Then("User must be in SearchHotel page")
	public void user_must_be_in_SearchHotel_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("check the url", currentUrl.contains("SearchHotel"));

	}

	@When("User enter Location,Hotels,Room Type,Number of Rooms,Check In Date,Check Out Date,Adults per Room,Children per Room")
	public void user_enter_Location_Hotels_Room_Type_Number_of_Rooms_Check_In_Date_Check_Out_Date_Adults_per_Room_Children_per_Room() {
		AddacinPom ap3 = new AddacinPom();
		passValue(ap3.getLocation(), "New York");
		passValue(ap3.getHotel(), "Hotel Sunshine");
		passValue(ap3.getRoomtype(), "Super Deluxe");
		passValue(ap3.getRoom_nos(), "7 - Seven ");
		passValue(ap3.getDatepick_in(), "30/05/2021");
		passValue(ap3.getDatepick_out(), "03/06/2021");
		passValue(ap3.getAdult_room(), "2 - Two");
		passValue(ap3.getChild_room(), "4 - Four");

	}

	@When("User click Search button")
	public void user_click_Search_button() {
		AddacinPom ap = new AddacinPom();
		click_Normal(ap.getSumbitClick());

	}

	@Then("user must be in SelectHotel page")
	public void user_must_be_in_SelectHotel_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("check the url", currentUrl.contains("SelectHotel"));
	}

	@When("User click radio button of a hotel and User click Search button")
	public void user_click_radio_button_of_a_hotel_and_User_click_Search_button() {
		AddacinPom ap = new AddacinPom();
		click_Normal(ap.getRadio());
		click_Normal(ap.getContinue());
	}

	@Then("User must be in BookHotel page")
	public void user_must_be_in_BookHotel_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("check the url", currentUrl.contains("BookHotel"));
	}

	@When("User enter First Name,Last Name,Billing Address,Credit Card No,Credit Card Type,Expiry Date,CVV Number")
	public void user_enter_First_Name_Last_Name_Billing_Address_Credit_Card_No_Credit_Card_Type_Expiry_Date_CVV_Number() {
		AddacinPom ap = new AddacinPom();
		passValue(ap.getFirstName(), "Super");
		passValue(ap.getLastName(), "Hero");
		passValue(ap.getAddress(), "Space");
		passValue(ap.getCcnum(), "1234567890123456");
		passValue(ap.getCcType(), "Master Card");
		passValue(ap.getCC_month(), "January");
		passValue(ap.getCC_year(), "2021");
		passValue(ap.getCC_CCV(), "1232");

	}

	@When("User click book now button")
	public void user_click_book_now_button() throws Exception {
		AddacinPom ap = new AddacinPom();
		click_Normal(ap.getBK_NOW());
		Thread.sleep(5000);

	}

	@Then("User must be in BookingConfirm page")
	public void user_must_be_in_BookingConfirm_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("check the url", currentUrl.contains("BookingConfirm"));

	}

	@Then("Order no for hotel room should be generated")
	public void order_no_for_hotel_room_should_be_generated() {

		AddacinPom ap = new AddacinPom();
		ap.getOrder_No();
	}

}