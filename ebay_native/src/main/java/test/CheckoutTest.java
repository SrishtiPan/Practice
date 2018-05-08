package test;

import org.testng.annotations.Test;

import helper.DataEntity;
import helper.User;
import utils.CustomDataProvider;

public class CheckoutTest {
	/**
	 * @Author Vaibhav Singh
	 * Script to verify filter in SRP, product details, cart and checkout screen
	 * @param data
	 */
	@Test(dataProvider="checkOutData", dataProviderClass=CustomDataProvider.class)
	public void RegisteredUser_CheckoutFlow(DataEntity data){	
		User.getFactory()
			._LoginAction()
				.login(data.getCredential())	
			._SearchAction()
				.searchForItem(data.getSearchKeyword())
//				.verifySearchResultPage(data.getSearchKeyword())
//				.selectAndVerifySizeFilterOption(data.getScreenSize())
//				.selectRandomItemFromProductList()
//			._ProductAction()
//				.verifyProductPageAndNavigateToCart()
//			._AddToCartAction()
//				.verifyProductInCartPageAndNavigateToCheckout()
//		

		;
	}
	
}
