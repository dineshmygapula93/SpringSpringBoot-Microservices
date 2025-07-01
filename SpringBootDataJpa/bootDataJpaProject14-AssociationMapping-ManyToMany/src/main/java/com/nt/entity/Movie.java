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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
@Table(name = "jpa_mtm_moive")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "mid_seq", initialValue = 100, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer mid;

	@Column(length = 30)
	@NonNull
	private String mname;
	@Column(length = 30)
	@NonNull
	private String banner;
	@Column(length = 30)
	@NonNull
	private String industry;
	@ManyToMany(targetEntity=Artist.class,cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name= "jpa_mtm_artist_movie",joinColumns = @JoinColumn(name="Mvid",referencedColumnName = "mid"),inverseJoinColumns = @JoinColumn(name="artist_id",referencedColumnName = "aid"))
	private Set<Artist> artistinfo =new HashSet<>();
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", banner=" + banner + ", industry=" + industry + "]";
	}
}
