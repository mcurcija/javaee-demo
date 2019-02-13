package com.example.javeedemo.logic;

import javax.enterprise.inject.Default;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Default
public class WarpDrive implements Engine {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void start() {
		log.info("starting engine");
	}
}
