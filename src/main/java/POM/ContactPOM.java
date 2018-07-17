package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Core.Core;

public class ContactPOM extends Core {

	public ContactPOM(WebDriver d) {
		this.d = d;
	}

	By ContactUs = By.xpath(".//*[@id='contact-link']/a");

	By SubjectHeader = By.xpath(".//*[@id='id_contact']");
	By EmailAddress = By.xpath(".//*[@id='email']");
	By OrderReference = By.xpath(".//*[@id='id_order']");
	By AttachFile = By.xpath(".//*[@id='fileUpload']");
	By Send = By.xpath(".//*[@id='submitMessage']");
	By Message = By.xpath(".//*[@id='message']");

	public WebElement ContactUs() {
		return d.findElement(ContactUs);
	}

	public WebElement SubjectHeader(String option) {
		Select s = new Select(d.findElement(SubjectHeader));
		s.selectByVisibleText(option);
		return d.findElement(SubjectHeader);
	}

	public WebElement EmailAddress() {
		Core.infoAndReport("Entered Email Address");
		return d.findElement(EmailAddress);
	}

	public WebElement OrderReference() {
		Core.infoAndReport("Entered Order Reference");
		return d.findElement(OrderReference);
	}

	public WebElement AttachFile() {
		Core.infoAndReport("Entered Attatchfile");

		return d.findElement(AttachFile);
	}

	public WebElement Send() {
		Core.infoAndReport("clicked on Send Button");
		return d.findElement(Send);
	}

	public WebElement Message() {
		Core.infoAndReport("Entered Message");
		return d.findElement(Message);

	}

}
