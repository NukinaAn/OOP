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
   private int Faculty;
   private int course;
   private int Group;
    
    
    public Student() {
    
    }
         
public Student(int id, String Name, String SurName, String MiddleName, Date birthday,  String address, int number,int Faculty,int course, int Group) throws ParseException {
        
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
    public int getFaculty() {
        return Faculty;
    }
 
    public void setFaculty(int Faculty) {
        this.Faculty = Faculty;
    }
     public int getcourse() {
        return course;
    }
 
    public void setcourse(int course) {
        this.course = course;
    }
    public int getGroup() {
        return Group;
    }
 
    public void setGroup(int Group) {
        this.Group = Group;
    }
    
    @Override
    public String toString() {
        return  " id: " + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " birthday: " + birthday + '\n' +
                " address: " + address + '\n' +
                " number: " + number + '\n' +
                " Faculty: " + Faculty + '\n' +
                " course: " + course + '\n' +
                " Group: " + Group + '\n';
                
    }
  
    public String Faculty() {
        if ((this.Faculty())).equals(3)){
       return  " id: " + id + '\n' +
               " name: " + Name + '\n' +
               " surname: " + SurName + '\n' +
               " MiddleName: " + MiddleName + '\n' +
               " birthday: " + birthday + '\n' +
               " address: " + address + '\n' +
               " number: " + number + '\n' +
               " Faculty: " + Faculty + '\n' +
               " course: " + course + '\n' +
               " Group: " + Group + '\n';
        }
    }

    //списки студентов для каждого факультета и курса
    public String FacCourse() {
        if (((this.getFaculty()).equals(4)) && (this.getcourse() == 4)) {
             return  " id: " + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " birthday: " + birthday + '\n' +
                " address: " + address + '\n' +
                " number: " + number + '\n' +
                " Faculty: " + Faculty + '\n' +
                " course: " + course + '\n' +
                " Group: " + Group + '\n';
        } if (((this.getFaculty()).equals(6)) && (this.getcourse() == 4)) {
            return  " id: " + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " birthday: " + birthday + '\n' +
                " address: " + address + '\n' +
                " number: " + number + '\n' +
                " Faculty: " + Faculty + '\n' +
                " course: " + course + '\n' +
                " Group: " + Group + '\n';
            
        }if (((this.getFaculty()).equals(3)) && (this.getcourse() == 2)) {
             return  " id: " + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " birthday: " + birthday + '\n' +
                " address: " + address + '\n' +
                " number: " + number + '\n' +
                " Faculty: " + Faculty + '\n' +
                " course: " + course + '\n' +
                " Group: " + Group + '\n';
    
        }
       return null;
    }
    
    //список студентов, родившихся после заданного года
    public String date_birthday(Date p){
    if ((this.getbirthday().getYear()) > (p.getYear())){
     return  " id: " + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " birthday: " + birthday + '\n' +
                " address: " + address + '\n' +
                " number: " + number + '\n' +
                " Faculty: " + Faculty + '\n' +
                " course: " + course + '\n' +
                " Group: " + Group + '\n';
    }
       return null;
    }
    
    // список учебной группы 
    public String Group(){
        if (this.getGroup().equals(443)){
     return  " id: " + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " birthday: " + birthday + '\n' +
                " address: " + address + '\n' +
                " number: " + number + '\n' +
                " Faculty: " + Faculty + '\n' +
                " course: " + course + '\n' +
                " Group: " + Group + '\n';
    
    }if (this.getGroup().equals(323)){
     return  " id: " + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " birthday: " + birthday + '\n' +
                " address: " + address + '\n' +
                " number: " + number + '\n' +
                " Faculty: " + Faculty + '\n' +
                " course: " + course + '\n' +
                " Group: " + Group + '\n';
    }if (this.getGroup().equals(645)){
     return  " id: " + id + '\n' +
                " name: " + Name + '\n' +
                " surname: " + SurName + '\n' +
                " MiddleName: " + MiddleName + '\n' +
                " birthday: " + birthday + '\n' +
                " address: " + address + '\n' +
                " number: " + number + '\n' +
                " Faculty: " + Faculty + '\n' +
                " course: " + course + '\n' +
                " Group: " + Group + '\n';
    }
       return null;
    }
}
