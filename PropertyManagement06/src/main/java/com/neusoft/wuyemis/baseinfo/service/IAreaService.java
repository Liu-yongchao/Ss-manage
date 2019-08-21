package com.neusoft.wuyemis.baseinfo.service;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.AreaModel;

public interface IAreaService {
	public void regster(AreaModel areaModel) throws Exception;
	
	public void modify(AreaModel areaModel) throws Exception;
	
	public void changePassword(AreaModel areaModel) throws Exception;
	
	public void delete(AreaModel areaModel) throws Exception;
	//返回列表
	public List<AreaModel> getListByAll() throws Exception;
	//返回单个
	public AreaModel getById(String AreaNO) throws Exception;

}
