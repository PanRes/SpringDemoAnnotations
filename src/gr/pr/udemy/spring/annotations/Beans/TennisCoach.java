package gr.pr.udemy.spring.annotations.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	FortuneService fortuneService;
	DailyWorkoutService dailyWorkoutService;
	
	public TennisCoach(DailyWorkoutService dailyWorkoutService) {
		this.dailyWorkoutService = dailyWorkoutService;
	}
	
	public String getDailyWorkout() {
		return dailyWorkoutService.getDailyWorkout();
	}
	
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	@Autowired
	public void blahBlah(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
