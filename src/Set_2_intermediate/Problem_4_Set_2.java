package Set_2_intermediate;

import java.util.Scanner;

public class Problem_4_Set_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        int i,sum=0;
        System.out.print("Enter array elements: ");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Average = "+(double)sum/size);
    }
}
