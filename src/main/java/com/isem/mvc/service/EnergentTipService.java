package com.isem.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.isem.mvc.dao.EnergentTipDao;
import com.isem.mvc.lov.Lov;
import com.isem.mvc.lov.LovDao;
import com.isem.mvc.model.EnergentTip;

@Service
public class EnergentTipService {
	@Autowired
	private EnergentTipDao dao;
	
	@Autowired
	private LovDao daoLov;
		
	public EnergentTip findById (Long id) {
		return dao.findById(id);
	}

	public List<EnergentTip> findAll () {
		return dao.findAll();
	}

	public Page<EnergentTip> findAll (Pageable pageRequest) {
		return dao.findAll(pageRequest);
	}
	
	public List<EnergentTip> findEnergentTipByBrojilo (Long id) {
		return dao.findEnergentTipByBrojilo(id);
	}
	
	public List<Lov> energentTipLov () {
		return daoLov.energentTipLov();
	}
	
	public List<Lov> energentTipLov (Long objId) {
		return daoLov.energentTipLov(objId);
	}
	
	public List<Lov> energentTipKotLov () {
		return daoLov.energentTipKotLov();
	}

	public EnergentTip save(EnergentTip obj) {
		return dao.save(obj);
	}

	public void delete (Long id) {
		dao.delete(id);
	}
}
