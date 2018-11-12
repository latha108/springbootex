package com.navya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("com/navya/Applicationcontext.xml");
	Employee em=(Employee) app.getBean("emp");
	System.out.println(em);
	Address ad=(Address) app.getBean("add");
	System.out.println(ad);

}
}