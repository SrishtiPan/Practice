package action;

import helper.SiteFactory;

public class loginAction  extends SiteFactory {
	public SiteFactory sf;
	public loginAction(SiteFactory siteFactory) {
		this.sf=siteFactory;
	}
	public loginAction login(String credential) {
		sf.homeScreen().clickOnHamburger();
		sf.homeScreen().clickOnSignInButtonInHamburger();
		sf.loginScreen().enterUserCredential(credential);
		sf.loginScreen().clickOnLoginButton();
		sf.loginScreen().clickOnFingerPrintMayBeLater();
		return this;
	}

}
