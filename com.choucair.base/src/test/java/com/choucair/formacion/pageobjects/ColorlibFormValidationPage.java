package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*; 

public class ColorlibFormValidationPage extends PageObject{
	
	//Campo Required	
		@FindBy(xpath="//INPUT[@id='req']")
		public WebElementFacade txtRequired;
		
	//Campo seleccion de deporte 1
		@FindBy(xpath="//SELECT[@id='sport']")
		public WebElementFacade cmdSport1;
		
	//Campo Multiple_Select
		@FindBy(xpath="//SELECT[@id='sport2']")
		public WebElementFacade cmdmultiselec;
		
	//Campo URL
		@FindBy(xpath="//INPUT[@id='url1']")
		public WebElementFacade txtUrl;
		
	//Campo email
		@FindBy(xpath="//INPUT[@id='email1']")
		public WebElementFacade txtEmail;
				
	//Campo Passtword1
		@FindBy(xpath="//INPUT[@id='pass1']")
		public WebElementFacade txtPass1;
				
	//Campo Passtword2
		@FindBy(xpath="//INPUT[@id='pass2']")
		public WebElementFacade txtPass2;
		
	//Campo minsize
		@FindBy(xpath="//INPUT[@id='minsize1']")
		public WebElementFacade txtminsize1;
						
	//Campo maxsize
		@FindBy(xpath="//INPUT[@id='maxsize1']")
		public WebElementFacade txtmaxsize;
						
	//Campo number
		@FindBy(xpath="//INPUT[@id='number2']")
		public WebElementFacade txtNumber;
				
	//Campo IP
		@FindBy(xpath="//INPUT[@id='ip']")
		public WebElementFacade txtIP;
				
	//Campo Date
		@FindBy(xpath="//INPUT[@id='date3']")
		public WebElementFacade txtDate;
				
	//Campo Date
		@FindBy(xpath="//INPUT[@id='past']")
		public WebElementFacade txtDateEarlier;		
		
	//Botón validate	
		@FindBy(xpath="(//INPUT[@type='submit'])[1]")
		public WebElementFacade btnValidate;
		
	//Globo Informativo	
		@FindBy(xpath="(//DIV[@class='formErrorContent'])[1]")
		public WebElementFacade globoInformativo;
		

public void Required (String datoPrueba) {
	txtRequired.click();
	txtRequired.clear();
	txtRequired.sendKeys(datoPrueba);
}
public void Select_Sport (String datoPrueba) {
	cmdSport1.click();
	cmdSport1.selectByVisibleText(datoPrueba);
}	
public void Multiple_Select (String datoPrueba) {
	cmdmultiselec.click();
	cmdmultiselec.selectByVisibleText(datoPrueba);
}	
public void url (String datoPrueba) {
	txtUrl.click();
	txtUrl.clear();
	txtUrl.sendKeys(datoPrueba);
}
public void email (String datoPrueba) {
	txtEmail.click();
	txtEmail.clear();
	txtEmail.sendKeys(datoPrueba);
}

public void password (String datoPrueba) {
	txtPass1.click();
	txtPass1.clear();
	txtPass1.sendKeys(datoPrueba);
}

public void Confirm_password (String datoPrueba) {
	txtPass2.click();
	txtPass2.clear();
	txtPass2.sendKeys(datoPrueba);
}

public void minimun_field_size (String datoPrueba) {
	txtminsize1.click();
	txtminsize1.clear();
	txtminsize1.sendKeys(datoPrueba);
}

public void maximun_field_size (String datoPrueba) {
	txtmaxsize.click();
	txtmaxsize.clear();
	txtmaxsize.sendKeys(datoPrueba);
}

public void Number(String datoPrueba) {
	txtNumber.click();
	txtNumber.clear();
	txtNumber.sendKeys(datoPrueba);
}

public void ip (String datoPrueba) {
	txtIP.click();
	txtIP.clear();
	txtIP.sendKeys(datoPrueba);
}

public void date3 (String datoPrueba) {
	txtDate.click();
	txtDate.clear();
	txtDate.sendKeys(datoPrueba);
}

public void date_earlier (String datoPrueba) {
	txtDateEarlier.click();
	txtDateEarlier.clear();
	txtDateEarlier.sendKeys(datoPrueba);

}

public void validate() {
	btnValidate.click();

}

public void form_sin_errores () {
	assertThat(globoInformativo.isCurrentlyVisible(), is(false));
	btnValidate.click();
}

public void form_con_errores () {
	assertThat(globoInformativo.isCurrentlyVisible(), is(true));
	btnValidate.click();
}
}




 	 