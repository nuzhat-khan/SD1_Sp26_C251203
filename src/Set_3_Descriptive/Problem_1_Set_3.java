package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_1_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, C;
        System.out.print("Enter A: ");
        A = sc.nextInt();
        System.out.print("Enter C: ");
        C = sc.nextInt();
        if ((A + C) % 2 == 0) {
            System.out.println("There exists B");
        } else {
            System.out.println("There does not exist B");
        }
    }
}
