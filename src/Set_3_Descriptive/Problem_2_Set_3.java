package Set_3_Descriptive;

import java.util.Scanner;

public class Problem_2_Set_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter string: ");
        s = sc.nextLine();
        int size = s.length();
        int lastIndex = size - 1;
        if (size > 10) {
            System.out.print(s.charAt(0));
            System.out.print(size - 2);
            System.out.println(s.charAt(lastIndex));
        } else {
            System.out.println(s);
        }
    }
}
