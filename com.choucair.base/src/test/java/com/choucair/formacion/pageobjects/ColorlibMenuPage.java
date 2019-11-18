package com.choucair.formacion.pageobjects;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class ColorlibMenuPage extends PageObject {

//Menu forms
	@FindBy(xpath="(//A[@href='javascript:;'])[3]")
	public WebElement menuForms;
	
//Submenu form general
	@FindBy(xpath="(//A[@href='form-general.html'])[2]")
	public WebElement menuFormGenerals;
		
//Submenu form Validation
	@FindBy(xpath="(//A[@href='form-validation.html'])[2]")
	public WebElement menuFormValidation;
		
//form validation - label informativo Popup Validation
	@FindBy(xpath="//H5[text()='Popup Validation']")
	public WebElement lblFormValidation;
	
public void menuFormValidation() {
	menuForms.click();
	menuFormValidation.click();
	String strMensaje = lblFormValidation.getText();
	assertThat(strMensaje, containsString ("Popup Validation"));
	

}
}
