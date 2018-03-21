package com.ktds.Aus.service;

import java.util.List;

import com.ktds.Aus.dao.AusDao;
import com.ktds.Aus.vo.AusVO;

public class AusServiceImpl implements AusService{
	
	private AusDao ausDao;
	
	public void setHojooDao(AusDao ausDao) {
		this.ausDao = ausDao;
	}
	
	
	@Override
	public List<AusVO> getAll() {
		return ausDao.sellectAll();
	}

}
