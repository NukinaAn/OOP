package uits.jv1614.oop;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;


public class App {
     public static void main(String[] args) throws ParseException {
       Student[] stud = new Student[6];
         stud [0] = new Student(1, "Петр" , "Петров", "Петрович", new Date(1995, 9, 9),  "Барабашова 32", 3356423, "4", 4, "443");
         stud [1] = new Student(2, "Артур" , "Герасимов", "Герасимович", new Date(1995, 8, 10), "Холодная гора 4", 3326579, "4", 4, "443");
         stud [2] = new Student(3, "Иван" , "Иванов", "Иванович", new Date(1997, 12, 9), "Советская 67", 3364398, "3", 2, "323");
         stud [3] = new Student(4, "Евгений" , "Жмуркин", "Андреевич", new Date(1997, 5, 2), "Герое Труда 7", 3367498, "3", 2, "323");
         stud [4] = new Student(5, "Николай" , "Кукушкин", "Адольфович", new Date(1995, 9, 9), "Блюхера 13", 3364398, "6", 4, "645");
         stud [5] = new Student(6, "Василий" , "Мышкин", "Олегович", new Date(1995, 3, 18), "Академика Павлова 9", 3364398, "6", 4, "645");
         
        System.out.println();
        for (int i = 0; i <= 5; i++) {
             String toString = stud[i].toString();
        }
        Scanner sc = new Scanner (System.in);
        boolean fin = false;
        while(!fin){
            System.out.println("Введите номер необходимой операции: ");
            System.out.println("1 - список студентов заданного факультета");
            System.out.println("2 - списки студентов для каждого факультета и курса");
            System.out.println("3 - список студентов, родившихся после заданного года");
            System.out.println("4 - список учебной группы");
            
            try{
                
               int operation = Integer.parseInt(sc.next());
               switch(operation) {
                    case 1:{
                       System.out.println();
                        for (int i = 0; i <= 5; i++) {
                        stud[i].Faculty();
                        }
                 }break;
                    case 2:{
                        System.out.println();
                         for (int i = 0; i <= 5; i++) {
                         stud[i].FacCourse();
                        }
                 }break;
                    case 3:{
                        Date p = new Date(1995, 9, 9);
                        System.out.println();
                         for (int i = 0; i <= 5; i++) {
                         stud[i].date_birthday(p);
                        }
                 }break;
                    case 4:{
                        System.out.println();
                         for (int i = 0; i <= 5; i++) {
                         stud[i].Group();
                        }
                 }break;
               
             default:{
                        fin = true;
                    }
               }
            } catch(Exception ex){
                fin = true;
            }
        }
        System.out.println("До новых встреч!");   
     }
}
   
