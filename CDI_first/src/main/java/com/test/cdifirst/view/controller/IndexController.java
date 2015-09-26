package com.test.cdifirst.view.controller;

import java.io.Serializable;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

@Named("mybean")
@ConversationScoped
public class IndexController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String valor;
	private String valor1;
	private String name;

	public void listener(){
		setValor1(this.getValor());
		System.out.println("falor de "+ valor1);
	}
	
	public void proccess(){
		this.setName(this.getValor1());
		RequestContext.getCurrentInstance().update("ope");
	}
	
	public String getMessage(){
		return "Hola desde el bean";
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getValor1() {
		return valor1;
	}

	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}		
	
	
}
