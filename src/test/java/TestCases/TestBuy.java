package TestCases;

import org.testng.annotations.Test;

import Core.Core;
import POM.IndexPOM;

public class TestBuy extends Core {

	IndexPOM i = new IndexPOM(d);

	@Test
	public void Buy() throws InterruptedException {
		i.BestSellers().click();
		// i.Blouse().click();
		Thread.sleep(2000);
		i.BlouseAddToCart().click();
		d.switchTo().frame(1);
		i.Quantity().click();
		i.Color("White").click();
		i.AddToCart().click();
		i.ProceedToCheckOut().click();
		i.Proceed().click();
		i.Proceed2().click();
		i.IAgree().click();
		i.Proceed3().click();

	}

}
