package uits.jv1614.oop;

import java.text.ParseException;
import java.util.Date;


public class Student {
   private int id;
   private String SurName;
   private String Name;
   private String MiddleName;
   private Date birthday;
   private String address;
   private int number;
   private String Faculty;
   private int course;
   private String Group;
    
    
    public Student() {
    
    }
         
public Student(int id, String Name, String SurName, String MiddleName, Date birthday,  String address, int number, String Faculty,int course, String Group) throws ParseException {
        
        this.id = id;
        this.Name = Name;
        this.SurName = SurName;
        this.MiddleName = MiddleName;
        this.birthday = birthday;
        this.address = address;
        this.number = number;
        this.Faculty = Faculty;
        this.course = course;
        this.Group = Group; 
        
    }
    
     public int getid() {
        return id;
    }
 
    public void setid(int id) {
        this.id = id;
    }
 
    public String getName() {
        return Name;
    }
 
    public void setName(String name) {
        this.Name = name;
    }
 
    public String getSurname() {
        return SurName;
    }
 
    public void setSurname(String surname) {
        this.SurName = surname;
    }
    public String getMiddleName() {
        return MiddleName;
    }
 
    public void setMiddleName(String surname) {
        this.MiddleName = MiddleName;
    }
     public Date getbirthday() {
        return birthday;
    }
 
    public void setbirthday(Date birthday) {
        this.birthday = new Date ( 1990,9,9);
    }
     
    public String getAddress() {
        return address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
    public int getnumber() {
        return number;
    }
 
    public void setnumber(int number) {
        this.number = number;
    }
    public String getFaculty() {
        return Faculty;
    }
 
    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }
     public int getcourse() {
        return course;
    }
 
    public void setcourse(int course) {
        this.course = course;
    }
    public String getGroup() {
        return Group;
    }
 
    public void setGroup(String Group) {
        this.Group = Group;
    }
    
    @Override
    public String toString() {
        System.out.println("id: " + getid());
        System.out.println("SurName: " + getSurname());
        System.out.println("Name: " + getName());
        System.out.println("MiddleName: " + getMiddleName());
        System.out.println("birthday: " + getbirthday().getYear()+"."+getbirthday().getMonth()+"."+getbirthday().getDay());
        System.out.println("adres: " + getAddress());
        System.out.println("telefon: " + getnumber());
        System.out.println("Faculty: " + getFaculty());
        System.out.println("course: " + getcourse());
        System.out.println("Group: " + getGroup());
       return null;
     }
  
    public void Faculty() {
        if ((this.getFaculty()).equals("3")){
        System.out.println("id: " + getid());
        System.out.println("SurName: " + getSurname());
        System.out.println("Name: " + getName());
        System.out.println("MiddleName: " + getMiddleName());
        System.out.println("birthday: " + getbirthday().getYear()+"."+getbirthday().getMonth()+"."+getbirthday().getDay());
        System.out.println("adres: " + getAddress());
        System.out.println("telefon: " + getnumber());
        System.out.println("Faculty: " + getFaculty());
        System.out.println("course: " + getcourse());
        System.out.println("Group: " + getGroup());
     }
   }
    //списки студентов для каждого факультета и курса
    public void FacCourse() {
        if (((this.getFaculty()).equals("6")) && (this.getcourse() == 4)) {
             System.out.println("id: " + getid());
        System.out.println("SurName: " + getSurname());
        System.out.println("Name: " + getName());
        System.out.println("MiddleName: " + getMiddleName());
        System.out.println("birthday: " + getbirthday().getYear()+"."+getbirthday().getMonth()+"."+getbirthday().getDay());
        System.out.println("adres: " + getAddress());
        System.out.println("telefon: " + getnumber());
        System.out.println("Faculty: " + getFaculty());
        System.out.println("course: " + getcourse());
        System.out.println("Group: " + getGroup());
        }
    }
    
    //список студентов, родившихся после заданного года
    public void date_birthday(Date p){
    if ((this.getbirthday().getYear()) > (p.getYear())){
     System.out.println("id: " + getid());
        System.out.println("SurName: " + getSurname());
        System.out.println("Name: " + getName());
        System.out.println("MiddleName: " + getMiddleName());
        System.out.println("birthday: " + getbirthday().getYear()+"."+getbirthday().getMonth()+"."+getbirthday().getDay());
        System.out.println("adres: " + getAddress());
        System.out.println("telefon: " + getnumber());
        System.out.println("Faculty: " + getFaculty());
        System.out.println("course: " + getcourse());
        System.out.println("Group: " + getGroup());
      }
   }
    
    // список учебной группы 
    public void Group(){
        if ((this.getGroup()).equals("443")){
        System.out.println("id: " + getid());
        System.out.println("SurName: " + getSurname());
        System.out.println("Name: " + getName());
        System.out.println("MiddleName: " + getMiddleName());
        System.out.println("birthday: " + getbirthday().getYear()+"."+getbirthday().getMonth()+"."+getbirthday().getDay());
        System.out.println("adres: " + getAddress());
        System.out.println("telefon: " + getnumber());
        System.out.println("Faculty: " + getFaculty());
        System.out.println("course: " + getcourse());
        System.out.println("Group: " + getGroup());
    
    }
  }
}
