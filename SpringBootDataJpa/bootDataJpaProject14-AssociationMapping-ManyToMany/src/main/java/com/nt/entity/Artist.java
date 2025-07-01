package com.nt.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "jpa_mtm_artist")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Artist {
	
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "aid_seq", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer aid;
	
	@Column(length = 30)
	@NonNull
	private String aname;
	@Column(length = 30)
	@NonNull
	private String addr;
	@Column(length = 30)
	@NonNull
	private String category;
	@ManyToMany(targetEntity=Movie.class,cascade=CascadeType.ALL,fetch = FetchType.EAGER,mappedBy="artistinfo")
	private Set<Movie> moiveinfo =new HashSet<>();
	@Override
	public String toString() {
		return "Artist [aid=" + aid + ", aname=" + aname + ", addr=" + addr + ", category=" + category + "]";
	}
}
