package ooplap6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
        //stringTokenizer นับจำนวนคำที่ยุใน ขค
        String msg ="wellcome to RMUTSV";
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());

        while (myToken.hasMoreElements()){
            StringBuffer myBuff = new StringBuffer (
                    myToken.nextToken());
            System.out.println(myBuff.reverse()+"  "); //เปลี่ยนทั้งประโยค

        }
    }//main
}//class
