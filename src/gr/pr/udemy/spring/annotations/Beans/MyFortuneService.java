package gr.pr.udemy.spring.annotations.Beans;

import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements FortuneService {
	
	public String getDailyFortune() {
		return "Have a good Day";
	}
	
}
