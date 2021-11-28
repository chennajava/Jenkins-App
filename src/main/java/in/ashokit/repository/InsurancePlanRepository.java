package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entities.InsurancePlan;

public interface InsurancePlanRepository extends JpaRepository<InsurancePlan, Serializable> {

}
