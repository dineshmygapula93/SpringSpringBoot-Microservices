package com.nt.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActorDetails {
	private int aid;
	private String aname;
	private Address address;
	private boolean isSingle;	
	private long mobilenumber;
	private LocalDate dob;
	private LocalTime tob;
	private LocalDateTime launchdatatime;
	private String[] favColor;
	private List<String> friends;
	private Set<Long> phoneNumber;
	private Map<String ,Object> idDetails;
	
}
