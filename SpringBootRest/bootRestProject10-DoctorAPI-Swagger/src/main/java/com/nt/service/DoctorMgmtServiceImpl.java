package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.advice.DoctorNotFoundException;
import com.nt.entity.DoctorEntity;
import com.nt.repository.IDoctorRepository;
import com.nt.vo.DoctorVO;

@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	@Autowired
	private IDoctorRepository doctorRepo;

	@Override
	public String registerDoctor(DoctorVO vo) {

		DoctorEntity entity = new DoctorEntity();
		BeanUtils.copyProperties(vo, entity);
		entity.setCreateBy(System.getProperty("user.name"));

		int idVal = doctorRepo.save(entity).getDid();
		return "Doctor is saved with id value::" + idVal;
	}

	@Override
	public List<DoctorVO> showAllDoctors() {

		List<DoctorEntity> listEntities = doctorRepo.findAll();

		List<DoctorVO> listVO = new ArrayList();
		listEntities.forEach(entity -> {
			DoctorVO vo = new DoctorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;
	}

	@Override
	public List<DoctorVO> fetchDoctorsByFeeRange(double start, double end) {

		List<DoctorEntity> listEntities = doctorRepo.showDoctorsByFeeRange(start, end);

		List<DoctorVO> listVO = new ArrayList();
		listEntities.forEach(entity -> {
			DoctorVO vo = new DoctorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;
	}

	@Override
	public DoctorVO fetchDoctorById(int id) {

		DoctorEntity entity = doctorRepo.findById(id).orElseThrow(() -> new DoctorNotFoundException("Invalid id"));

		DoctorVO vo = new DoctorVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}

	@Override
	public String updateDoctorFeeById(int id, double percent) {

		DoctorEntity entity = doctorRepo.findById(id).orElseThrow(() -> new DoctorNotFoundException("Invalid id"));

		entity.setFee(entity.getFee() + entity.getFee() * (percent / 100.0));

		doctorRepo.save(entity);
		return id + " doctor fee is  updated :: " + entity.getFee();
	}

	@Override
	public String updateDoctor(DoctorVO vo) {

		DoctorEntity entity = doctorRepo.findById(vo.getDid())
				.orElseThrow(() -> new DoctorNotFoundException("Invalid id"));

		BeanUtils.copyProperties(vo, entity);
		doctorRepo.save(entity);
		return "Doctor obj is updated";
	}

	@Override
	public String removeDoctorsByFeeRange(double start, double end) {

		int count = doctorRepo.deleteDoctorsByFeeRange(start, end);
		return count == 0 ? "Doctors not found for Deletion" : "Doctors found and Deleted";
	}

}
