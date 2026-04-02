package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_8_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.print("Enter number of sections, X: ");
        x = sc.nextInt();
        System.out.print("Enter students per section, Y: ");
        y = sc.nextInt();
        System.out.print("Enter number of students passed, Z: ");
        z = sc.nextInt();
        double percent = ((double) z / (x * y)) * 100;
        System.out.println("Percentage of passing students = " + percent+"%");
        if (percent > 50) {
            System.out.println("Percentage is strictly greater than 50%");
        } else {
            System.out.println("Percentage is not strictly greater than 50%");
        }
    }
}
