package ooplap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myArray2D {
    private static int num;

    public static void main(String[] args) throws IOException {
        int[][] num = new int[2][3];//2เเถวนอน//3แถวตั้ง 6 อิเลีเม้น 2*3=6
//        num [0][0] = 1;
//        num [0][1] = 2;
//        num [0][2] = 3;
        num = inputData2D(num);

    }//main

    private static int inputData2D(int num) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter an integer: ");
        for (int i = 0;i<num.length; i++) {
            for (int j = 0;j<num.length; j++) {
                System.out.println("num[" + i + "][" + j + "]: ");
                num[i][j] = Integer.parseInt(reader.readLine());
            }
        }
        return num;
    }
}
}//class
