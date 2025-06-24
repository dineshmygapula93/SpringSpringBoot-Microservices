package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Job_Seeker")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class JobSeeker {

	@SequenceGenerator(name = "gen1", sequenceName = "jid_number", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Id
	private Integer jid;
	@Column(length = 30)
	@NonNull
	private String jname;
	@Column(length = 30)
	@NonNull
	private String jaddr;
	@Column
	@NonNull
	private boolean indian;
	@Lob
	@Column(length = 20000)
	@NonNull
	private char[] resume;
	@Lob
	@Column(length=20000)
	@NonNull
	private byte[] photo;
}
