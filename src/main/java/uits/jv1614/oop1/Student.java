package uits.jv1614.oop;



public class Student {
   private int id;
   private String SurName;
   private String Name;
   private String MiddleName;
  // private Date birthday;
   private String address;
   private int number;
   private int Faculty;
   private int course;
   private int Group;
    
 
    public Student(int id, String Name, String SurName, String MiddleName, String address, int number,int Faculty,int course, int Group) {
        this.id = id;
        this.Name = Name;
        this.SurName = SurName;
        this.MiddleName = MiddleName;
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
        return "Employee{" +
                "id:'" + id + '\'' +
                ", name='" + Name + '\'' +
                ", surname='" + SurName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", course='" + course + '\'' +
                ", Group='" + Group + '\'' +
                '}';
    }
}
