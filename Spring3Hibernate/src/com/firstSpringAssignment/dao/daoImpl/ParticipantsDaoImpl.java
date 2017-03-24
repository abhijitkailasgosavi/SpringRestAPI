package com.firstSpringAssignment.dao.daoImpl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.firstSpringAssignment.dao.ParticipantsDao;
import com.firstSpringAssignment.model.Participants;

@Transactional
@Repository("participantsDao")
public class ParticipantsDaoImpl implements ParticipantsDao {

	@Autowired
	private SessionFactory sessionFactory;

	public ParticipantsDaoImpl(){
		System.out.println("Successfully loaded participants dao");
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Participants> getParticipants() {
		return (List<Participants>) sessionFactory.getCurrentSession().createCriteria(Participants.class).list();
	}

	@Override
	public Participants getParticipant(long id) {
		return (Participants) sessionFactory.getCurrentSession().get(Participants.class, id);
	}

	@Override
	public Participants addParticipant(Participants participant) {
		long id = (Long) sessionFactory.getCurrentSession().save(participant);

		return getParticipant(id);
	}

	@Override
	public Participants updateParticipant(Participants participant) {
		sessionFactory.getCurrentSession().update(participant);

		return getParticipant(participant.getId());
	}

	@Override
	public void deleteParticipant(Participants participant) {
		sessionFactory.getCurrentSession().delete(participant);
	}	

}
