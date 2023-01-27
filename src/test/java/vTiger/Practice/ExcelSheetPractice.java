package vTiger.Practice;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelSheetPractice {
	
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		Thread.sleep(3000);
		int day=03;
		//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
		//Thread.sleep(3000);
		//WebElement ele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		////Thread.sleep(3000);
	//	String header=ele.getText();
	//	System.out.println(header);
		//WebElement elenext = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
		Thread.sleep(3000);
		String flag="false";
		while(flag=="false") {
			WebElement ele = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			Thread.sleep(3000);
			String header=ele.getText();
			System.out.println(header);
			if(header.contains("August 2023")) {
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
			Thread.sleep(3000);
			flag="true";
			break;
		}
		
			else {
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
				Thread.sleep(3000);
			}
		
	}
		driver.close();
}
}