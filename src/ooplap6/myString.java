package ooplap6;

import sun.security.util.Length;

public class myString {
    public static void main(String[] args) {
        String msg1 ="wichitra Jeenderm";
        System.out.println(msg1);
        char[]c ={'H','e','l','l','o'};
        String msg2 =new String(c); //แปลงตัวเเปรจากcharเป็นสตริง
        System.out.println(msg2);

        //concatenation String
        //type 1 (+) //แบบที่ 1
        String msg3 = msg2 +" "+ msg1;
        System.out.println(msg3);
        System.out.println(msg3.length());

        //type 2 concat())
        String msg4 = msg3.concat(" RMUTSV"); //คำต่อท้าย
        System.out.println(msg4);


        System.out.println(msg4.toLowerCase());//ตัวเล็ก
        System.out.println(msg4.toUpperCase());//ต/ัวใหญ่
        System.out.println(msg4.substring(5,10)); //ตัดคำ

        //trim () ตัดสเปคบาร์ซ้ายกับขวายกเว้นกลาง
        String msg5 = " Hello ";
        System.out.println("*"+msg5+"*");
        System.out.println("*"+msg5.trim()+"*");








    }//main
}//class
