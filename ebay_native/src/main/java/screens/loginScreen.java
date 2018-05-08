package screens;

import helper.SiteFactory;
import utils.CustomUtils;
import utils.Locator;

public class loginScreen {
	private SiteFactory sf;
	public loginScreen(SiteFactory siteFactory) {
		this.sf=siteFactory;
	}
	
	Locator emailIdField=new Locator("text.emailId", "email id field in sign in screen");
	Locator passwordFileld=new Locator("text.password", "password field in sign in screen");
	Locator signInButton=new Locator("button.signIn", "Sign in button in hamburger menu");
	Locator fingerprintMayBeLater=new Locator("button.maybelater", "fingerprint mabe later button");
			
	
	public void enterUserCredential(String credential) {
		CustomUtils.sendKeys(emailIdField, credential.split("-")[0]);
		CustomUtils.sendKeys(passwordFileld, credential.split("-")[1]);
	}


	public void clickOnLoginButton() {
		CustomUtils.click(signInButton);
	}


	public void clickOnFingerPrintMayBeLater() {
		CustomUtils.click(fingerprintMayBeLater);
	}
}
