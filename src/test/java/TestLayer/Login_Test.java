package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PomPackage.Login;

public class Login_Test  extends BaseClass {
	Login L;
	public Login_Test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		L=new Login();
	}
	@Test
	public void login_TC() throws InterruptedException {
		Thread.sleep(2000);
		L.login();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
}
