package StepDefination;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageLayer.RegisterPage;

public class RegisterPageTest extends BaseClass {

	@Given("user on Register page")
	public void user_on_register_page() {
	    initialization();
	}

	@When("enter valid user infomation")
	public void enter_valid_user_infomation() {

		RegisterPage page = new RegisterPage();
		page.registerPageFunctionality("Mrs.", "sarita", "more", "pune", "dubai", "osmanabad", "Albania", "BIHAR", "-Select-",
				"Indian", "987654", "sarita@gmail.com", "899913063", "1243765687");
	}
}
