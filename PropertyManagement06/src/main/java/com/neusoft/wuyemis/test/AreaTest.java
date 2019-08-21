package com.neusoft.wuyemis.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class AreaTest {
	
	@RequestMapping("/add")
	public String add() throws Exception{
		return "增加成功";
	}

}
