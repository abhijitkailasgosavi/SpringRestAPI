package com.firstSpringAssignment.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.firstSpringAssignment.model.Participants;


@Repository("participantsDao")
public class ParticipantsDaoImpl implements ParticipantsDao {
   
        @Autowired
	private SessionFactory sessionFactory;
    
		
	public ParticipantsDaoImpl(){
		System.out.println("Successfully loaded participants dao");
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Participants> listparticipants() {
		return (List<Participants>) sessionFactory.getCurrentSession().createCriteria(Participants.class).list();
	}
	
	@Override
	public Participants getparticipants(long id) {
		return (Participants) sessionFactory.getCurrentSession().get(Participants.class, id);
	}

	@Override
	public Participants addParticipants(Participants participant) {
		long id = (Long) sessionFactory.getCurrentSession().save(participant);
	
		return getparticipants(id);
	}
	
	@Override
	public Participants editParticipants(Participants participant) {
		sessionFactory.getCurrentSession().update(participant);
		
		return getparticipants(participant.getId());
	}
	
	@Override
	public void deleteParticipants(Participants participants) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Participants WHERE id = "+participants.getId()).executeUpdate();
		
	}	
	
}
