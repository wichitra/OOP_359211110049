package ooplap2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;
import java.util.Scanner;

public class TestInputData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("What is your name?  :");
        String name = reader.readLine();
        System.out.println("You name is"+name);
        System.out.println("How old are you?: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("You are"+age+"years old.");
//   Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where are you?:  ");
        String address = scanner.nextLine();
        System.out.println("you from "+address);
    }//main
}//class

