package com.firstSpringAssignment.controller;

import java.util.List;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.model.Participants;

public interface ParticipantsController {

	List<Participants> getListParicipants();

	Participants getParicipant(Long id);

	ParticipantsDetails addParticipants(ParticipantsDetails participantsDetails);

	ParticipantsDetails editParicipants(ParticipantsDetails participantsDetails, Long id);

	ParticipantsDetails deleteParticipants(Long id);

}