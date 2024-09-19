package springjpa.main;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springjpa.domain.Person;
import springjpa.service.PersonService;

public class PersonMain {
	
	private PersonService personService;
	
	public ApplicationContext context = new GenericXmlApplicationContext("classpath:/springjpa/conf/applicationContext.xml");
	
	
	public static void main(String[] args) {
		
		PersonMain personMain = new PersonMain();
		
		personMain.personService = (PersonService)personMain.context.getBean("personService", PersonService.class);
	
	
	try {
        // insertPerson
        Person person = new Person(0, "홍길동", 20, null);
        personMain.personService.insertPerson(person);
        
        // getPersonList
        //System.out.println(pm.personService.getPersonList());
        
        // getPerson
        //System.out.println(pm.personService.getPerson(1));
        
        // updatePerson
        //Person person = new Person(1, "권율", 50, null);
        //pm.personService.updatePerson(person);
        
        // deletePerson
        //pm.personService.deletePerson(1);
		
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	}

}//class
