package com.neusoft.wuyemis.baseinfo.model;

import lombok.Data;

//维修单位表
@Data
public class MaintainProviderModel {
	private int ProviderNO = 0;		//单位序号
	private String PName = null;		//单位名称
	private String PContact= null;		//联系人
	private String PAddress = null;		//单位地址
	private String PMobile = null;		//手机
	private String PTel= null;		//固定电话

}
