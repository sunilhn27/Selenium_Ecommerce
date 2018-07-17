package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Core.Core;

public class IndexPOM extends Core {

	public IndexPOM(WebDriver d) {
		this.d = d;

	}

	By BestSellers = By.xpath(".//*[text()='Best Sellers']");
	By Popular = By.xpath(".//*[text()='Popular']");
	By Blouse = By.xpath(".//*[@id='homefeatured']/li[2]/div/div[2]/h5/a");
	By Quantity = By.xpath(".//*[@id='quantity_wanted_p']/a[2]/span/i");
	By Size = By.xpath(".//*[@id='group_1']");
	By WhiteColor = By.xpath(".//*[@id='color_8']");
	By BlackColor = By.xpath(".//*[@id='color_11']");
	By AddToCart = By.xpath(".//*[@id='add_to_cart']/button");
	By ProceedToCheckOut = By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span");
	By Proceed = By.xpath(".//*[@id='center_column']/p[2]/a[1]/span");
	By Logo = By.xpath(".//*[@id='header_logo']/a/img");
	By Proceed2 = By.xpath(".//*[@id='center_column']/form/p/button");
	By IAgree = By.xpath(".//*[@id='cgv']");
	By Proceed3 = By.xpath(".//*[@id='form']/p/button");
	By BlouseAddToCart = By.xpath(".//*[@id='blockbestsellers']/li[3]/div/div[1]/div/a[1]/img");
	// .//*[@id='blockbestsellers']/li[3]/div/div[1]/div/a[1]/img

	public WebElement BestSellers() {
		Core.infoAndReport("Clicked on BestSellers");
		return d.findElement(BestSellers);
	}

	public WebElement BlouseAddToCart() {
		Core.infoAndReport("Clicked on BlouseAddToCart");
		return d.findElement(BlouseAddToCart);
	}

	public WebElement Proceed3() {
		Core.infoAndReport("Clicked on Proceed3");
		return d.findElement(Proceed3);
	}

	public WebElement Proceed2() {
		Core.infoAndReport("Clicked on Proceed2");
		return d.findElement(Proceed2);
	}

	public WebElement IAgree() {
		Core.infoAndReport("Clicked on IAGree");
		return d.findElement(IAgree);
	}

	public WebElement Logo() {
		Core.infoAndReport("Clicked on Logo");
		return d.findElement(Logo);
	}

	public WebElement Popular() {
		Core.infoAndReport("Clicked on Popular");
		return d.findElement(Popular);
	}

	public WebElement Blouse() {
		Core.infoAndReport("Clicked on Blouse");
		return d.findElement(Blouse);
	}

	public WebElement Quantity() {
		Core.infoAndReport("Entered Quantity");
		return d.findElement(Quantity);
	}

	public WebElement Color(String c) {
		Core.infoAndReport("Entered Color");
		if (c.equalsIgnoreCase("white")) {
			Core.infoAndReport("Selected White Color");
			return d.findElement(WhiteColor);
		} else if (c.equalsIgnoreCase("black")) {
			Core.infoAndReport("Selected Black Color");
			return d.findElement(BlackColor);
		}
		return null;
	}

	public WebElement AddToCart() {
		Core.infoAndReport("Clicked on AddToCart Button");
		return d.findElement(AddToCart);

	}

	public WebElement ProceedToCheckOut() {
		Core.infoAndReport("Clicked on ProceedToCheckOut Button");
		return d.findElement(ProceedToCheckOut);
	}

	public WebElement Proceed() {
		Core.infoAndReport("Clicked on Proceed Button");
		return d.findElement(Proceed);
	}
}