package org.ramon.dao;

import java.util.ArrayList;
import java.util.List;

import org.ramon.model.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class jdbcPersonaDao implements personaDao {
	private static ApplicationContext context;
	static String file="org/ramon/resources/Persona.xml";
	
	public jdbcPersonaDao(){
		context = new ClassPathXmlApplicationContext(file);
	}
	
	@Override
	public List<Persona> getPersonas() {
		// TODO Auto-generated method stub
		List<Persona>misPersonas=new ArrayList<Persona>();
		Persona p=(Persona)context.getBean("person1");
		Persona p1=(Persona)context.getBean("person2");
		Persona p2=(Persona)context.getBean("person3");
		misPersonas.add(p);
		misPersonas.add(p1);
		misPersonas.add(p2);
		return misPersonas;
	}

}
