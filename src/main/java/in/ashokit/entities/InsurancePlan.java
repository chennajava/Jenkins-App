package in.ashokit.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "INSURANCE_PLANS")
@Data
public class InsurancePlan {
	@Id
	@GeneratedValue
	private Integer planId;
	private String planName;
	private String planStatus;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDate;

	@UpdateTimestamp
	@Column(insertable = true)
	private LocalDate updatedDate;

}
