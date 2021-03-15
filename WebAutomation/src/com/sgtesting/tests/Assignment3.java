package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanuchBrowser();
		navigate();
		login();
		miniPopwindow();
		createCustomer();
		deleteCustomer();
		//miniPopwindow();
		//modifyUser();
		
		logout();
		closeApplication();
	}
public static void lanuchBrowser()
{
	try
	{
		String path=System.getProperty("user.dir");	
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
		oBrowser.manage().window().maximize();
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
public static void navigate()
{
	try 
	{
		oBrowser.get("http://localhost:81/login.do");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void login()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(5000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void miniPopwindow()
{
	try
	{
		oBrowser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
		Thread.sleep(5000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
 public static void createCustomer()
 {
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[1]")).click();
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
	     Thread.sleep(2000);
	     oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
	     Thread.sleep(2000);
	     oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("siddu");
	     Thread.sleep(2000);
	     oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click(); 
		 
	     Thread.sleep(2000);
		 
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
 public static void modifyUser() 
 {
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")).click();
	     Thread.sleep(2000);
		 oBrowser.findElement(By.name("email")).clear();	 
		 Thread.sleep(2000);
		 oBrowser.findElement(By.name("email")).sendKeys("siddu1@gmail.com");
		 Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div")).click();
		 Thread.sleep(2000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
public static void deleteCustomer()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
		 Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void logout()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

static void closeApplication()
{
	try
	{
		oBrowser.close();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
 }

