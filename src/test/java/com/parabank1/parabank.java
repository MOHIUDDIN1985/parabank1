package com.parabank1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(2000);
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
		driver.findElement(By.id("customer.username")).sendKeys("SOBUR234");
		Thread.sleep(2000);
		driver.findElement(By.id("customer.password")).sendKeys("SOBUR234");
		Thread.sleep(2000);
		driver.findElement(By.id("repeatedPassword")).sendKeys("SOBUR234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log Out']"));
		driver.quit();
		
		
		
		

	}

}
