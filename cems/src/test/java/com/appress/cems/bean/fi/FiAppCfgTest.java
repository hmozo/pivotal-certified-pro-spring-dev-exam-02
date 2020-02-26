package com.appress.cems.bean.fi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.appress.cems.beans.ci.ComposedBean;
import com.appress.cems.config.FiAppCfg;

public class FiAppCfgTest {

	@Test
	void testSimpleBeans() {
		ConfigurableApplicationContext ctx= new AnnotationConfigApplicationContext(FiAppCfg.class);
		ComposedBean composedBean= ctx.getBean(ComposedBean.class);
		
		assertNotNull(composedBean);
		assertNotNull(composedBean.getSimpleBean());
		assertEquals("AB123", composedBean.getCode());
		assertTrue(composedBean.isComplicated());
		
		ctx.close();
	}
}
