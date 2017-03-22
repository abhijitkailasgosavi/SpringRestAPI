package com.firstSpringAssignment.dao;


import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.firstSpringAssignment.model.Participants;


@Repository("participantsDao")
public class ParticipantsDao {
   
        @Autowired
	private SessionFactory sessionFactory;
    
		
	public ParticipantsDao(){
		System.out.println("Successfully loaded participants dao");
	}
	
	@SuppressWarnings("unchecked")
	public List<Participants> listparticipants() {
		return (List<Participants>) sessionFactory.getCurrentSession().createCriteria(Participants.class).list();
	}
	
	public Participants getparticipants(long id) {
		return (Participants) sessionFactory.getCurrentSession().get(Participants.class, id);
	}

	
	public Participants addParticipants(Participants participant) {
		long id = (Long) sessionFactory.getCurrentSession().save(participant);
	
		return getparticipants(id);
	}
	
	public Participants editParticipants(Participants participant) {
		sessionFactory.getCurrentSession().update(participant);
		
		return getparticipants(participant.getId());
	}
	
	public void deleteParticipants(Participants participants) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Participants WHERE id = "+participants.getId()).executeUpdate();	
	}	
	
}
