package screens;

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
	Locator searchField1=new Locator("input.searchTextField1", "Search input1 in home screen");
	Locator searchField2=new Locator("input.searchTextField2", "Search input2 in home screen");
	Locator hamburgerSignInButton=new Locator("button.signInHamburger", "Sign in button in hamburger menu");
	Locator searchLoader = new Locator("image.loader", "loader image");
	Locator autoSuggestion = new Locator("text.autoSug", "Auto suggestion list for search item");
	/**
	 * Method to search product
	 * @param searchKeyword
	 */
	public void searchForItem(String searchKeyword) {
		CustomUtils.click(searchField1);
		CustomUtils.sendKeys(searchField2,searchKeyword);
		CustomUtils.verifyNotVisible(searchLoader);
		CustomUtils.click(autoSuggestion);
	}

	
	
	public void clickOnHamburger() {
		CustomUtils.click(hamburgerButton);
	}
	
	public void clickOnSignInButtonInHamburger() {
		CustomUtils.click(hamburgerSignInButton);
	}

}
