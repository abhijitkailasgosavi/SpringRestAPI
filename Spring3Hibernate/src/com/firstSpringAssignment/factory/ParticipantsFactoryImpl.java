package com.firstSpringAssignment.factory;

import org.springframework.stereotype.Component;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.model.Participants;

@Component
public class ParticipantsFactoryImpl implements ParticipantsFactory {

	@Override
	public Participants prepareModel(ParticipantsDetails participantsDetails){
		Participants participants = new Participants();
		
		participants.setId(participantsDetails.getId());
		participants.setFirstName(participantsDetails.getFirstName());
		participants.setLastName(participantsDetails.getLastName());
		participants.setEmailId(participantsDetails.getEmailId());
		participants.setPhoneNo(participantsDetails.getPhoneNo());
		participants.setBirthDate(participantsDetails.getBirthDate());
		participants.setGender(participantsDetails.getGender());
		participants.setSiteId(participantsDetails.getSiteId());
		participants.setAddress(participantsDetails.getAddress());
		
		return participants;
	}
	
	@Override
	public ParticipantsDetails prepareParticipantsDetails(Participants participnats){
		ParticipantsDetails participantsdetails = new ParticipantsDetails();
		
	        participantsdetails.setId(participnats.getId());
		participantsdetails.setFirstName(participnats.getFirstName());
		participantsdetails.setLastName(participnats.getLastName());
		participantsdetails.setEmailId(participnats.getEmailId());
		participantsdetails.setPhoneNo(participnats.getPhoneNo());
		participantsdetails.setBirthDate(participnats.getBirthDate());
		participantsdetails.setGender(participnats.getGender());
		participantsdetails.setSiteId(participnats.getId());
		participantsdetails.setAddress(participnats.getAddress());
		
		return  participantsdetails;
	}
	
}
