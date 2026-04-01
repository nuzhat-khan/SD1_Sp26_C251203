package Set_2_intermediate;

import java.util.Scanner;

public class Problem_9_Set_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter string: ");
        s = sc.nextLine();
        int i, countVowel = 0, countConsonant = 0;
        for (i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                        || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                        || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                        || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                    countVowel++;
                } else {
                    countConsonant++;
                }
            }
        }
        System.out.println("Number of vowels: " + countVowel);
        System.out.println("Number of consonants: " + countConsonant);
    }
}
