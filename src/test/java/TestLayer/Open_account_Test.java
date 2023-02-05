package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PomPackage.Open_account;

public class Open_account_Test  extends BaseClass {
	Open_account O;
	public Open_account_Test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		O=new Open_account();
	}
	@Test
	public void checking_TC() throws InterruptedException {
		O.checking_account();
		
	}
	@Test
	public void savings_TC() throws InterruptedException {
		O.savings_account();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
}
	


