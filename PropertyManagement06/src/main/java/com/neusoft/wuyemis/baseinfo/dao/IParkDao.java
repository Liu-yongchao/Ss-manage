package com.neusoft.wuyemis.baseinfo.dao;

import java.util.List;

import com.neusoft.wuyemis.baseinfo.model.ParkModel;

public interface IParkDao {
	public void create(ParkModel parkModel) throws Exception;
	public void update(ParkModel parkModel) throws Exception;
	public void delete(ParkModel parkModel) throws Exception;
	public List<ParkModel> selectListByAll() throws Exception;

}
