package action;

import helper.SiteFactory;

public class searchAction  extends SiteFactory {
	public SiteFactory sf;
	public searchAction(SiteFactory siteFactory) {
		this.sf=siteFactory;
	}

	/**
	 * search for item
	 * @param searchKeyword
	 * @return
	 */
	public searchAction searchForItem(String searchKeyword) {
		sf.homeScreen().searchForItem(searchKeyword);
		return this;
	}

	/**
	 * verify srp
	 */
	public searchAction verifySearchResultScreen(String searchKeyword) {
		sf.searchResultScreen().verifySearchResultScreen(searchKeyword);
		return this;
	}

	public searchAction selectAndVerifySizeFilterOption(String screenSize) {
		sf.searchResultScreen().selectAndVerifySizeFilterOption(screenSize);
		return this;
	}

	public searchAction selectRandomItemFromProductList() {
		sf.searchResultScreen().selectRandomItemFromProductList();
		return this;
	}

}
