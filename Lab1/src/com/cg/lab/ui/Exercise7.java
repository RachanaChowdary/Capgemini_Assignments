package com.cg.lab.ui;

import java.util.Scanner;
public class Exercise7{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println(checkNumber(a));
        s.close();
     }
     public static boolean checkNumber(int a){
         int m=10,r;
         while(a!=0){
             r=a%10;
             a=a/10;
             if(r>m){
                 return false;
             }
             m=r;
         }
         return true;
     }
}
