package com.nt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {
	
	public Iterable<Actor> findByCategoryEquals(String category);
	public Iterable<Actor> readByCategoryIs(String category);
	public List<Actor> getByCategory(String category);
	public List<Actor> findByFeeBetween(Double start,Double end);
	public List<Actor> findByNameStartingWith(String initchars);
	public List<Actor> findByNameEndingWith(String endchars);
	public List<Actor> findByNameContaining(String chars);
	public List<Actor> findByCategoryInOrderByCategoryAsc(Iterable<String> categories);
	public List<Actor> findByFeeBetweenAndAddrEquals(double start,double end,String addr);
	public List<Actor> findByNameLikeOrFeeLessThanEqual(String chars,Double fee);
	public Optional<Actor> findByContactnumberEquals(Long number);
}
