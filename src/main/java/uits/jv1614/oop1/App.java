package uits.jv1614.oop1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class App {
    public static void main (String[] args) throws ParseException {
         SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
        Student stud = new Student();
        System.out.println("id: " + stud.id);
        String a;
        a = stud.Name + " " + stud.SurName + " " + stud.MiddleName + "\n" + stud.adress;
        System.out.println(a);
        Date date1 = dateformat3.parse("27/09/1993");
        System.out.println("birthday: "+ dateformat3.format(date1));
        System.out.println("number: " + stud.number);
        System.out.println("Faculty: " + stud.Faculty);
        System.out.println("course: " + stud.course);
        System.out.println("Group: " + stud.Group);
                
       
        
    }
}
