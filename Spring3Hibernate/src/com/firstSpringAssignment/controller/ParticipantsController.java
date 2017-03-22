package com.firstSpringAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firstSpringAssignment.bean.ParticipantsDetails;
import com.firstSpringAssignment.model.Participants;
import com.firstSpringAssignment.service.ParticipantsService;

@Controller
@RequestMapping("/participants")
public class ParticipantsController {
	
	@Autowired
	private ParticipantsService participantsSvc;
	
		
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Participants> getListParicipants() {
	    List<Participants> list = participantsSvc.getListParticipants();
		   
	    return list;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public @ResponseBody Participants getParicipant(@PathVariable Long id) {
		Participants participant = participantsSvc.getParticipants(id);		
		
		return participant;
	}
	
	@RequestMapping(method = RequestMethod.POST )
	public @ResponseBody ParticipantsDetails addParticipants(@RequestBody ParticipantsDetails participantsDetails) {
		
		return  participantsSvc.addParticipants(participantsDetails);	    
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/{id}")
	public @ResponseBody ParticipantsDetails editParicipants(@RequestBody ParticipantsDetails participantsDetails,
		   @PathVariable Long id) {
		participantsDetails.setId(id);
	
		return participantsSvc.editParticipants(participantsDetails);	    
	}
	
	@RequestMapping( method = RequestMethod.DELETE, value = "/{id}")
	public @ResponseBody ParticipantsDetails deleteParticipants(@PathVariable Long id) {
		
		return participantsSvc.deleteParticipants(id);
	}
		
}
