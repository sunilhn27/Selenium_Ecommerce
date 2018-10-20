package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	static WebDriver d;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\Chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://demoqa.com/draggable/");
		d.manage().window().maximize();
		WebElement dr = d.findElement(By.xpath(".//*[@id='draggable']"));
		Actions a = new Actions(d);
		a.moveToElement(dr, 500, 600).build().perform();
		System.out.println("success");
		d.close();

	}
}
