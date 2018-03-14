package gr.pr.udemy.spring.annotations.Beans;

import org.springframework.stereotype.Component;

@Component
public class TennisCoachDailyWorkout implements DailyWorkoutService {
	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
}
