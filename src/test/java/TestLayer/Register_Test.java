package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PomPackage.Register;

public class Register_Test extends BaseClass {

	Register R;
	public Register_Test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		R=new Register();
	}
	@Test
	public void Register_TC() throws InterruptedException {
		Thread.sleep(2000);
		R.register();
		Thread.sleep(4000);
		
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}

