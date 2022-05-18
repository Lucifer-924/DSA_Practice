package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_20_Rearrange_Array_Alternatively {

    private static void rearrange(int[] arr, int n){

        int minIndex = 0;
        int maxIndex = n-1;
        int maxElement = arr[n-1] + 1;

        for(int i = 0; i < n; i++){

            if(i % 2 == 0){
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            }
            else{
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }
        for(int i = 0; i < n; i++){
           arr[i] = arr[i] / maxElement;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        rearrange(arr, n);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
