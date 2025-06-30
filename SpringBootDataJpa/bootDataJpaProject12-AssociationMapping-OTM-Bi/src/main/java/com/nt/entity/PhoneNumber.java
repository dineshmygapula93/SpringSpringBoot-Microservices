package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "jpa_phonenumber")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "regno", initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.AUTO)
	private Integer regno;
	@NonNull
	@Column(length = 30)
	private Long phonenumber;
	@NonNull
	@Column(length = 30)
	private String provider;
	@NonNull
	@Column(length = 30)
	private String type;
	@ManyToOne(targetEntity = Customer.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "Cust_No", referencedColumnName = "CNO")
	private Customer cust;

	public PhoneNumber() {
		System.out.println("PhoneNumber.PhoneNumber() 0 Args Constrcutor");
	}

	@Override
	public String toString() {
		return "PhoneNumber [regno=" + regno + ", phonenumber=" + phonenumber + ", provider=" + provider + ", type="
				+ type + "]";
	}
}
