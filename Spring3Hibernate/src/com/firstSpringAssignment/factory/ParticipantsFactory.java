package com.firstSpringAssignment.factory;

import org.springframework.stereotype.Component;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.model.Participants;

@Component
public class ParticipantsFactory {

	public Participants prepareModel(ParticipantsDetails participantsDetails){
		Participants participants = new Participants();
		
		participants.setID(participantsDetails.getID());
		participants.setFIRST_NAME(participantsDetails.getFIRST_NAME());
		participants.setLAST_NAME(participantsDetails.getLAST_NAME());
		participants.setEMAIL_ID(participantsDetails.getEMAIL_ID());
		participants.setPHONE_NO(participantsDetails.getPHONE_NO());
		participants.setBIRTH_DATE(participantsDetails.getBIRTH_DATE());
		participants.setGENDER(participantsDetails.getGENDER());
		participants.setSITE_ID(participantsDetails.getSITE_ID());
		participants.setADDRESS(participantsDetails.getADDRESS());
		
		return participants;
	}
	
	public ParticipantsDetails prepareParticipantsDetails(Participants participnats){
		ParticipantsDetails participantsdetails = new ParticipantsDetails();
		
	    participantsdetails.setID(participnats.getID());
		participantsdetails.setFIRST_NAME(participnats.getFIRST_NAME());
		participantsdetails.setFIRST_NAME(participnats.getLAST_NAME());
		participantsdetails.setEMAIL_ID(participnats.getEMAIL_ID());
		participantsdetails.setPHONE_NO(participnats.getPHONE_NO());
		participantsdetails.setBIRTH_DATE(participnats.getBIRTH_DATE());
		participantsdetails.setGENDER(participnats.getGENDER());
		participantsdetails.setSITE_ID(participnats.getSITE_ID());
		participantsdetails.setADDRESS(participnats.getADDRESS());
		
		return  participantsdetails;
	}
	
}
