package uits.jv1614.oop1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.text.*;
import java.util.Calendar;


public class Student {
 
    int id;
    String SurName;
    String Name;
    String MiddleName;
    Date birthday;
    String adress;
    int number;
    int Faculty;
    int course;
    int Group;
   
    
   public Student() throws ParseException{
      SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
        id = 1;        
      Name = "Василий"; 
      SurName = "Васильев";
     MiddleName = "Васильевич";
      Date date1 = dateformat3.parse("27/09/1993");
     // System.out.println("birthday: "+ dateformat3.format(date1));
    adress = "Барабашова 32" ;
       number = 3369012;
       Faculty = 3;
        course = 3;
      Group = 334;
    }

    public Student(int id){
        
         
      Name = "Василий"; 
        SurName = "Васильев";
       MiddleName = "Васильевич";
    
        adress = "Барабашова 32" ;
       number = 3369012;
      Faculty = 3;
      course = 3;
       Group = 334;
        
        
    }

    
}
