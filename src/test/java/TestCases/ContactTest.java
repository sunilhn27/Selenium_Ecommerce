package TestCases;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Core.Core;
import Excelutilities.dataprovider;
import POM.ContactPOM;

public class ContactTest extends Core {

	ContactPOM c = new ContactPOM(d);

	@Test(dataProvider = "contact")
	public void contact(Hashtable<String, String> data) throws InterruptedException {
		c.ContactUs().click();
		c.SubjectHeader(data.get("Subject Heading"));
		c.EmailAddress().sendKeys(data.get("Emailid"));
		c.OrderReference().sendKeys(data.get("Order reference"));
		c.Message().sendKeys(data.get("Message"));
		Thread.sleep(2000);
		c.Send().click();

	}

	@DataProvider(name = "contact")
	public static Object[][] getdata() {
		return dataprovider.getdata("ContactUs", e);
	}

}
