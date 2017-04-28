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
      id = 1;        
      Name = "Василий"; 
      SurName = "Васильев";
      MiddleName = "Васильевич";
      adress = "Барабашова 32" ;
      number = 3369012;
      Faculty = 3;
      course = 3;
      Group = 334;
    }

    public Student(int id){
        
      this.Name = "Петр"; 
      this.SurName = "Петренко";
      this.MiddleName = "Петрович";
      this.adress = "Героев Труда 88" ;
      this.number = 3365249;
      this.Faculty = 3;
      this.course = 3;
      this.Group = 334;
       
    }
    
    public Student(int id, int number){
        
      this.Name = "Олег"; 
      this.SurName = "Дурнев";
      this.MiddleName = "Анатольевич";
      this.adress = "Блюхера 21" ;
      this.Faculty = 4;
      this.course = 2;
      this.Group = 425;
     }
}
