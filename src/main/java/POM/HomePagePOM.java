package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Core.Core;

public class HomePagePOM extends Core {

	public HomePagePOM(WebDriver d) {
		this.d = d;
	}

	By Women = By.xpath(".//*[@class='sf-with-ul'][@title='Women']");
	By Dresses = By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a");
	By Tshirt = By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a");

}
