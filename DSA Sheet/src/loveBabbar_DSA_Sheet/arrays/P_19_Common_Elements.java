package loveBabbar_DSA_Sheet.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class P_19_Common_Elements {

    private static ArrayList<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3,
                                                     int n1, int n2, int n3){

        ArrayList<Integer> ans = new ArrayList<>();
        int i, j, k;
        i = j = k = 0;
        int prev1,prev2,prev3;
        prev1 = prev2 = prev3 = Integer.MIN_VALUE;

        while(i < n1 && j < n2 && k < n3){

            while(i < n1 && arr1[i] == prev1) i++;
            while(j < n2 && arr2[j] == prev2) j++;
            while(k < n3 && arr3[k] == prev3) k++;

            if(i < n1 && j < n2 && k < n3){

                if((arr1[i] == arr2[j]) && (arr2[j] == arr3[k])){

                    ans.add(arr1[i]);
                    prev1 = prev2 = prev3 = arr1[i];
                    i++; j++; k++;
                }
                else if(arr1[i] < arr2[j]){
                    prev1 = arr1[i];
                    i++;
                }
                else if (arr2[j] < arr3[k]) {
                    prev2 = arr2[j];
                    j++;
                }
                else {
                    prev3 = arr3[k];
                    k++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n3];

        fillArray(arr1,n1);
        fillArray(arr2,n2);
        fillArray(arr3,n3);

        ArrayList<Integer> ans = commonElements(arr1, arr2, arr3,
                n1, n2, n3);

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
    private static void fillArray(int[] arr, int n){

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
}
