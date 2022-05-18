package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_20_Rearrange_Array_Alternatively2 {

    private static void rearrangeArray(int[] arr, int n){

        for(int i = 0; i < n-1; i++){

            if(i % 2 == 0 && arr[i] >= 0){

                for(int j = i+1; j < n; j++){
                    if(arr[j] < 0) {

                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;

                        int tempIndex = i + 1;

                        while (tempIndex < j) {
                            temp = arr[j];
                            arr[j] = arr[tempIndex];
                            arr[tempIndex] = temp;

                            tempIndex++;
                        }
                        break;
                    }
                }
            }
            else if(i % 2 != 0 && arr[i] < 0){
                for(int j = i+1; j < n; j++){
                    if(arr[j] >= 0) {

                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;

                        int tempIndex = i + 1;

                        while (tempIndex < j) {
                            temp = arr[j];
                            arr[j] = arr[tempIndex];
                            arr[tempIndex] = temp;

                            tempIndex++;
                        }
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        rearrangeArray(arr,n);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
