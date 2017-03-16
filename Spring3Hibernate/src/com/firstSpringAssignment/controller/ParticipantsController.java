package com.firstSpringAssignment.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firstSpringAssignment.bean.ParticipantsBean;
import com.firstSpringAssignment.model.Participants;
import com.firstSpringAssignment.service.ParticipantsService;

@Controller
public class ParticipantsController {
	
	@Autowired
	private ParticipantsService participantsService;
	
	@RequestMapping("/")
	public String showFirstPage() {
		
		return "index";
	}
	
	@RequestMapping(value="/getParticipants/",method = RequestMethod.GET)
	public @ResponseBody List<Participants> getListParicipants() {
		
	    List<Participants> lst = participantsService.getListParticipants();
		
	    for(Participants part:lst)
			System.out.println("Particiapnts is "+part);
		
	    return lst;
	}
	
	@RequestMapping(value="/getParticipant/{id}",method = RequestMethod.GET)
	public @ResponseBody Participants getParicipant(@PathVariable Long id) {
		
		Participants participant = participantsService.getParticipants(id);		
		System.out.println(participant);
		
		return participant;
	}
	
	@RequestMapping(value="/addParticipants", method = RequestMethod.POST )
	public String addParicipants(@RequestBody ParticipantsBean participantBean) {
		System.out.println("in addparticipants controller");
		Participants participants = prepareModel(participantBean);
	    participantsService.addParticipants(participants);
	    System.out.println("particiapnts addes successfully");
		return "index";
	}
	
	@RequestMapping(value = "/deleteparticipants/{id}", method = RequestMethod.GET)
	public String deleteParticipants(@PathVariable Long id) {
		Participants participants = getParicipant(id);
		participantsService.deleteParticipants(participants);
		System.out.println("participants deleted"+ id);
		return "index";
	}
	
	private Participants prepareModel(ParticipantsBean participantsBean){
		Participants participants = new Participants();
		participants.setFirst_name(participantsBean.getFirst_name());
		participants.setLast_name(participantsBean.getLast_name());
		participants.setEmail_id(participantsBean.getEmail_id());
		participants.setPhone_no(participantsBean.getPhone_no());
		participants.setBirth_date(participantsBean.getBirth_date());
		participants.setGender(participantsBean.getGender());
		participants.setSite_id(participantsBean.getSite_id());
		participants.setAddress(participantsBean.getAddress());
		
		return participants;
	}
}
