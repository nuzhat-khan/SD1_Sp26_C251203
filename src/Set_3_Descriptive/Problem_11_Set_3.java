package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_11_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N;
        System.out.print("Enter kg of pulp, N: ");
        N = sc.nextDouble();
        double total = N * 10;
        System.out.print("Number of notebook = ");
        System.out.printf("%.2f", total);
        System.out.print("\n");
    }
}
