package TestCases;

import org.testng.annotations.Test;

import Core.Core;
import POM.IndexPOM;
import POM.SigninPOM;

public class LoginAsSunil extends Core {

	SigninPOM s = new SigninPOM(d);
	IndexPOM i = new IndexPOM(d);

	@Test
	public void Login() throws InterruptedException {
		s.Signin().click();
		s.Emaillogin().sendKeys("sunil@hn.gmail.com");
		s.passwordlogin().sendKeys("sunil@123");
		s.Submit().click();
		// s.SignOut().click();
		i.Logo().click();
		Thread.sleep(2000);

	}

}
