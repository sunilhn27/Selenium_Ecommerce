package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Core.Core;

public class Testlogin extends Core {

	@Test
	public static void launch() {

		String a[] = { "Specials", "New products", "Best sellers", "Our stores", "Contact us",
				"Terms and conditions of use", "About us", "Sitemap" };
		System.out.println("launch");

		String b[] = { "My orders", "My credit slips", "My addresses", "My personal info" };

		List<WebElement> links = d.findElements(By.xpath(".//*[@id='block_various_links_footer']/ul/li//a"));

		List<WebElement> accountlinks = d.findElements(By.xpath(".//*[@id='footer']/div/section[5]/div/ul/li/a"));

		for (int i = 0; i < links.size(); i++) {
			String s = links.get(i).getText();
			if (a[i].equalsIgnoreCase(s)) {
				System.out.println("mached Text");
			} else {
				System.out.println("NOT mached Text");
			}
		}
		System.out.println("*******************************");

		for (int j = 0; j < accountlinks.size(); j++) {
			String s1 = accountlinks.get(j).getText();
			if (b[j].equalsIgnoreCase(s1)) {
				System.out.println("mached Text");
			} else {
				System.out.println("NOT mached Text");
			}

		}
	}

}
