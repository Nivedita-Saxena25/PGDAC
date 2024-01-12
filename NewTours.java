package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours {
  @Test(dataProvider = "dp")
  public void f(String fn, String ln,String ph,String email,String add,String city,String state,String code,String coun,String user,String pass,String conpass) {
	  System.setProperty("webdriver.chrome.driver",
		        "C:\\Users\\CDAC\\Desktop\\SeleniumData\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://demo.guru99.com/test/newtours/");
		    String current_url = driver.getCurrentUrl();
		    System.out.println("current Url is :"+ current_url);
		    driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		    driver.findElement(By.name("firstName")).sendKeys(fn);
		    driver.findElement(By.name("lastName")).sendKeys(ln);
		    driver.findElement(By.name("phone")).sendKeys(ph);
		    driver.findElement(By.name("userName")).sendKeys(email);
		    driver.findElement(By.name("address1")).sendKeys(add);
		    driver.findElement(By.name("city")).sendKeys(city);
		    driver.findElement(By.name("state")).sendKeys(state);
		    driver.findElement(By.name("postalCode")).sendKeys(code);
		    Select objSelect3 = new Select(driver.findElement(By.name("country")));
		    objSelect3.selectByValue(coun);
		    driver.findElement(By.name("email")).sendKeys(user);
		    driver.findElement(By.name("password")).sendKeys(pass);
		    driver.findElement(By.name("confirmPassword")).sendKeys(conpass);
		    driver.findElement(By.name("submit")).click();
		    driver.close();
  }
@Test(dataProvider="de")
public void login(String name,String pass)
{
	  System.setProperty("webdriver.chrome.driver",
		        "C:\\Users\\CDAC\\Desktop\\SeleniumData\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://demo.guru99.com/test/newtours/");
		    driver.findElement(By.name("userName")).sendKeys(name);
		    driver.findElement(By.name("password")).sendKeys(pass);
		    WebElement uname = driver.findElement(By.name("userName"));
		    WebElement pwd = driver.findElement(By.name("password"));
		    String user12= uname.getAttribute("value");
		    String password=pwd.getAttribute("value");
		    System.out.println("the username is :"+user12);
		    System.out.println("the password is :"+password);
		    driver.findElement(By.name("submit")).click();
}
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "nivedita", "saxena","8975468596","nivi@gmail.com","Met bkc hostel","Nashik","Maharasthra","748750","INDIA","nivi@1234","nivi","nivi"},
    };
  }
  @DataProvider
  public Object[][] de() {
    return new Object[][] {
      new Object[] {"nivi@1234","nivi"},
    };
  } 
}
