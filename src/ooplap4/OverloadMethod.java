package ooplap4;

public class OverloadMethod {

    private static int value = 100;

    public static void A (){
        System.out.println("Hello");
        int number = 20;
        System.out.println(number);
        System.out.println(value);
    }
    public static void A (int x){
        System.out.println("Hello "+x);
    }
    public static void A (int x, int y){
        System.out.println("Hello "+(x+y));
    }

    public static void main(String[] args) {
//        OverloadMethod คือ Method ที่มีชื่อเหมือนกัน แต่มีพารามิเตอร์ที่แตกต่างกัน
        A();
        A(5);
        A(5,10);

//        local variable
        int number = 10;

    } // main
} // class