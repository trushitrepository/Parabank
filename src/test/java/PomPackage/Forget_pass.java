package PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class Forget_pass extends BaseClass {
	@FindBy(xpath = "//a[contains(text(),'Forgot login info?')]")
	public WebElement Forget_link;
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement First_name ;
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement Last_name ;
	@FindBy(xpath="//input[@id='address.street']")
	public WebElement Address ;
	@FindBy(xpath="//input[@id='address.city']")
	public WebElement City ;
	@FindBy(xpath="//input[@id='address.state']")
	public WebElement State ;
	@FindBy(xpath="//input[@id='address.zipCode']")
	public WebElement Zip_code ;
	@FindBy(xpath="//input[@id='ssn']")
	public WebElement Ssn;
	@FindBy(xpath="//tbody/tr[8]/td[2]/input[1]")
	public WebElement Find_button;
	
	public Forget_pass() {
		PageFactory.initElements(driver, this);
	}
	 public void forget_pass() throws InterruptedException {
		Forget_link.click();
		Thread.sleep(2000);
		First_name.sendKeys("Trushit");
		Last_name.sendKeys("Patel");
		Address.sendKeys("23 marsha drive");
		City.sendKeys("scarborough");
		State.sendKeys("Ontario");
		Zip_code.sendKeys("M1T 2S3");
		Ssn.sendKeys("123456789");
		Find_button.click();
		Thread.sleep(10000);
		
		 
	 }
	

}
