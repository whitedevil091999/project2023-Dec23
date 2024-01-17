package org.proj;

import org.bas.BaseClass;
import org.log.LoginClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

 public class Project extends BaseClass {
		public static void main(String[]args) {
			browserLaunch("edge");
			urlLaunch("https://adactinhotelapp.com");
			implicitlyWait(20);
			//login page
			WebElement username = findelement("id","username");
			sendKeys(username, "rahulkumaresan1999");
			WebElement password = findelement("id","password");
			sendKeys(password, "vanniyanrahul");
			WebElement loginbtn = findelement("id","login");
			loginbtn.click();
			implicitlyWait(30);
			
			LoginClass l =new LoginClass();
			//1st page
			sendKeys(l.getLocation(),"London");
			sendKeys(l.getHotels(),"Hotel Sunshine");
			sendKeys(l.getRoomtype(),"Double");
			sendKeys(l.getNoofroom(),"2");
			sendKeys(l.getCheckindate(),"08/12/2023"); 
			sendKeys(l.getCheckoutdate(),"09/12/2023" );
			sendKeys(l.getAdultperroom(),"2");
			
			l.getSearchbtn().click();
			
			implicitlyWait(30);
			
			//2nd page
			l.getRadiobtn().click();
			l.getContbtn().click();
			
			//implicitlyWait(30);
			
			//3rd page
			sendKeys(l.getFirname(),"rahul");
			sendKeys(l.getLasname(), "kumaresan");
			sendKeys(l.getAddr(),"chennai,TamilNadu,India");
			sendKeys(l.getCardtype(),"VISA");
			sendKeys(l.getCardno(),"9852147632541369");
			sendKeys(l.getExpmon(),"4");
			sendKeys(l.getExpyear(),"2024");
			sendKeys(l.getCvv(),"159");
			l.getBookbtn().click();
			
			//implicitlyWait(30);
			
			//4th page
			WebElement orderno = findelement("xpath","//input[@name='order_no']");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Object executeScript = js.executeScript("return argument[0].getAttribute('value')",orderno);
			Object orderid = (String)executeScript;
			System.out.println(orderid);
				
				

		}
		}
