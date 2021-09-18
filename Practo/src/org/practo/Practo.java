package org.practo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Practo {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\eclipse-workspace\\Practo\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.practo.com/");
		
		WebElement loginBtn = driver.findElement(By.name("Practo login"));
		loginBtn.click();
		
		
		
		
		
		driver.close();
	}
}
