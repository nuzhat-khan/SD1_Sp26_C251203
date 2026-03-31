package Set_1_beginner;

import java.util.Scanner;

public class Problem_6_Set_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter N:");
        n = sc.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}
