package screens;

import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebElement;

import helper.ProductEntity;
import helper.SiteFactory;
import utils.CustomUtils;
import utils.Locator;
import utils.ReportListener;

public class searchResultScreen {
	private SiteFactory sf;
	public searchResultScreen(SiteFactory siteFactory) {
		this.sf=siteFactory;
	}

	Locator searchResults=new Locator("list.searchResult", "Search result list");
	Locator itemPriceInSRP=new Locator("list.itemPrice", "Item price");
	Locator googleAdContainer = new Locator("text.adContainer","Goofle add container");
	/**
	 * logic to select random item from SRP page
	 */
	public void selectRandomItemFromProductList() {
		while(!CustomUtils.isDisplayed(googleAdContainer)) {
			CustomUtils.scroll(90, 10);
			if(RandomUtils.nextInt(1, 3)==1)
				break;
		}
		
		WebElement e=CustomUtils.getElements(searchResults).get(RandomUtils.nextInt(1, CustomUtils.getElements(searchResults).size()));
		String name=e.getText();
		e.click();
		ReportListener.test.get().setMsg("Clicked on item "+name);
		ProductEntity productEntity=new ProductEntity();
		productEntity.setProductName(name);
		productEntity.setProductPrice(CustomUtils.getElement(CustomUtils.format(itemPriceInSRP, name)).getText());
	
		CustomUtils.context.set(productEntity);
		
	}
}
