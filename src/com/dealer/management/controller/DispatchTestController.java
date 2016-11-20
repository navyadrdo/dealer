package com.dealer.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dealer.management.model.Dispatch;
import com.dealer.management.service.DispatchService;

@Controller
@RequestMapping(value="/dispatchtest")
public class DispatchTestController {
	@Autowired
	private DispatchService dispatchserviceimple;
	
	@RequestMapping(value="/dispatchsave",method=RequestMethod.POST)
	public String saveDispatch(){
	
		System.out.println("u r in save dispatch");
		return null;
	}

	@RequestMapping(value="/dispatchupdate",method=RequestMethod.POST)
	public String updateDispatch(){
	
		System.out.println("u r in save dispatch");
		return null;
	}
	
	@RequestMapping(value="/dispatchdelete",method=RequestMethod.POST)
	public String deleteDispatch(){
	
		System.out.println("u r in save dispatch");
		return null;
	}
	
	@RequestMapping(value="/dispatchsearch",method=RequestMethod.POST)
	public List searchDispatch(){
	
		System.out.println("u r in save dispatch");
		return null;
	}
	
	@RequestMapping(value="/getdispatch",method=RequestMethod.POST)
	public List getallDispatch(){
	
		System.out.println("u r in getall dispatch");
		return null;
	}

}
