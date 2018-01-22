package ooplap7;

import java.util.Scanner;

public class SuperCarApp {
    public static void main(String[] args) {
        //creat object as SuperCar
        SuperCar s1 = new SuperCar();
        s1.setCarbrand("BMW");
        s1.setCarcolor("Red");
        s1.setCarenginesize("3.0");
        s1.setMaxspeed("300 ");
        s1.setcountryoforigin("England ");




    }  //main
    private static Student inputData(Student s){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enterSupercar info: ");
        System.out.println("Enter Carbrand: ");
        s.setCarbrand(scanner.nextLine());
        System.out.println("Enter student name: ");
        s.setName(scanner.nextLine());
        System.out.println("Enter student major: ");
        s.setMajor(scanner.nextLine());
        System.out.println("Enter student group: ");
        s.setGroup(scanner.nextLine());
        return s;

}//class
