package com.appress.cems.beans.fi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.appress.cems.beans.ci.ComposedBean;
import com.appress.cems.beans.ci.SimpleBean;

@Component
public class BadComposedBean implements ComposedBean {

	@Autowired
	//@Qualifier("SimpleBeanQ")
	private SimpleBean simpleBean;
	
	private String code;
	private boolean complicated;
	
	public BadComposedBean(@Value("AB123") String code, @Value("true") 
		boolean complicated) {
		this.code= code;
		this.complicated= complicated;
	}

	public SimpleBean getSimpleBean() {
		return simpleBean;
	}

	public String getCode() {
		return code;
	}

	public boolean isComplicated() {
		return complicated;
	}
	
	
}
