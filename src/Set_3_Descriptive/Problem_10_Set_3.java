package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_10_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B1, B2, B3;
        System.out.print("Enter B1: ");
        B1 = sc.nextInt();
        System.out.print("Enter B2: ");
        B2 = sc.nextInt();
        System.out.print("Enter B3: ");
        B3 = sc.nextInt();
        if ((B1 == 0 && B2 == 0) || (B2 == 0 && B3 == 0) || (B3 == 0 && B1 == 0)) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }
    }
}
