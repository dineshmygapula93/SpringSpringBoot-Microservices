package com.nt.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "jpa_Otm_customer")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class Customer {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "seq_cno", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer cno;
	@NonNull
	@Column(length = 30)
	private String cname;
	@NonNull
	@Column(length = 30)
	private String caddr;

	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL,mappedBy="cust",fetch = FetchType.EAGER)
	//@JoinColumn(name = "Cust_No", referencedColumnName = "cno")
	private Set<PhoneNumber> phones;

	public Customer() {
		System.out.println("Customer.Customer() 0-param constructor");
	}
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", caddr=" + caddr + "]";
	}

}
