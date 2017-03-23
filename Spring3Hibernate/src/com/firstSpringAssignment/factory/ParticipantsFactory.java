package com.firstSpringAssignment.factory;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.model.Participants;

public interface ParticipantsFactory {

	Participants prepareModel(ParticipantsDetails participantsDetails);

	ParticipantsDetails prepareParticipantsDetails(Participants participnats);

}