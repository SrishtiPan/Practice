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

	public searchAction selectRandomItemFromProductList() {
		sf.searchResultScreen().selectRandomItemFromProductList();
		return this;
	}

}
