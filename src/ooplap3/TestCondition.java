package ooplab3;

public class TestCondition
{
    public static void main(String[] args)
    {
        //if
        int x = 10, y = 20;
        if (x<y) {
            System.out.println("x less than y");
        }
        else {
            System.out.println("x more than y");
        }

//        if-else-if
        if (y>30) {
            System.out.println("y less than 30");
        }
        else if (y>=20){
            System.out.println("y equal 20");
            if (x+y >=30)
                System.out.println("x+y = 30");
        }
        else {
            System.out.println("y equal 20");
        }





        System.out.println("OOP");
        System.out.print("IS221");

    } //main

}//class