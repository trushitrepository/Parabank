package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PomPackage.Forget_pass;

public class Forget_pass_Test extends BaseClass {
	Forget_pass F;
	public Forget_pass_Test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		F=new Forget_pass();
	}
	@Test
	public void forget_pass_TC() throws InterruptedException {
		F.forget_pass();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
