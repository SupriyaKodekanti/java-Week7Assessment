package com.infinite.VizagMuncipal.repository;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Repository;
import com.infinite.VizagMuncipal.model.Muncipal;
@Repository
@EnableAsync(proxyTargetClass = true)
@EnableCaching(proxyTargetClass = true)
public class MuncipalDaoImpl implements IMuncipalDao {
	private static final Logger logger = Logger.getLogger(MuncipalDaoImpl.class);
	@Autowired
	SessionFactory sfactory;

	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}
	@Override
	public void login(Muncipal logindata) {
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		session.save(logindata);
		
	}
	@Override
	public List<Muncipal> getAllusers(){
		// TODO Auto-generated method stub
		Session session = this.sfactory.getCurrentSession();
		List<Muncipal> ls = session.createQuery("from Users").list();
		return ls;
	}

}
