package edu.tsinghua.ioe.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.tsinghua.ioe.model.Statics;
import edu.tsinghua.ioe.service.StaticsService;

@EnableAutoConfiguration
@RestController
@RequestMapping("/dbc/api/statics")
@CrossOrigin
public class StaticsController {
	@Autowired 
	private StaticsService staticsService;

	private static Logger logger = Logger.getLogger(StaticsController.class);
	
	@RequestMapping(value = "/addone")
	public String  addPv() {
		Statics s = new Statics();
		s.setFav(0L);
		s.setRefid("testDirId");
		s.setType(1);
		s.setPv(0L);
		s.setPraise(666L);
		staticsService.save(s);
		return s.getId().toString();
	}
	
	@RequestMapping(value = "/all")
	public List<Statics>  allStatics() {
		logger.debug("get all statics ");
		return staticsService.findAll();
	}
}
