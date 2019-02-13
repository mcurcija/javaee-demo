package com.example.javeedemo.logic;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.example.javeedemo.data.EventDAO;
import com.example.javeedemo.data.EventEntity;

@Stateless
public class EventService {

	@Inject
	private EventDAO eventDAO;
	
	public void store(Event event) {
		EventEntity eventEntity = new EventEntity();
		eventEntity.setName(event.name);
		eventDAO.save(eventEntity);
	}

	
}
