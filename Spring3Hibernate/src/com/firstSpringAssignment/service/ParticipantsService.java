package com.firstSpringAssignment.service;

import java.util.List;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.model.Participants;

public interface ParticipantsService {

	List<Participants> getParticipants();

	Participants getParticipant(Long id);

	ParticipantsDetails addParticipant(ParticipantsDetails participantsDetails);

	ParticipantsDetails updateParticipant(ParticipantsDetails participantsDetails);

	ParticipantsDetails deleteParticipant(long id);

}