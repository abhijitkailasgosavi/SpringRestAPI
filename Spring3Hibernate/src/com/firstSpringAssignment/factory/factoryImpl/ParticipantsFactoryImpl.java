package com.firstSpringAssignment.factory.factoryImpl;

import org.springframework.stereotype.Component;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.factory.ParticipantsFactory;
import com.firstSpringAssignment.model.Participants;

@Component
public class ParticipantsFactoryImpl implements ParticipantsFactory {

	@Override
	public Participants prepareModel(ParticipantsDetails participantsDetails){
		Participants participant = new Participants();
		
		participant.setId(participantsDetails.getId());
		participant.setFirstName(participantsDetails.getFirstName());
		participant.setLastName(participantsDetails.getLastName());
		participant.setEmailId(participantsDetails.getEmailId());
		participant.setPhoneNo(participantsDetails.getPhoneNo());
		participant.setBirthDate(participantsDetails.getBirthDate());
		participant.setGender(participantsDetails.getGender());
		participant.setSiteId(participantsDetails.getSiteId());
		participant.setAddress(participantsDetails.getAddress());
		
		return participant;
	}
	
	@Override
	public ParticipantsDetails prepareParticipantsDetails(Participants participnat){
		ParticipantsDetails participantsdetails = new ParticipantsDetails();
		
		participantsdetails.setId(participnat.getId());
		participantsdetails.setFirstName(participnat.getFirstName());
		participantsdetails.setLastName(participnat.getLastName());
		participantsdetails.setEmailId(participnat.getEmailId());
		participantsdetails.setPhoneNo(participnat.getPhoneNo());
		participantsdetails.setBirthDate(participnat.getBirthDate());
		participantsdetails.setGender(participnat.getGender());
		participantsdetails.setSiteId(participnat.getId());
		participantsdetails.setAddress(participnat.getAddress());
		
		return  participantsdetails;
	}
	
}
