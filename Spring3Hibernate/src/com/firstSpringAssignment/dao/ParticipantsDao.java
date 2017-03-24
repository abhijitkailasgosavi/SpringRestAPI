package com.firstSpringAssignment.dao;

import java.util.List;

import com.firstSpringAssignment.model.Participants;

public interface ParticipantsDao {

	List<Participants> getParticipants();

	Participants getParticipant(long id);

	Participants addParticipant(Participants participant);

	Participants updateParticipant(Participants participant);

	void deleteParticipant(Participants participants);

}