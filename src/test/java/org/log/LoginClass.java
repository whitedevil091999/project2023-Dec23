package org.log;

import org.bas.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass extends BaseClass{
public LoginClass() {
		
		PageFactory.initElements(driver, this);
}
       @FindBy(xpath="//option[@value='London']")
      private WebElement location;
       
       @FindBy(xpath="//option[@value='Hotel Sunshine']")
       private WebElement Hotels;
       @FindBy(xpath="//option[@value='Double']")
       private WebElement roomtype;
       @FindBy(xpath="(//option[@ value='2'])[1]")
       private WebElement noofroom ;
       public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return Hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoofroom() {
		return noofroom;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getAdultperroom() {
		return adultperroom;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	@FindBy(id="datepick_in")
       private WebElement checkindate;
       @FindBy(id="datepick_out")
       private WebElement checkoutdate;
       @FindBy(xpath="(//option[@ value='2'])[2]")
       private WebElement adultperroom;
       @FindBy(id="Submit")
       private WebElement searchbtn;
	
       @FindBy(xpath="//input[@type='radio']")
       private WebElement radiobtn;
       @FindBy(id="continue")
       private WebElement contbtn;
       @FindBy(xpath="(//input[@type='text'])[11]")
       private WebElement firname;
       @FindBy(xpath="(//input[@type='text'])[12]")
       private WebElement lasname;
       @FindBy(id="address")
       private WebElement addr;
       @FindBy(xpath="(//input[@type='text'])[13]")
       private WebElement cardno;
       public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getContbtn() {
		return contbtn;
	}
	public WebElement getFirname() {
		return firname;
	}
	public WebElement getLasname() {
		return lasname;
	}
	public WebElement getAddr() {
		return addr;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpmon() {
		return expmon;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookbtn() {
		return bookbtn;
	}
	@FindBy(xpath="//option[@value='VISA']")
       private WebElement cardtype;
       @FindBy(xpath="//option[@value='4']")
       private WebElement expmon;
       @FindBy(xpath="//option[@value='2024']")
       private WebElement expyear;
       @FindBy(xpath="(//input[@type='text'])[14]")
       private WebElement cvv;
       @FindBy(xpath="(//input[@type='button'])[1]")
       private WebElement bookbtn;
	
	}


