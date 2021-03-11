package com.cg.lab2.ui;

import java.util.*;
public class Exercise1{
 public static void main(String[] args) {
  int[] ar = {4,3,5,1,2};
  System.out.println(SecondSmallest(ar));
 }

 static int SecondSmallest(int[] ar) {
  Arrays.sort(ar);
  return ar[1];
 }
}
