package com.example.javeedemo.logic;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith(CdiTestRunner.class)
public class StarshipTest {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Inject
	private Starship cut;
	
	@Test
	public void start() {
		cut.start();
		log.info(cut.getInfo());
		// with beans.xml TransWarpEngine alternative 
		assertTrue(cut.getInfo().startsWith("TransWarpEngine"));
		// without beans.xml alternative
//		assertTrue(cut.getInfo().startsWith("WarpDrive"));
	}

}
