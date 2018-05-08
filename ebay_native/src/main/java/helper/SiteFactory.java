package helper;

import action.addToCartAction;
import action.checkoutAction;
import action.loginAction;
import action.productAction;
import action.searchAction;
import screens.cartScreen;
import screens.checkoutScreen;
import screens.homeScreen;
import screens.loginScreen;
import screens.productDetailScreen;
import screens.searchResultScreen;
import utils.CustomUtils;

/**
 * To register Screen/action class objects to overcome object creation multiple times
 */
public class SiteFactory {
	public SiteFactory() {
	}
	
	public cartScreen cartScreen(){
		return new cartScreen(this);
	}
	
	public checkoutScreen checkoutScreen(){
		return new checkoutScreen(this);
	}
	
	public homeScreen homeScreen(){
		return new homeScreen(this);
	}
	
	public loginScreen loginScreen(){
		return new loginScreen(this);
	}
	
	public productDetailScreen productDetailScreen(){
		return new productDetailScreen(this);
	}
	
	public searchResultScreen searchResultScreen(){
		return new searchResultScreen(this);
	}
	
	public productAction _ProductAction() {
		return new productAction(this);
	}
	
	public addToCartAction _AddToCartAction() {
		return new addToCartAction(this);
	}
	
	public searchAction _SearchAction() {
		return new searchAction(this);
	}
	
	public checkoutAction _CheckoutAction() {
		return new checkoutAction(this);
	}
	
	public loginAction _LoginAction() {
		return new loginAction(this);
	}
}
