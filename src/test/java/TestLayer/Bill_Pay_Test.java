package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PomPackage.Bill_Pay;

public class Bill_Pay_Test extends BaseClass{
	Bill_Pay B;
	public Bill_Pay_Test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		B=new Bill_Pay();
	}
	@Test
	public void bill_pay_TC() throws InterruptedException {
		B.billpay();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
