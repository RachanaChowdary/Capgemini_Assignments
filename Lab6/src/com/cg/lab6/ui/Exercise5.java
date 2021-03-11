package com.cg.lab6.ui;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {
	public static int getSecondSmallest(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i:arr){
			list.add(i);
			}
		
		Collections.sort(list);
		return list.get(1);
		}
	public static void main(String[] args) {
		int[] arr= {1,7,9,5,6};
		System.out.println(getSecondSmallest(arr));
		}
}
