package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_3_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter string: ");
        s = sc.nextLine();
        String result = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println("String after capitalization: " + result);
    }
}
