package com.appress.cems.beans.db;

import com.appress.cems.beans.ci.SimpleBean;

public class DependentBeanImpl implements DependentBean {

	private SimpleBean simpleBean;
	
	public DependentBeanImpl(SimpleBean simpleBean) {
		this.simpleBean= simpleBean;
	}

	@Override
	public void simpleGreeting() {
		System.out.println(simpleBean.toString());
		
	}
}
