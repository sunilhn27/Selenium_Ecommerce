package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Core.Core;

public class SigninPOM extends Core {

	public SigninPOM(WebDriver d) {
		this.d = d;
	}

	By Signin = By.xpath("//*[contains(text(),'Sign in')]");
	By CreateAnAccount = By.xpath(".//*[@id='SubmitCreate']");
	By EMail = By.xpath(".//*[@id='email_create']");
	By Gender = By.xpath(".//*[@id='id_gender1']");
	By FirstName = By.xpath(".//*[@id='customer_firstname']");
	By LastName = By.xpath(".//*[@id='customer_lastname']");
	By Password = By.xpath(".//*[@id='passwd']");
	By Day = By.xpath(".//*[@id='days']");
	By month = By.xpath(".//*[@id='months']");
	By Year = By.xpath(".//*[@id='years']");
	By Company = By.xpath(".//*[@id='company']");
	By Address = By.xpath(".//*[@id='address1']");
	By AddressLine2 = By.xpath(".//*[@id='address2']");
	By City = By.xpath(".//*[@id='city']");
	By State = By.xpath(".//*[@id='id_state']");
	By ZipCode = By.xpath(".//*[@id='postcode']");
	By Country = By.xpath(".//*[@id='id_country']");
	By AdditionalInfo = By.xpath(".//*[@id='other']");
	By HomeNumber = By.xpath(".//*[@id='phone']");
	By PhoneNumber = By.xpath(".//*[@id='phone_mobile']");
	By AssignAnaddress = By.xpath(".//*[@id='alias']");
	By Register = By.xpath(".//*[@id='submitAccount']");
	By Emaillogin = By.xpath(".//*[@id='email']");
	By passwordlogin = By.xpath(".//*[@id='passwd']");
	By Submit = By.xpath(".//*[@id='SubmitLogin']");
	By SignOut = By.xpath(".//*[@title='Log me out']");

	public WebElement Gender(String gen) {
		if (gen.equalsIgnoreCase("Mr")) {
			Core.infoAndReport("Selected Mr");
			return d.findElement(By.xpath(".//*[@id='id_gender1']"));
		} else if (gen.equalsIgnoreCase("Mrs")) {
			Core.infoAndReport("Selected Mrs");
			return d.findElement(By.xpath(".//*[@id='id_gender2']"));
		}
		return null;
	}

	public WebElement Emaillogin() {
		Core.infoAndReport("Clicked on Signin");
		return d.findElement(Emaillogin);
	}

	public WebElement passwordlogin() {
		Core.infoAndReport("Clicked on Signin");
		return d.findElement(passwordlogin);
	}

	public WebElement Signin() {
		Core.infoAndReport("Clicked on Signin");
		return d.findElement(Signin);
	}

	public WebElement Email() {
		Core.infoAndReport("Entered Gmail Address");
		return d.findElement(EMail);
	}

	public WebElement CreateAnAccount() {
		Core.infoAndReport("Clicked on Createanaccount");
		return d.findElement(CreateAnAccount);
	}

	public WebElement Firstname() {
		Core.infoAndReport("Entered FirstName");
		return d.findElement(FirstName);
	}

	public WebElement LastName() {
		Core.infoAndReport("Entered lastName");
		return d.findElement(LastName);
	}

	public WebElement Password() {
		Core.infoAndReport("Entered Password");
		return d.findElement(Password);
	}

	public WebElement DOB(int day, String month, int year) {

		return d.findElement(Day);
	}

	public WebElement Company() {
		Core.infoAndReport("Entered Company");
		return d.findElement(Company);
	}

	public WebElement Address() {
		Core.infoAndReport("Entered Address");
		return d.findElement(Address);
	}

	public WebElement Addressline2() {
		Core.infoAndReport("Entered AddressLine2");
		return d.findElement(AddressLine2);
	}

	public WebElement City() {
		Core.infoAndReport("Entered City");
		return d.findElement(City);
	}

	public WebElement State() {
		Core.infoAndReport("Entered State");
		return d.findElement(State);
	}

	public WebElement Country() {
		Core.infoAndReport("Entered Country");
		return d.findElement(Country);
	}

	public WebElement zipcode() {
		Core.infoAndReport("Entered ZipCode");
		return d.findElement(ZipCode);
	}

	public WebElement Additonalinfo() {
		Core.infoAndReport("Entered Additionalinfo");
		return d.findElement(AdditionalInfo);
	}

	public WebElement HomeNumber() {
		Core.infoAndReport("Entered HomeNumber");
		return d.findElement(HomeNumber);
	}

	public WebElement PhoneNumber() {
		Core.infoAndReport("Entered PhoneNumber");
		return d.findElement(PhoneNumber);
	}

	public WebElement Submit() {
		Core.infoAndReport("Entered Submit Button");
		return d.findElement(Submit);
	}

	public WebElement AssignAnaddress() {
		Core.infoAndReport("Entered AssignAnaddress");
		return d.findElement(AssignAnaddress);
	}

	public WebElement Register() {
		Core.infoAndReport("Clicked on Register");
		return d.findElement(Register);
	}

	public WebElement SignOut() {
		Core.infoAndReport("Clicked on SignOut button");
		return d.findElement(SignOut);
	}

	public void Day(String d) {
		Core.infoAndReport("selected Day");
		Select s = new Select((WebElement) Day);
		s.selectByValue(d);

	}

	public void Month(String mon) {
		Core.infoAndReport("Selected month");
		Select s = new Select((WebElement) month);
		s.selectByVisibleText(mon);
	}

	public void Year(int y) {
		Core.infoAndReport("Selected Year");
		Select s = new Select((WebElement) Day);
		s.selectByIndex(y);

	}
}
