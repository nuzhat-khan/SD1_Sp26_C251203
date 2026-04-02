package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_13_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x;
        System.out.print("Enter topic name, X: ");
        x = sc.next().charAt(0);
        if (x == 'A' || x == 'B' || x == 'C') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
