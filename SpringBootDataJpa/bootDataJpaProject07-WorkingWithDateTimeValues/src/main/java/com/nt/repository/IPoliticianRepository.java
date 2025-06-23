package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Politician;

public interface IPoliticianRepository extends JpaRepository<Politician ,Long> {
	
	@Query(nativeQuery=true,value="SELECT TRUNC((SYSDATE - dob) / 365.25) AS age FROM POLITICAIN WHERE pid = :id")
	public float getpoliticianageById(int id);
}
