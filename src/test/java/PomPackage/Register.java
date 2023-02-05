package PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BasePackage.BaseClass;

public class Register  extends BaseClass{
	@FindBy(linkText = "Register")
	public WebElement Register_link;
	@FindBy(xpath="//input[@id='customer.firstName']")
	public WebElement First_name ;
	@FindBy(xpath="//input[@id='customer.lastName']")
	public WebElement Last_name ;
	@FindBy(xpath="//input[@id='customer.address.street']")
	public WebElement Address ;
	@FindBy(xpath="//input[@id='customer.address.city']")
	public WebElement City ;
	@FindBy(xpath="//input[@id='customer.address.state']")
	public WebElement State ;
	@FindBy(xpath="//input[@id='customer.address.zipCode']")
	public WebElement Zip_code ;
	@FindBy(xpath="//input[@id='customer.phoneNumber']")
	public WebElement Phone;
	@FindBy(xpath="//input[@id='customer.ssn']")
	public WebElement Ssn;
	@FindBy(xpath="//input[@id='customer.username']")
	public WebElement Username ;
	@FindBy(xpath="//input[@id='customer.password']")
	public WebElement Password ;
	@FindBy(xpath="//input[@id='repeatedPassword']")
	public WebElement C_password ;
	@FindBy(xpath="//tbody/tr[13]/td[2]/input[1]")
	public WebElement R_button;
	
	
	
	
	
	public Register() {
		PageFactory.initElements(driver, this);
	}
	
	public void register() {
		Register_link.click();
		First_name.sendKeys("Trushit");
		Last_name.sendKeys("Patel");
		Address.sendKeys("23 marsha drive");
		City.sendKeys("scarborough");
		State.sendKeys("Ontario");
		Zip_code.sendKeys("M1T 2S3");
		Phone.sendKeys("1234567890");
		Ssn.sendKeys("123456789");
		Username.sendKeys("Trushit");
		Password.sendKeys("Trushit@12345");
		C_password.sendKeys("Trushit@12345");
		R_button.click();
	}
	

}
