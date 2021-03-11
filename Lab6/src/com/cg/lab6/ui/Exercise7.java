package com.cg.lab6.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Exercise7 {
	public static Object[] getSorted(int[] arr) {
		List<Integer> li =new ArrayList<>();
		for(int i:arr) {
			int r=0;
			while(i!=0) {
				int digit =i%10;
				r=r*10+digit;
				i/=10;
			}
			li.add(r);
		}
		Collections.sort(li);
		return li.toArray();
	}

	public static void main(String[] args) {
		int[] array= {1,67,35,90,23,4};
		Object obj[]=getSorted(array);
		for(Object o:obj) {
			System.out.println(o);
		}
	}

}
