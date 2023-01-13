package vTiger.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import vTiger.GenericUtilities.BaseClass;

import vTiger.ObjectRepository.HomePage;

public class WebTables extends BaseClass  {
	
@Test
public void clickallCheckboxes() throws InterruptedException{
	HomePage hp=new HomePage(driver);
	hp.clickOnOrganizationLink();
	  List<WebElement> elements = driver.findElements(By.xpath("///input[@name='selected_id']']"));
	int size = elements.size();
	System.out.println(size);
	  for(WebElement k:elements) {
		System.out.println(k);
	
	  }
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	
	
		
		
		
	}

}
