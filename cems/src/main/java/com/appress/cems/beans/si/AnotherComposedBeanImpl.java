package com.appress.cems.beans.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.appress.cems.beans.ci.SimpleBean;


public class AnotherComposedBeanImpl implements AnotherComposedBean {

	private SimpleBean simpleBean;
	
	private boolean complex;
	
	public AnotherComposedBeanImpl(@Value("true") boolean complex) {
		this.complex= complex;
	}
	
	@Autowired(required = false)
	public void setSimpleBean(SimpleBean simpleBean) {
		this.simpleBean = simpleBean;
	}

	public SimpleBean getSimpleBean() {
		return simpleBean;
	}

	public boolean isComplex() {
		return complex;
	}

	@Override
	public String getData() {
		return this.getSimpleBean() + " - " + this.isComplex();
	}
	
		
}
