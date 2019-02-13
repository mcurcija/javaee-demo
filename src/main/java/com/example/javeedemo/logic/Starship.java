package com.example.javeedemo.logic;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Starship {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Inject
	private Engine engine;
	
	public void start() {
		log.info("starting");
		engine.start();
	}
	
	public String getInfo() {
		return engine.getClass().getSimpleName();
	}
	
}
