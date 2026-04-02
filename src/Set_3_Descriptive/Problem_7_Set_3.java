package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_7_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter assignment starting time, x : ");
        x = sc.nextInt();
        if (x + 3 <= 10) {
            System.out.println("Can complete all assignments");
        } else {
            System.out.println("Can not complete all assignments");
        }
    }
}
