package Set_2_intermediate;

import java.util.Scanner;

public class Problem_10_Set_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter string: ");
        s = sc.nextLine();
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("String in uppercase letters = "+upper);
        System.out.println("String in lowercase letters = "+lower);
    }
}
