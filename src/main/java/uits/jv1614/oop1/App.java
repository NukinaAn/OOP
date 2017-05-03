package uits.jv1614.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
     public static void main(String[] args) throws ParseException {
    
         Student stud = new Student (1, "Петр" , "Петров", "Петрович",  "Барабашова 32", 3356423, 4, 4, 443);
            System.out.println(stud);
          
         Student stud1 = new Student();
            System.out.println(stud1);
         
         Student stud3 = new Student (3, "Иван" , "Иванов", "Иванович",  "Советская 67", 3364398, 3, 2, 323);
            System.out.println(stud3);
            
         Student stud4 = new Student (4, "Евгений" , "Жмуркин", "Андреевич",  "Герое Труда 7", 3367498, 3, 2, 323);
            System.out.println(stud4);
         
         Student stud5 = new Student (5, "Николай" , "Кукушкин", "Адольфович",  "Блюхера 13", 3364398, 6, 4, 645);
            System.out.println(stud5);
            
         Student stud6 = new Student (6, "Василий" , "Мышкин", "Олегович",  "Академика Павлова 9", 3364398, 6, 4, 645);
            System.out.println(stud6);
     }
   }
