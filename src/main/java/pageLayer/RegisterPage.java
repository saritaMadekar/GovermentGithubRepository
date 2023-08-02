package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDrpDown;
import UtilityLayer.UtilsClass;

public class RegisterPage extends BaseClass {

	@FindBy(name="ctl00$ContentPlaceHolder1$ddlTitle")
	private WebElement title;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtFName")
	private WebElement name;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtLName")
	private WebElement lastname;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtAddress")
	private WebElement address;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtAddress2")
	private WebElement address2;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtCity")
	private WebElement city;
	
	//drp
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlCountry")
	private WebElement country;
	
	//drp
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlState")
	private WebElement state;
	
	//drp
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlDistrict")
	private WebElement district;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtNationality")
	private WebElement nation;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPinCode")
	private WebElement pincode;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtEmail")
	private WebElement email;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPhoneNumber")
	private WebElement phoneno;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtMobileNum")
	private WebElement mobileno;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void registerPageFunctionality(String Title,String  fname, String lname, String add, String add2, String City1, String country1, String 
			State, String Dis, String nationtionality, String pin, String Email, String Phone , String Mobile) {
		
		HandleDrpDown.selectByVisibleText(title, Title);
		UtilsClass.sendKeys(name, fname);
		UtilsClass.sendKeys(lastname, lname);
		UtilsClass.sendKeys(address, add);
		UtilsClass.sendKeys(address2, add2);
		UtilsClass.sendKeys(city, City1);
		HandleDrpDown.selectByVisibleText(country, country1);
		HandleDrpDown.selectByVisibleText(state, State);
		HandleDrpDown.selectByVisibleText(district, Dis);
		UtilsClass.sendKeys(nation, nationtionality);
		UtilsClass.sendKeys(pincode, pin);
		UtilsClass.sendKeys(email, Email);
		UtilsClass.sendKeys(phoneno, Phone);
		UtilsClass.sendKeys(mobileno, Mobile);
		
		
	}
	
	
	
	
	
	
}
