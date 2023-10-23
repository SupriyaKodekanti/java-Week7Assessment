package com.infinite.VizagMuncipal.service;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.infinite.VizagMuncipal.model.Muncipal;
import com.infinite.VizagMuncipal.repository.MuncipalDaoImpl;
@Service
public class MuncipalServiceImpl implements MuncipalService{
	private static final Logger logger = Logger.getLogger(MuncipalServiceImpl.class);
	@Autowired MuncipalDaoImpl daoImpl;
	@Transactional
	public void login(Muncipal logindata) {
		// TODO Auto-generated method stub
		daoImpl.login(logindata);
	}
		
	@Transactional
	public List<Muncipal> getAllusers() {
		// TODO Auto-generated method stub
		return daoImpl.getAllusers();
	}


}
