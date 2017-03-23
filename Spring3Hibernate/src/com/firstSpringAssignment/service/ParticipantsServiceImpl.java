package com.firstSpringAssignment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.dao.ParticipantsDao;
import com.firstSpringAssignment.factory.ParticipantsFactory;
import com.firstSpringAssignment.model.Participants;

@Service("participantsService")
public class ParticipantsServiceImpl implements ParticipantsService {
    
	@Autowired
	private ParticipantsDao participantsDao;
	
	@Autowired
	private ParticipantsFactory participantsFactory;
	
	@Override
	public List<Participants> getListParticipants() {
		
		return participantsDao.listparticipants();
	}
	
        @Override
	public Participants getParticipants(Long id) {
		
		return participantsDao.getparticipants(id);
	}

        @Override
	public ParticipantsDetails addParticipants(ParticipantsDetails participantsDetails) {
    	        Participants participants = participantsFactory.prepareModel(participantsDetails);
		Participants newParticipants = participantsDao.addParticipants(participants);
		
		return participantsFactory.prepareParticipantsDetails(newParticipants);
	}
    
        @Override
	public ParticipantsDetails editParticipants(ParticipantsDetails participantsDetails) {
    		Participants participants = participantsFactory.prepareModel(participantsDetails);
    		Participants newParticipants = participantsDao.editParticipants(participants);
    	
    		return participantsFactory.prepareParticipantsDetails(newParticipants);
	}
    
    	@Override
	public ParticipantsDetails deleteParticipants(long id) {
    		Participants participants = getParticipants(id);
		participantsDao.deleteParticipants(participants);
		
		return participantsFactory.prepareParticipantsDetails(participants);
	}
    
}
