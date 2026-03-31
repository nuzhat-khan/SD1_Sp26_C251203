package Set_1_beginner;

import java.util.Scanner;

public class Problem_3_Set_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number:");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
