package com.firstSpringAssignment.service;

import java.util.List;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.model.Participants;

public interface ParticipantsService {

	List<Participants> getListParticipants();

	Participants getParticipants(Long id);

	ParticipantsDetails addParticipants(ParticipantsDetails participantsDetails);

	ParticipantsDetails editParticipants(ParticipantsDetails participantsDetails);

	ParticipantsDetails deleteParticipants(long id);

}