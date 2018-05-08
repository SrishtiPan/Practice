package action;

import helper.SiteFactory;

public class checkoutAction  extends SiteFactory{
	
	private SiteFactory sf;

	public checkoutAction(SiteFactory siteFactory) {
		this.sf=siteFactory;
	}
	
	/**
	 * Method to enter random user details and continue
	 * @return
	 */
	public checkoutAction enterUserRegisterattionDetailsAndContinue() {
		sf.checkoutScreen().clickOnRegistrationButton();
		sf.checkoutScreen().enterRandomUserInfoAndContinue();
		return this;
	}
	
	/**
	 * Method to proceed to checkout with guest user
	 * @return
	 */
	public checkoutAction proceedAsGuestCheckout() {
		sf.checkoutScreen().proceedAsGuestChecout();
		return this;
	}

}
