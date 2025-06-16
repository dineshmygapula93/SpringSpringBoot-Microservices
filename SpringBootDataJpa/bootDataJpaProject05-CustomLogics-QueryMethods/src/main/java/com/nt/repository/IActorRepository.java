package com.nt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

	// @Query("from Actor where fee >=?1 and fee<=?2")
	// @Query("from Actor where fee >=:min and fee<=:max")
	// public List<Actor> showActorsByFeeRange(@Param("min")Double start,
	// @Param("max")Double end);

	@Query("from Actor where fee >=:min and fee<=:max")
	public List<Actor> showActorsByFeeRange(Double min, Double max);

	@Query("from Actor where category in(:cat1,:cat2,:cat3)")
	public List<Actor> showActorsByCategory(String cat1, String cat2, String cat3);

	@Query("select aid , name ,addr from Actor where addr=:city")
	public List<Object[]> showActorsByAddr(String city);

	@Query("select name from Actor where fee between :start and :end order by name asc")
	public List<String> showActorsNameByFeeRange(double start, double end);

	@Query("from Actor where contactnumber=:mobile")
	public Optional<Actor> showActorByMobileNumber(Long mobile);

	@Query("select aid ,name ,contactnumber from Actor where contactnumber=:mobile")
	public Object showActorDataByMobileNumber(Long mobile);
	
	@Query("select name from Actor where contactnumber=:mobile")
	public String showActorNameByMobileNumber(Long mobile);
}
