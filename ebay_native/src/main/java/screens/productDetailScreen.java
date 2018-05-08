package screens;

import org.openqa.selenium.ScreenOrientation;

import helper.ProductEntity;
import helper.SiteFactory;
import utils.CustomUtils;
import utils.Locator;

public class productDetailScreen {

	public productDetailScreen(SiteFactory siteFactory) {
		// TODO Auto-generated constructor stub
	}

	Locator productPrice =new Locator("text.price", "Product price");
	Locator itemName = new Locator("text.itemName", "Product name");
	Locator addToCart = new Locator("button.atc", "Add to cart button");
	Locator quantityPicker = new Locator("picker.quantity", "Quantity picker wheel");
	Locator quantitySelected = new Locator("text.quantity", "Quantity selected");
	Locator reviewButton = new Locator("button.review", "Review button");
	Locator loader = new Locator("image.loader", "Loader image");
	/**
	 * Method to verify pdp and navigate to cart
	 */
	public void verifyProductDetailsAndNavigateToCart() {
		ProductEntity pd=(ProductEntity)CustomUtils.context.get();
		CustomUtils.verifyContainsText(itemName, pd.getProductName());
		CustomUtils.verifyContainsText(productPrice, pd.getProductPrice());
		if(CustomUtils.getDriver().getOrientation()==ScreenOrientation.LANDSCAPE) {
			CustomUtils.scroll(70, 30);
		}
		CustomUtils.click(addToCart);
	}

	public void selectQuantity(String quantity) {
		while(!CustomUtils.isDisplayed(CustomUtils.format(quantitySelected, quantity)))
			CustomUtils.scrollElement(quantityPicker,90,60);
		
		ProductEntity pd=(ProductEntity)CustomUtils.context.get();
		pd.setQuantity(quantity);
		if(CustomUtils.getDriver().getOrientation()==ScreenOrientation.LANDSCAPE) {
			CustomUtils.scroll(70, 30);
		}
		CustomUtils.click(reviewButton);
		CustomUtils.verifyNotVisible(loader);
	}
}
