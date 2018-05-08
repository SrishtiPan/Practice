package action;

import helper.SiteFactory;

public class addToCartAction extends SiteFactory{

	private SiteFactory sf;
	public addToCartAction(SiteFactory siteFactory) {
		this.sf=siteFactory;
	}

	/**
	 * Method to verify product in cart
	 * And navigate to checkout screen
	 * @return
	 */
	public addToCartAction verifyProductInCartScreenAndNavigateToCheckout() {
		sf.cartScreen().verifyProductInCartScreen();
		sf.cartScreen().navigateToCheckout();
		return this;
	}

}
