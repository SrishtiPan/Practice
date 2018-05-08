package screens;

import helper.ProductEntity;
import helper.SiteFactory;
import utils.CustomUtils;
import utils.Locator;

public class cartScreen {

	public cartScreen(SiteFactory siteFactory) {
	}
	
	Locator productName=new Locator("text.prodName", "Product name in cart page");
	Locator productPrice=new Locator("text.prodPrice", "Product price in cart page");
	Locator unitCount=new Locator("text.unitCount", "Unit count text in cart page");
	Locator proceedToCheckout=new Locator("button.proceedToCheckout", "Proceed to checkout button");
	
	/**
	 * method to verify product details in cart - comparing it with PDP details
	 */
	public void verifyProductInCartScreen() {
		CustomUtils.scroll(90, 30);
		ProductEntity pd=(ProductEntity)CustomUtils.context.get();
		CustomUtils.verifyVisible(CustomUtils.format(productName, pd.getProductName()));
		CustomUtils.verifyVisible(CustomUtils.format(productPrice, pd.getProductPrice()));
		CustomUtils.verifyVisible(CustomUtils.format(unitCount, pd.getQuantity()));
	}

	/**
	 * method to proceed to checkout
	 */
	public void navigateToCheckout() {
		CustomUtils.scroll(90, 30);
		CustomUtils.click(proceedToCheckout);
	}
}
