package com.choucair.formacion.definition;
import com.choucair.formacion.steps.ColorlibFormValidationSteps;
import com.choucair.formacion.steps.PopupValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {
	
	
	@Given("^Atentico en colorlib con usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
	public void atentico_en_colorlib_con_usuario_y_contraseña(String Usuario, String clave) {
		PopupValidationSteps.login_Colorlib(Usuario, clave);
	}
	
	@Given("^ingreso a la funcionalidad forms validation$")
	public void ingreso_a_la_funcionalidad_forms_validation()  {  
		PopupValidationSteps.ingresar_form_validation();
		
	}

	@When("^Diligencioformulario Popup validation$")
	public void diligencioformulario_Popup_validation (DataTable dtDatosForm) {
		List<List<String>> data = dtDatosForm.raw();
	
		for(int i=1; i<data.size(); i++) {
			colorlibFormValidationSteps.diligenciar_popup_datos_tabla(data, i);
			
		}
	}

	@Then("^verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso() throws Throwable {  
		colorlibFormValidationSteps.Verificar_ingreso_datos_formulario_exitoso();
	}

	@Steps
	PopupValidationSteps PopupValidationSteps;{
	}	
	@Steps
	ColorlibFormValidationSteps colorlibFormValidationSteps;{


}

    }
