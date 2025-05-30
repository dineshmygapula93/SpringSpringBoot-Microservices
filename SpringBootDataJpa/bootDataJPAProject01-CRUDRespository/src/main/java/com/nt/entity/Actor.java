package com.nt.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "JPA_ACTOR_INFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Actor {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "AID", length = 30)
	private Integer aid;

	@Column(name = "ANAME", length = 30)
	@Nonnull
	private String name;

	@Column(name = "ADDR", length = 30)
	@Nonnull
	private String addr;

	@Column(name = "CATEGORY", length = 30)
	@NonNull
	private String category;

	@Column(name = "CONTACT_NO", length = 30)
	@NonNull
	private Long contactnumber;

	@Column(name = "FEE", length = 30)
	@NonNull
	private Double fee;
}
