package org.bas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
		public static WebDriver driver;
			
			public static  WebDriver browserLaunch(String bname) {
				if(bname.equalsIgnoreCase("chrome")) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}
				else if (bname.equalsIgnoreCase("edge")) {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					
				}
				else if(bname.equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					
				}
				return driver;

			}
			public static void urlLaunch(String url) {
				driver.get(url);
				driver.manage().window().maximize();

			}
		   public static void implicitlyWait(int i) {
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
		   }
		   public static  void sendKeys(WebElement e,String value) {
			   e.sendKeys(value);
		   }
		   public static String getCurrentUrl() {
			 String currentUrl = driver.getCurrentUrl();
			 return currentUrl;
			 }
			public static  String getTitle() {
		        String title = driver.getTitle();
				return title;

			}
			public static void quit() {
				driver.quit();

			}
			public static String getText(WebElement e) {
			String text = e.getText();
			return text;
			
		   }
		    public static String getAttribute(WebElement e) {
				String attribute = e.getAttribute("value");
				return attribute;

			}
		    public static void moveToElement(WebElement target) {
				Actions a= new Actions(driver);
				a.moveToElement(target).perform();

			}
		    public static void dragAndDrop(WebElement source,WebElement target) {
				Actions a = new Actions(driver);
				a.dragAndDrop(source, target).perform();

			}
		    public static void selectByIndex(WebElement e,int index) {
				Select s = new Select(e);
				s.selectByIndex(index);

			}
		    public static  WebElement findelement(String loc,String value) {
				WebElement e=null;
		    	if (loc.equalsIgnoreCase("id")) {
					e=driver.findElement(By.id(value));
				}
		    	else if (loc.equalsIgnoreCase("name")) {
		    		e=driver.findElement(By.name(value));
		    		
					}
		    	else if (loc.equalsIgnoreCase("xpath")) {
		    		e=driver.findElement(By.xpath(value));
		    		
			   	}
				return e;
				

		    }

			
			
		}


