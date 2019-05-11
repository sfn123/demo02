package com.itmayiedu.controller;

import java.util.HashMap;
import java.util.Map;

public class demo01 {

	public Map<String,Object> gerMbr(){
		Map<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("errorCode", 200);
		hashMap.put("errorMsg", "蚂蚁金服");
		return hashMap;
	}
}
