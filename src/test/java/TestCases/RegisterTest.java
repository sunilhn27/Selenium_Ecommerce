package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Core.Core;
import POM.SigninPOM;

public class RegisterTest extends Core {

	SigninPOM s = new SigninPOM(d);

	@Test
	public void Register() throws InterruptedException {

		s.Signin().click();
		s.Email().sendKeys("sunilhn@gmail.com");
		s.CreateAnAccount().click();
		System.out.println(s.Gender("Mrs"));
		s.Gender("Mrs").click();
		s.Firstname().sendKeys("Sunil");
		s.LastName().sendKeys("H N");
		s.Password().sendKeys("Sunil1234");
		List<WebElement> mon = d.findElements(By.xpath(".//*[@id='months']"));

		for (WebElement m : mon) {
			System.out.println(m.getText());
			if (m.getText().contains("November")) {
				System.out.println("*************");
				System.out.println(m.getText() + "is Selected");
				m.click();
			}
		}

		s.Company().sendKeys("Appworx");
		s.Address().sendKeys("Bangalore");
		s.Addressline2().sendKeys("Malleshwaram");
		s.City().sendKeys("Bangalore");
		Select co = new Select(s.State());
		co.selectByVisibleText("");

		Select s1 = new Select(s.State());
		s1.selectByVisibleText("Florida");

	}
}
