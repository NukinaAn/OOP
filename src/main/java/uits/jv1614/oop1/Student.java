package uits.jv1614.oop;

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
    
 
    public Student(int id, String Name, String SurName, String MiddleName, Date birthday, String address, int number,int Faculty,int course, int Group) {
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
    
     public Student(){
        this.id = 2;
        this.Name = "Артур";
        this.SurName = "Герасимов";
        this.MiddleName = "Герасимович";
        this.address = "Холодная гора 4";
        this.number = 3326579;
        this.Faculty = 4;
        this.course = 4;
        this.Group = 443;  
         
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
       this.birthday = birthday;
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
        return  " id:'" + id + '\'' +
                ", name: '" + Name + '\'' +
                ", surname: '" + SurName + '\'' +
                ", MiddleName: '" + MiddleName + '\'' +
                ", birthday: '" + birthday + '\'' +
                ", address: '" + address + '\'' +
                ", number: '" + number + '\'' +
                ", Faculty: '" + Faculty + '\'' +
                ", course: '" + course + '\'' +
                ", Group: '" + Group + '\'';
                
    }
}

    

