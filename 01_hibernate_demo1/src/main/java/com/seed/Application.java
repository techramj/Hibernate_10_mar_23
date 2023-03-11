package com.seed;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		
		System.out.println(sf);
	}

}
