//DoctorMgmtServiceImpl.java
package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.DoctorEntity;
import com.nt.error.DoctorNotFoundException;
import com.nt.repository.IDoctorRepository;
import com.nt.vo.DoctorVO;

@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	@Autowired
	private  IDoctorRepository  doctorRepo;

	@Override
	public List<DoctorVO> findAllDoctors() {
		
		
		List<DoctorEntity>  listEntities=doctorRepo.findAll();  
		 
		List<DoctorVO>  listVO=new  ArrayList<DoctorVO>();
		listEntities.forEach(entity->{
			DoctorVO vo=new DoctorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;
	}
	
	@Override
	public String registerDoctor(DoctorVO vo) {
		
		DoctorEntity  entity=new DoctorEntity();
		BeanUtils.copyProperties(vo, entity);
		entity.setCreateBy(System.getProperty("user.name"));
		
		int idVal=doctorRepo.save(entity).getDid();
		return "Doctor is Registered with id value::"+idVal;
	}
	
	@Override
	public DoctorVO showDoctorById(int id) {
		
		DoctorEntity entity=doctorRepo.findById(id).orElseThrow(()->new DoctorNotFoundException("Invalid Id"));
	
		DoctorVO  vo=new DoctorVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
	
	@Override
	public String editDoctor(DoctorVO vo) {
		
		DoctorEntity entity=doctorRepo.findById(vo.getDid()).orElseThrow(()->new IllegalArgumentException("invalid id"));
		BeanUtils.copyProperties(vo, entity);
		entity.setUpdatedBy(System.getProperty("user.name"));
	
		 doctorRepo.save(entity);
		return  vo.getDid()+" Doctor Details are updated";
	}

	@Override
	public String removeDoctor(int did) throws Exception{
		DoctorEntity  entity=doctorRepo.findById(did).orElseThrow(()-> new DoctorNotFoundException("Invalid Doctor Id"));
	     doctorRepo.deleteById(did);
	     return  did+" id   Dotor is Deleted";
	}
	

}
