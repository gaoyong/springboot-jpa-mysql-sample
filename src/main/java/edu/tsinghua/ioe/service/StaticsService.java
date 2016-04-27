package edu.tsinghua.ioe.service;

import java.util.List;

import edu.tsinghua.ioe.model.Statics;

public interface StaticsService {
	
	public void save(Statics s);
	
	public List<Statics> findAll();

}
