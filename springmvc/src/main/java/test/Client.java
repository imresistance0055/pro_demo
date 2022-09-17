package test;

import org.hibernate.cfg.Configuration;

public class Client {
	
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		
		cfg.configure("resources/hibernate.cfg.xml");
		cfg.buildSessionFactory();
	}

}
