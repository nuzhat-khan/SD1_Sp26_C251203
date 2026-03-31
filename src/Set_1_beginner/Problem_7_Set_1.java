package Set_1_beginner;

import java.util.Scanner;

public class Problem_7_Set_1 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter number:");
        num = sc.nextInt();
        int i, result;
        for (i = 1; i <= 10; i++) {
            result = i * num;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
