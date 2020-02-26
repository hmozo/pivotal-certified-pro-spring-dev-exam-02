package com.appress.cems.beans.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComposedBeanImpl implements ComposedBean {
	private SimpleBean simpleBean;
	private String code;
	private boolean complicated;
	
	public ComposedBeanImpl(SimpleBean simpleBean, 
			@Value("AB123") String code, @Value("true") boolean complicated) {
		this.simpleBean= simpleBean;
		this.code= code;
		this.complicated= complicated;
	}

	@Override
	public SimpleBean getSimpleBean() {
		return simpleBean;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public boolean isComplicated() {
		return complicated;
	}
	
	
}
