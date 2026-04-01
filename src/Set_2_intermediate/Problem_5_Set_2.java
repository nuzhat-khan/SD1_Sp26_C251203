package Set_2_intermediate;

import java.util.Scanner;

public class Problem_5_Set_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        int i, countEven = 0, countOdd = 0;
        System.out.print("Enter array elements: ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Number of even numbers are = " + countEven);
        System.out.println("Number of odd numbers are = " + countOdd);
    }
}
