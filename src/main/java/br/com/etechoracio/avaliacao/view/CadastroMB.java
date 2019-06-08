package br.com.etechoracio.avaliacao.view;


import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@Getter
@Setter
@Controller
@Scope("Soft")

public class CadastroMB {
	 private String message;
	 
	    public String getMessage() {
	        return message;
	    }
	 
	    public void setMessage(String message) {
	        this.message = message;
	    }
	     
	    public void saveMessage() {
	        FacesContext context = FacesContext.getCurrentInstance();
	         
	        context.addMessage(null, new FacesMessage("Successful",  "Your message: " + message) );
	    }
}
