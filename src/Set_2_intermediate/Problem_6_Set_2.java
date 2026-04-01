package Set_2_intermediate;

import java.util.Scanner;

public class Problem_6_Set_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        int i;
        System.out.print("Enter array elements: ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int item, f = 0;
        System.out.print("Enter item to find: ");
        item = sc.nextInt();
        for (i = 0; i < size; i++) {
            if (arr[i] == item) {
                f = 1;
                break;
            }
        }
        if (f == 1) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
    }
}
