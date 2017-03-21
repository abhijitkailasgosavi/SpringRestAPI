package com.firstSpringAssignment.factory;

import org.springframework.stereotype.Component;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.model.Participants;

@Component
public class ParticipantsFactory {

	public Participants prepareModel(ParticipantsDetails participantsDetails){
		Participants participants = new Participants();
		
		participants.setId(participantsDetails.getId());
		participants.setFirst_name(participantsDetails.getFirst_name());
		participants.setLast_name(participantsDetails.getLast_name());
		participants.setEmail_id(participantsDetails.getEmail_id());
		participants.setPhone_no(participantsDetails.getPhone_no());
		participants.setBirth_date(participantsDetails.getBirth_date());
		participants.setGender(participantsDetails.getGender());
		participants.setSite_id(participantsDetails.getSite_id());
		participants.setAddress(participantsDetails.getAddress());
		
		return participants;
	}
	
	public ParticipantsDetails prepareParticipantsDetails(Participants participnats){
		ParticipantsDetails participantsdetails = new ParticipantsDetails();
		
	    participantsdetails.setId(participnats.getId());
		participantsdetails.setFirst_name(participnats.getFirst_name());
		participantsdetails.setFirst_name(participnats.getLast_name());
		participantsdetails.setEmail_id(participnats.getEmail_id());
		participantsdetails.setPhone_no(participnats.getPhone_no());
		participantsdetails.setBirth_date(participnats.getBirth_date());
		participantsdetails.setGender(participnats.getGender());
		participantsdetails.setSite_id(participnats.getSite_id());
		participantsdetails.setAddress(participnats.getAddress());
		
		return  participantsdetails;
	}
	
}
