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
@RequestMapping("/Participants")
public class ParticipantsController {
	
	@Autowired
	private ParticipantsService participantsSvc;
	
		
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Participants> getListParicipants() {
		
	    List<Participants> list = participantsSvc.getListParticipants();
		
	    for(Participants part:list) {
			System.out.println("Particiapnts is " + part);
	    }
	    
	    return list;
	}
	
	@RequestMapping(method = RequestMethod.GET,value="/{id}")
	public @ResponseBody Participants getParicipant(@PathVariable Long id) {
		Participants participant = participantsSvc.getParticipants(id);		
		System.out.println(participant);
		
		return participant;
	}
	
	@RequestMapping(method = RequestMethod.POST )
	public @ResponseBody ParticipantsDetails addParticipants(@RequestBody ParticipantsDetails participantsDetails) {
		System.out.println("in addparticipants controller");
	    
		return  participantsSvc.addParticipants(participantsDetails);	    
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody ParticipantsDetails editParicipants(@RequestBody ParticipantsDetails participantsDetails) {
		System.out.println("in editparticipants controller");
	
		return participantsSvc.editParticipants(participantsDetails);	    
	}
	
	@RequestMapping( method = RequestMethod.DELETE,value = "/{id}")
	public @ResponseBody String deleteParticipants(@PathVariable Long id) {
		participantsSvc.deleteParticipants(id);
		System.out.println("participants deleted"+ id);
		
		return "index";
	}
		
}
