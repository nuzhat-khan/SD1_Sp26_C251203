package Set_2_intermediate;

import java.util.Scanner;

public class Problem_8_Set_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter string: ");
        s = sc.nextLine();
        int i, j, f = 1, lastIndex;
        lastIndex = s.length() - 1;
        for (i = 0, j = lastIndex; j >= 0; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                f = 0;
                break;
            }
        }
        if (f == 1) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
