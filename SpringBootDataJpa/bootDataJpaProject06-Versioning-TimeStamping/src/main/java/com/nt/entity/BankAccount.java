package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;

@Entity
@Table(name = "Bank_Account")
@Data
public class BankAccount {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "acc_id", initialValue = 10000, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen1")
	private long accNo;
	@Column(length = 30)
	private String AccountHolderName;

	private Double balance;
	@Column(length = 30)
	private String type;

	@Version
	private Integer updatecount;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime accountopenedOn;
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDateTime lastoperationOn;
}
