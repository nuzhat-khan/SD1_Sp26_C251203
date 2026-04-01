package Set_2_intermediate;

import java.util.Scanner;

public class Problem_2_Set_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,size;
        System.out.print("Enter array size : ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0];
        for(i=1;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Largest element is = "+max);
    }
}
