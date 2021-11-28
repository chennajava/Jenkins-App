package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.InsurancePlanService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		InsurancePlanService planService = context.getBean(InsurancePlanService.class);
		planService.savePlan();
		context.close();

	}

}
