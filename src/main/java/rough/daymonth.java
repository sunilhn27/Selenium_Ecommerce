package rough;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Core.Core;
import POM.SigninPOM;

public class daymonth extends Core {

	SigninPOM s = new SigninPOM(d);

	@Test
	public void day() throws IOException {
		Core.setup();
		s.Signin().click();
		s.Email().sendKeys("sunilhn@gmail.com");
		s.CreateAnAccount().click();
		System.out.println(s.Gender("Mrs"));
		s.Gender("Mrs").click();
		s.Firstname().sendKeys("Sunil");
		s.LastName().sendKeys("H N");
		s.Password().sendKeys("Sunil1234");

		Select s = new Select(d.findElement(By.xpath(".//*[@id='days']")));
		s.selectByVisibleText("27");
	}
}
