package com.shop.myproject.shared;

import java.util.Date;
import com.google.appengine.api.datastore.*;



public class UserVerifier {
	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	
	public static boolean isSuccess(String uname, String pwd){
		Entity customer = new Entity("Customer");
		Date date = new Date();
		customer.setProperty("userName", uname);
		customer.setProperty("Password", pwd);
		customer.setProperty("Date Created", date);
	return true;
	}
}
