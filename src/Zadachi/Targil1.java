package Zadachi;

import java.util.Scanner;

public class Targil1 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        int a= reader.nextInt();
        System.out.println(a-10*a);
    }
}
