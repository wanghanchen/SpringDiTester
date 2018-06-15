package com.cookie.SpringEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args){
		//Spring 依赖注入
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor)context.getBean("textEditor");
		te.spellCheck();
		
		//注入集合
		/*JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();*/
	}
}
