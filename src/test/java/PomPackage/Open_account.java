package PomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;

public class Open_account  extends BaseClass{
	
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]")
	public WebElement username;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]")
	public WebElement password;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")
	public WebElement L_button;
	@FindBy(xpath = "//a[contains(text(),'Open New Account')]")
	public WebElement Open_account_link;
	@FindBy(xpath = "//select[@id='type']")
	public WebElement Account_type;
	@FindBy(xpath = "//select[@id='fromAccountId']")
	public WebElement Funds;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/div[1]/div[1]/form[1]/div[1]/input[1]")
	public WebElement Open_button;
	
	
	
	public Open_account() {
		PageFactory.initElements(driver, this);
		
	}
	public void checking_account() throws InterruptedException {
		Thread.sleep(2000);
		username.sendKeys("Trushit");
		password.sendKeys("Trushit@12345");
		L_button.click();
		Thread.sleep(2000);
		Open_account_link.click();
		Thread.sleep(2000);
		Select type=new Select(Account_type);
		type.selectByIndex(0);
		Select Fund=new Select(Funds);
		Fund.selectByIndex(0);;
		Open_button.click();
		Thread.sleep(2000);
		
		
		
	}
	public void savings_account() throws InterruptedException {
		Thread.sleep(2000);
		username.sendKeys("Trushit");
		password.sendKeys("Trushit@12345");
		L_button.click();
		Thread.sleep(2000);
		Open_account_link.click();
		Thread.sleep(2000);
		Select type=new Select(Account_type);
		type.selectByIndex(1);
		Select Fund=new Select(Funds);
		Fund.selectByIndex(0);;
		Open_button.click();
		Thread.sleep(2000);
		
		
	}
	
}
