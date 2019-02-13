package com.example.javeedemo.logic;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.interceptor.Interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Alternative
@Priority(Interceptor.Priority.APPLICATION)
public class TransWarpEngine implements Engine {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void start() {
		log.info("starting engine");
	}

}
