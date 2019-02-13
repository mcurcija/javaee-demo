package com.example.javeedemo.data;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@Stateful
public class EventDAO {
	
	@PersistenceContext(name="defaultPU", type = PersistenceContextType.EXTENDED)
	private EntityManager em;
	
	public EventEntity save(EventEntity eventEntity) {
		em.persist(eventEntity);
		return eventEntity;
	}
	
	public void delete(EventEntity eventEntity) {
		em.remove(eventEntity);
	}
	

	
}
