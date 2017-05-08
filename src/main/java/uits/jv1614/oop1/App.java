package uits.jv1614.oop;

import java.text.ParseException;
import java.util.Date;


public class App {
     public static void main(String[] args) {
         
     }
         static void studens() throws ParseException{
             
         Student[] stud = new Student[6];
         stud [0] = new Student(1, "Петр" , "Петров", "Петрович", new Date(1995, 9, 9),  "Барабашова 32", 3356423, 4, 4, 443);
         stud [1] = new Student(2, "Артур" , "Герасимов", "Герасимович", new Date(1995, 8, 10), "Холодная гора 4", 3326579, 4, 4, 443);
         stud [2] = new Student(3, "Иван" , "Иванов", "Иванович", new Date(1997, 12, 9), "Советская 67", 3364398, 3, 2, 323);
         stud [3] = new Student(4, "Евгений" , "Жмуркин", "Андреевич", new Date(1997, 5, 2), "Герое Труда 7", 3367498, 3, 2, 323);
         stud [4] = new Student(5, "Николай" , "Кукушкин", "Адольфович", new Date(1995, 9, 9), "Блюхера 13", 3364398, 6, 4, 645);
         stud [5] = new Student(6, "Василий" , "Мышкин", "Олегович", new Date(1995, 3, 18), "Академика Павлова 9", 3364398, 6, 4, 645);
         
         Date p = new Date(1990, 9, 9);
         System.out.println();
         
        for (int i = 0; i <= 5; i++) {
            stud[i].Faculty();
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            stud[i].FacCourse();
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
        stud[i].date_birthday(p);
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            stud[i].Group();
        }
        
     }
}
