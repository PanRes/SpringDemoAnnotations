package gr.pr.udemy.spring.annotations.Main;

import gr.pr.udemy.spring.annotations.Beans.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeMain {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("yugiohCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}
}