//DoctorVO.java
package com.nt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class DoctorVO {
	
	private  Integer  did;
	@NonNull
	private   String   dname;
	@NonNull
	private   String    specialization;
	@NonNull
	private   Double  fee;
	private   String  qlfy="MBBS";
}
