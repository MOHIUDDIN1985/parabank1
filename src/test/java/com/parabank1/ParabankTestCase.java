package com.parabank1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParabankTestCase {
	RemoteWebDriver driver;
	@BeforeTest
	public void GotoWebPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(2000);
		
	}
	@Test
	public void Register() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("customer.firstName")).sendKeys("Sobur");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.lastName")).sendKeys("Ali");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.street")).sendKeys("113 brooklyn");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.city")).sendKeys("brooklyn");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.state")).sendKeys("NewYork");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("10443");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("017123");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.ssn")).sendKeys("012-012-3344");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.username")).sendKeys("SOBUR456");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("SOBUR456");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("SOBUR456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log Out']"));
		
	}
	@Test
	public void LogIn() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SOBUR345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SOBUR345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(2000);
		
	}
	@Test
	public void GetBalance() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SOBUR345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SOBUR345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("ng-binding")).getText());
		Thread.sleep(2000);
		
	}
	@AfterTest
	public void QuitFromWeb() {
		driver.quit();
	}

}
