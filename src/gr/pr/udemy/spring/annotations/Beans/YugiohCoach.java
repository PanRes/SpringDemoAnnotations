package gr.pr.udemy.spring.annotations.Beans;

import org.springframework.stereotype.Component;

@Component
public class YugiohCoach implements Coach {
	
	public String getDailyWorkout() {
		return "Believe in the Hearts of the Cards 50 times";
	}
}
