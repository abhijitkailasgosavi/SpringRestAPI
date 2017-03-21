package com.firstSpringAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.dao.ParticipantsDao;
import com.firstSpringAssignment.factory.ParticipantsFactory;
import com.firstSpringAssignment.model.Participants;

@Service("participantsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
public class ParticipantsService {
    
	@Autowired
	private ParticipantsDao participantsDao;
	
	@Autowired
	private ParticipantsFactory participantsFactory;
	
	public List<Participants> getListParticipants() {
		System.out.println("in participants service");
		
		return participantsDao.listparticipants();
	}
	
    public Participants getParticipants(Long id) {
		
		return participantsDao.getparticipants(id);
	}

    public ParticipantsDetails addParticipants(ParticipantsDetails participantsDetails) {
    	System.out.println("in addparticipants service");
    	Participants participants = participantsFactory.prepareModel(participantsDetails);
		Participants newParticipants = participantsDao.addParticipants(participants);
		
		return participantsFactory.prepareParticipantsDetails(newParticipants);
	}
    
    public ParticipantsDetails editParticipants(ParticipantsDetails participantsDetails) {
    	System.out.println("in editparticipants service");
    	Participants participants = participantsFactory.prepareModel(participantsDetails);
    	Participants newParticipants = participantsDao.editParticipants(participants);
    	
    	return participantsFactory.prepareParticipantsDetails(newParticipants);
	}
    
    public void deleteParticipants(long id) {
    	Participants participants = getParticipants(id);
		participantsDao.deleteParticipants(participants);
	}
    
}
