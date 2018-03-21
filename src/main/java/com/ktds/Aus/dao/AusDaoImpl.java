package com.ktds.Aus.dao;

import java.util.List;

import com.ktds.Aus.vo.AusVO;

public class AusDaoImpl implements AusDao{
	
	private List<AusVO> ausList;
	
	@Override
	public List<AusVO> sellectAll() {
		
		return ausList;
		
	}
	
	

}
