package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_6_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        System.out.print("Enter number of friends in the group, n : ");
        n = sc.nextInt();
        System.out.print("Enter the cost of one IIUC-TV subscription, x : ");
        x = sc.nextInt();
        double subscriptionNo;
        double total;
        subscriptionNo = (double) n / 6;
        total = Math.ceil(subscriptionNo) * x;
        System.out.println("Minimum total cost of " + n + " friends " + total);
    }
}
