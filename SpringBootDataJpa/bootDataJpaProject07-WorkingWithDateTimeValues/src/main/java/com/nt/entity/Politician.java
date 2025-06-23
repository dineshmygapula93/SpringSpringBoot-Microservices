package com.nt.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Politicain")
public class Politician {
	@SequenceGenerator(name="gen1",sequenceName="PID_SEQ",initialValue=100,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	@Id
	private Integer pid;
	@Column(length=30)
	private String pname;
	@Column(length=30)
	private String paddr;
	
	private LocalDate dob;
	
	private LocalTime tob;
	
	private LocalDateTime doj;	
}
