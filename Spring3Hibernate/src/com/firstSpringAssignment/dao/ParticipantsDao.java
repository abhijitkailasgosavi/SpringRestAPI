package com.firstSpringAssignment.dao;

import java.util.List;

import com.firstSpringAssignment.model.Participants;

public interface ParticipantsDao {

	List<Participants> listparticipants();

	Participants getparticipants(long id);

	Participants addParticipants(Participants participant);

	Participants editParticipants(Participants participant);

	void deleteParticipants(Participants participants);

}