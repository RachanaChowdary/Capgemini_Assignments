package com.cg.lab6.ui;

import java.util.HashMap;
import java.util.Set;
public class Exercise4
{
       public HashMap<String,String> getStudent(HashMap<String,Integer> stu)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = stu.keySet();
              for(String s:set)
              {
                     Integer marks = stu.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> stu = new HashMap<>();
              Exercise4 p = new Exercise4();
              stu.put("Rachana",65);
              stu.put("Sai",76);
              stu.put("Vijitha",89);
              stu.put("Christy",90);
              stu.put("Harika",93);
              System.out.println(p.getStudent(stu));
       }
}
