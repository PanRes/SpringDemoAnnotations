package gr.pr.udemy.spring.annotations.Main;

import gr.pr.udemy.spring.annotations.Beans.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsMainApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach coach = context.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}
}