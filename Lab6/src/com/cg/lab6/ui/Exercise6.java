package com.cg.lab6.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise6 {
	public static List<Integer> votersList(Map<Integer,Integer> k) {
		List<Integer> li=new ArrayList<>();
		Set<Integer>s=k.keySet();
		for(int i:s) {
			if(k.get(i)>=18) {
				li.add(i);
			}
		}
		return li;
	}

	public static void main(String[] args) {
		Map<Integer,Integer> ba =new HashMap<>();
		ba.put(10,6);
		ba.put(18,46);
		ba.put(19,76);
		ba.put(35,65);
		ba.put(13,5);
		ba.put(10, 32);
		System.out.println(votersList(ba));

	}

}
