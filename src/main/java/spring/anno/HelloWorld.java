package spring.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {

	private String message;
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		System.out.println("Your message :" + message);
		return message;
	}
	@PostConstruct
	public void init(){
		System.out.println("Bean is going through init.");
	}
	@PreDestroy
	public void destory(){
		System.out.println("Bean will destory now.");
	}
}
