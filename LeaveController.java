package com.ifs.leave.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ifs.leave.model.Leave;
import com.ifs.leave.service.LeaveService;

@Controller
@RequestMapping(value="/leave")
public class LeaveController {

 @Autowired
 LeaveService leaveService;
 
 @RequestMapping(value="/list", method=RequestMethod.GET)
 public ModelAndView list(){
  ModelAndView model = new ModelAndView("leave/list");
  List<Leave> list = leaveService.listAllLeaves();
  model.addObject("list", list);
  
  return model;
 }
 
 @RequestMapping(value="/update/{id}", method=RequestMethod.GET)
 public ModelAndView update(@PathVariable("id") int id){
  ModelAndView model = new ModelAndView("leave/form");
  Leave leave = leaveService.findLeaveById(id);
  model.addObject("leaveForm", leave);
  
  return model;
 }
 
 @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
 public ModelAndView delete(@PathVariable("id") int id){
	 leaveService.deleteLeave(id);
  
  return new ModelAndView("redirect:/leave/list");
 }
 
 @RequestMapping(value="/add", method=RequestMethod.GET)
 public ModelAndView add(){
  ModelAndView model = new ModelAndView("leave/form");
  Leave leave = new Leave();
  model.addObject("leaveForm", leave);
  
  return model;
 }
 
 @RequestMapping(value="/save", method=RequestMethod.POST)
 public ModelAndView save(@ModelAttribute("leaveForm") Leave leave){
	 leaveService.saveOrUpdate(leave);
  
  return new ModelAndView("redirect:/leave/list");
 }
}