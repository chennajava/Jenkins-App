package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.entities.InsurancePlan;
import in.ashokit.repository.InsurancePlanRepository;

@Service
public class InsurancePlanService {
	private InsurancePlanRepository planRepo;

	public InsurancePlanService(InsurancePlanRepository planRepo) {
		super();
		this.planRepo = planRepo;
	}

	public void savePlan() {
		InsurancePlan plan = new InsurancePlan();
		plan.setPlanName("SNAF");
		plan.setPlanStatus("DN");
		planRepo.save(plan);

	}
}
