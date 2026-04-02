package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_4_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter digits a,b,c : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == b) {
            System.out.println("Value that occurs once is = " + c);
        } else if (b == c) {
            System.out.println("Value that occurs once is = " + a);
        } else if (c == a) {
            System.out.println("Value that occurs once is = " + b);
        }
    }
}
