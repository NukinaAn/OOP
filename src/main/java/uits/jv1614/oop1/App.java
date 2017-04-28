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
                
        Student stud2 = new Student(2);
        System.out.println("id: " + stud2.id);
        String b;
        b = stud2.Name + " " + stud2.SurName + " " + stud2.MiddleName + "\n" + stud2.adress;
        System.out.println(b);
        Date date2 = dateformat3.parse("15/05/1993");
        System.out.println("birthday: "+ dateformat3.format(date2));
        System.out.println("number: " + stud2.number);
        System.out.println("Faculty: " + stud2.Faculty);
        System.out.println("course: " + stud2.course);
        System.out.println("Group: " + stud2.Group);
        
        Student stud3 = new Student(3, 3352424);
        System.out.println("id: " + stud2.id);
        String c;
        c = stud3.Name + " " + stud3.SurName + " " + stud3.MiddleName + "\n" + stud3.adress;
        System.out.println(c);
        Date date3 = dateformat3.parse("18/08/1992");
        System.out.println("birthday: "+ dateformat3.format(date3));
        System.out.println("number: " + stud3.number);
        System.out.println("Faculty: " + stud3.Faculty);
        System.out.println("course: " + stud3.course);
        System.out.println("Group: " + stud3.Group);
    }
}
