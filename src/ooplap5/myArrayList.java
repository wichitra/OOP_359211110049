package ooplap5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        //add method
        myList.add("fon");
        System.out.println(myList);
        myList.add("mai");
        myList.add("aorn");
        System.out.println(myList);
        System.out.println(myList.size());//นับจำนวนคนmyList.size
        myList.add(2,"Hello");
        System.out.println(myList);
        myList.add(1,"100");
        System.out.println(myList);
        myList.add(0,"wichitra");
        System.out.println(myList);
        myList.remove("Hello");
        System.out.println(myList.indexOf(100));



    }//main
}//class
