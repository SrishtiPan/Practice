package screens;

import org.openqa.selenium.Keys;

import helper.SiteFactory;
import utils.CustomUtils;
import utils.Locator;

public class homeScreen {
	SiteFactory sf;
	public homeScreen(SiteFactory siteFactory) {
		this.sf=siteFactory;
	}
	
	/*
	 * xpath references
	 */
	Locator hamburgerButton=new Locator("button.hamburgerButton", "Hamburger button in home screen");
	Locator searchField=new Locator("input.searchTextField", "Search input in home screen");
	Locator hamburgerSignInButton=new Locator("button.signInHamburger", "Sign in button in hamburger menu");
	
	/**
	 * Method to search product
	 * @param searchKeyword
	 */
	public void searchForItem(String searchKeyword) {
		CustomUtils.sendKeys(searchField,searchKeyword);
		CustomUtils.getElement(searchField).sendKeys(Keys.ENTER);
	}

	
	
	public void clickOnHamburger() {
		CustomUtils.click(hamburgerButton);
	}
	
	public void clickOnSignInButtonInHamburger() {
		CustomUtils.click(hamburgerSignInButton);
	}

}
