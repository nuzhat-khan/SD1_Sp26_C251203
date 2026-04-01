package Set_2_intermediate;

import java.util.Scanner;

public class Problem_7_Set_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        int i, j, temp;
        System.out.print("Enter array elements: ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < size - 1; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Elements of sorted array are: ");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
