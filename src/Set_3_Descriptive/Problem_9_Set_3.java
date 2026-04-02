package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_9_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Enter working hour per day, X: ");
        x = sc.nextInt();
        System.out.print("Enter working hour on Wednesday, Y: ");
        y = sc.nextInt();
        int total = (x * 4) + y;
        System.out.println("total number of working hours in one week = " + total);
    }
}
