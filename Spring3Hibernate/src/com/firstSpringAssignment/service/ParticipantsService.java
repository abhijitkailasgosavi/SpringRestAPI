package com.firstSpringAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.firstSpringAssignment.dao.ParticipantsDao;
import com.firstSpringAssignment.model.Participants;

@Service("participantsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ParticipantsService {
    
	@Autowired
	private ParticipantsDao participantsDao;
	
	public List<Participants> getListParticipants() {
		System.out.println("in participants service");
		
		return participantsDao.listparticipants();
	}
	
    public Participants getParticipants(Long id) {
		
		return participantsDao.getparticipants(id);
	}

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addParticipants(Participants participants) {
    	System.out.println("in addparticipants service");
		participantsDao.addParticipants(participants);
	}
    
    public void deleteParticipants(Participants participants) {
		participantsDao.deleteParticipants(participants);
	}
    
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void editParticipants(Participants participants) {
    	System.out.println("in editparticipants service");
		participantsDao.editParticipants(participants);
	}
}
