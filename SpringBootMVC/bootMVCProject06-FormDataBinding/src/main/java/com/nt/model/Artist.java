package com.nt.model;

import lombok.Data;

@Data
public class Artist {
	
	private Integer aid;
	private String aname;
	private String addr;
	private String category;
	private Double fee=4000.00;
	
	
}
