package spring.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args){
		/*AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("AnnoBeans.xml");*/
		/*Student student = (Student)context.getBean("student");
		System.out.println("Name :" + student.getName());
		System.out.println("Age :" + student.getAge());*/
		
		/*TextEditor te = (TextEditor)context.getBean("textEditor");
		te.spellCheck();*/
		
		/*Profile profile = (Profile)context.getBean("profile");
		profile.printName();
		profile.printAge();*/
		
		/*HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		helloWorld.getMessage();
		context.registerShutdownHook();*/
		
		/*AbstractApplicationContext ctx = 
				new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World");
		helloWorld.getMessage();
		ctx.registerShutdownHook();
		TextEditor te = ctx.getBean(TextEditor.class);
		te.spellCheck();*/
		
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("AnnoBeans.xml");
		/*ctx.start();
		TextEditor obj = (TextEditor)ctx.getBean("textEditor");
		obj.spellCheck();
		ctx.stop();*/
		CustomEventPublisher cvp = (CustomEventPublisher)ctx.getBean("customEventPublisher");
		cvp.publish();
		cvp.publish();
	}
}
