package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PomPackage.Update_contact;

public class Update_contact_Test  extends BaseClass{
	
	Update_contact U;
	public Update_contact_Test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiation();
		U=new Update_contact();
	}
	@Test
	public void update_contact_TC() throws InterruptedException {
		U.update_contact();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}
