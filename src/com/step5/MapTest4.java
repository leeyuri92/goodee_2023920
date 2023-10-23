package com.step5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {
		List<Map<String, Object>> deptList = new ArrayList();
		Map<String, Object> map = new HashMap<>(); 
		map.put("DEPTNO",10);
		map.put("DNAME","영업부");
		deptList.add(map);
		map =null;
		map = new HashMap<>(); 
		map.put("LOC","부산");
		deptList.add(map);
		
		map = new HashMap<>(); 
		map.put("DEPTNO",20);
		map.put("DNAME","개발부");
		map.put("LOC","대구");
		deptList.add(map);
		System.out.println(deptList);
	}
}
