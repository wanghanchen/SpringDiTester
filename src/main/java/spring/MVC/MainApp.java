package spring.MVC;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	static Logger log = Logger.getLogger(MainApp.class.getName());
	public static void main(String[] args){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
		log.info("Going to create HelloWorld obj");
		HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
		log.info("Exiting the program");
	}
}
