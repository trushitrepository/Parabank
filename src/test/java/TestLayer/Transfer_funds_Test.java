package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PomPackage.Transfer_funds;

public class Transfer_funds_Test extends BaseClass {
	Transfer_funds T;
	public Transfer_funds_Test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		T=new Transfer_funds();
	}
	@Test
	public void Transfer_funds_TC () throws InterruptedException {
		T.transfer_funds();
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
