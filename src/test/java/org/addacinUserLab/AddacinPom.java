package org.addacinUserLab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddacinPom extends  BaseCls_UsrDfindCls{
	
	public AddacinPom() {
		
	PageFactory.initElements(driver, this);
	
}
	public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getClick() {
	return click;
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getRoom_nos() {
	return room_nos;
}
public WebElement getDatepick_in() {
	return datepick_in;
}
public WebElement getDatepick_out() {
	return datepick_out;
}
public WebElement getAdult_room() {
	return adult_room;
}
public WebElement getChild_room() {
	return child_room;
}
public WebElement getSumbitClick() {
	return sumbitClick;
}
public WebElement getRadio() {
	return Radio;
}
public WebElement getContinue() {
	return Continue;
}
public WebElement getFirstName() {
	return FirstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcnum() {
	return ccnum;
}
public WebElement getCcType() {
	return ccType;
}
public WebElement getCC_month() {
	return CC_month;
}
public WebElement getCC_year() {
	return CC_year;
}
public WebElement getCC_CCV() {
	return CC_CCV;
}
public WebElement getBK_NOW() {
	return BK_NOW;
}
public WebElement getOrder_No() {
	System.out.println(Order_No.getAttribute("value"));
	return Order_No;
}
@FindBy(xpath=("//*[@id='username']"))private WebElement username;
@FindBy(name="password")private WebElement password;
@FindBy(id="login")private WebElement click;
@FindBy(name="location")private WebElement location;
@FindBy(xpath=("//select[@name='hotels']"))private WebElement hotel;
@FindBy(xpath=("//select[@name='room_type']"))private WebElement roomtype;
@FindBy(xpath=("//select[@name='room_nos']"))private WebElement room_nos;
@FindBy(xpath=("//input[@name='datepick_in']"))private WebElement datepick_in;
@FindBy(xpath=("//input[@name='datepick_out']"))private WebElement datepick_out;
@FindBy(xpath=("//select[@name='adult_room']"))private WebElement adult_room;
@FindBy(xpath=("//select[@name='child_room']"))private WebElement child_room;
@FindBy(xpath=("//input[@name='Submit']"))private WebElement sumbitClick;
@FindBy(xpath=("//input[@name='radiobutton_0']"))private WebElement Radio;
@FindBy(xpath=("//input[@name='continue']"))private WebElement Continue;
@FindBy(xpath=("//input[@name='first_name']"))private WebElement FirstName;
@FindBy(xpath=("//input[@name='last_name']"))private WebElement lastName;
@FindBy(xpath=("//textarea[@name='address']"))private WebElement address;
@FindBy(xpath=("//input[@name='cc_num']"))private WebElement ccnum;
@FindBy(xpath=("//select[@name='cc_type']"))private WebElement ccType;
@FindBy(xpath=("//select[@name='cc_exp_month']"))private WebElement CC_month;
@FindBy(xpath=("//select[@name='cc_exp_year']"))private WebElement CC_year;
@FindBy(xpath=("//input[@name='cc_cvv']"))private WebElement CC_CCV;
@FindBy(xpath=("//input[@name='book_now']"))private WebElement BK_NOW;
@FindBy(xpath=("//*[@name='order_no']"))private WebElement Order_No;

}

