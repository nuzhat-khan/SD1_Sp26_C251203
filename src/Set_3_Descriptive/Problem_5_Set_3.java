package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_5_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter numbers A,B,C : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ((double) (a + b) / 2 > c) {
            System.out.println("The average of A and B is strictly greater than C");
        } else {
            System.out.println("The average of A and B is strictly not greater than C");
        }
    }
}
