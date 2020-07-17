package com.xworkz.springmvc.calamities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springmvc.calamities.dto.NaturalCalamitiesDTO;

@Component
public class NaturalCalamitiesDaoImpl implements NaturalCalamitiesDao {

	private SessionFactory factory;
	
	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public NaturalCalamitiesDaoImpl(SessionFactory factory) {
		System.out.println("Created \t"+this.getClass().getSimpleName());
		this.factory = factory;
//		Configuration config=new Configuration();
//		config.configure("mysql.xml");
//		this.factory=config.buildSessionFactory();
	}
	
	public void create(NaturalCalamitiesDTO naturalCalamitiesDTO) {
		Session session = factory.openSession();
		try {
			System.out.println("Start: create method in NaturalCalamitiesDaoImpl "+naturalCalamitiesDTO);
			System.out.println("Factory " + factory);

			System.out.println("Starting transaction");
			Transaction transaction = session.beginTransaction();
			System.out.println("Saving " + naturalCalamitiesDTO);
			session.save(naturalCalamitiesDTO);
			transaction.commit();
			System.out.println("Committed Transaction");
			
		} catch (Exception e) {
			System.err.println("Exception in create method" + e.getMessage());
			session.getTransaction().rollback();
		}finally {
			System.out.println("Closing session");
			session.close();
		}
		System.out.println("End: create method in NaturalCalamitiesDaoImpl "+naturalCalamitiesDTO);
		
	}
	
}
