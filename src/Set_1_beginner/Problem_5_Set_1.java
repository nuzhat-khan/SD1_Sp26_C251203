package Set_1_beginner;

import java.util.Scanner;

public class Problem_5_Set_1 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Enter two numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        char operator;
        System.out.println("Enter operator:");
        operator = sc.next().charAt(0);
        if (operator == '+') {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (operator == '/') {
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        }
    }
}
