package ooplap7;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class StudentApp {
    public static void main(String[] args) {
        //creat object as Student
        Student s1 = new Student();
        s1.setId("111111111111");
        s1.setName("Boy Saiyai");
        s1.setMajor("Information system");
        s1.setGroup("Is221");

        Student s2 = new Student("222222222222",
                "Gril Saiyai",
                "Maketing",
                "MK221");
        showData(s1);


    }  //main
    private  static  void showData(Student s){
        System.out.println("Student info:  ");
        System.out.println("Id:  "+s.getId());
        System.out.println("Name:  "+s.getName());
        System.out.println("Major:  "+s.getMajor());
        System.out.println("Group:  "+s.getGroup());


    }//showData
}//class
