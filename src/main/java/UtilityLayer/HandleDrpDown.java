package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDrpDown extends BaseClass {

	public static void selectByVisibleText(WebElement wb , String value) {
		Select sle = new Select(wb);
		sle.selectByVisibleText(value);
	}
}
