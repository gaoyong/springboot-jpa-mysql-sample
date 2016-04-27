package edu.tsinghua.ioe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.tsinghua.ioe.dao.StaticsRepository;
import edu.tsinghua.ioe.model.Statics;

@Service
public class StaticsServiceImpl implements StaticsService {
	
	@Autowired
	private StaticsRepository staticsRepository;

	public void save(Statics s) {
		staticsRepository.save(s);
	}

	public List<Statics> findAll() {
		return staticsRepository.findAll();
	}

}
