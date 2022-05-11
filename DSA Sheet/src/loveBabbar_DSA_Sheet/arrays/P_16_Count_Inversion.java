package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_16_Count_Inversion {

    private static int countInversion(int[] arr, int n){

        if(n <= 1) return 0;

        int[] temp = new int[n];

        return mergeSort(arr, temp, 0, n-1);
    }
    private static int mergeSort(int[] arr, int[] temp, int left, int right){

        int mid, count = 0;

        if(right > left){

            mid = (left + right)/2;

            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid+1, right);

            count += merge(arr, temp, left, mid, right);
        }
        return count;
    }

    private static int merge(int[] arr, int[] temp, int left, int mid, int right){

        int i = left;
        int j = mid+1;
        int k = left;
        int count = 0;

        while((i <= mid) && (j <= right)){

            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                count += (mid + 1) - i;
            }
        }
        while(i <= mid) temp[k++] = arr[i++];
        while(j <= right) temp[k++] = arr[j++];

        for(i = left; i <= right; i++){
            arr[i] = temp[i];
        }

        return count;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int ans = countInversion(arr,n);
        System.out.println(ans);
    }
}
