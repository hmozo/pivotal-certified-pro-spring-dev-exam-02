package com.appress.cems.beans.ci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleBeanImpl implements SimpleBean {
	
	private Logger logger= LoggerFactory.getLogger(SimpleBeanImpl.class);
	
	public SimpleBeanImpl() {
        logger.info("[SimpleBeanImpl instantiation]");
    }
    @Override
    public String toString() {
        return "SimpleBeanImpl{ code: " + hashCode() + "}";
    }
}
