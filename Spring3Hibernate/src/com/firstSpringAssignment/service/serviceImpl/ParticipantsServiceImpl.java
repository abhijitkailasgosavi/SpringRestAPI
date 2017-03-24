package com.firstSpringAssignment.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.dao.ParticipantsDao;
import com.firstSpringAssignment.factory.ParticipantsFactory;
import com.firstSpringAssignment.model.Participants;
import com.firstSpringAssignment.service.ParticipantsService;

@Service("participantsService")
public class ParticipantsServiceImpl implements ParticipantsService {

	@Autowired
	private ParticipantsDao participantsDao;

	@Autowired
	private ParticipantsFactory participantsFactory;

	@Override
	public List<Participants> getParticipants() {

		return participantsDao.getParticipants();
	}

	@Override
	public Participants getParticipant(Long id) {

		return participantsDao.getParticipant(id);
	}

	@Override
	public ParticipantsDetails addParticipant(ParticipantsDetails participantsDetails) {
		Participants participants = participantsFactory.prepareModel(participantsDetails);
		Participants newParticipant = participantsDao.addParticipant(participants);

		return participantsFactory.prepareParticipantsDetails(newParticipant);
	}

	@Override
	public ParticipantsDetails updateParticipant(ParticipantsDetails participantsDetails) {
		Participants participants = participantsFactory.prepareModel(participantsDetails);
		Participants newParticipant = participantsDao.updateParticipant(participants);

		return participantsFactory.prepareParticipantsDetails(newParticipant);
	}

	@Override
	public ParticipantsDetails deleteParticipant(long id) {
		Participants participant = getParticipant(id);
		participantsDao.deleteParticipant(participant);

		return participantsFactory.prepareParticipantsDetails(participant);
	}

}
