package action;

import helper.DataEntity;
import helper.SiteFactory;

public class productAction  extends SiteFactory{
	SiteFactory sf;
	public productAction(SiteFactory siteFactory) {
		this.sf=siteFactory;
	}

	public productAction verifyProductDetailsAndNavigateToCart(DataEntity data) {
		sf.productDetailScreen().verifyProductDetailsAndNavigateToCart();
		sf.productDetailScreen().selectQuantity(data.getQuantity());
		return this;
	}
}

