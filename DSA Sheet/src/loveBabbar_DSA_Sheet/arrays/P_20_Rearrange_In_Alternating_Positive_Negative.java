package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_20_Rearrange_In_Alternating_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrange(arr , n);
    }
    public static void rearrange(int[] arr , int n) {
//      int wrongIndex = -1;
//      for (int i = 0 ; i < n ; i++) {
//          if (wrongIndex != -1) {
//              if ((arr[wrongIndex] >= 0 && arr[i] < 0) || (arr[wrongIndex] < 0 && arr[i] > 0)) {
//                  rightRotate(arr , wrongIndex >= 2);
//                  if (index - wrongIndex >= 2)
//                      wrongIndex += 2;
//                  else
//                      wrongIndex = -1;
//                  }
//              }
//          else {
//              if ((arr[i] < 0 && index % 2 == 1) || (arr[i] >= 0 && index % 2 == 0))
//                  wrongIndex = -1;
//          }

        int i = 0 , j = n - 1;
        while (i < j) {
            while (i <= n - 1 && arr[i] > 0)
                i++;
            while (j >= 0 && arr[j] < 0)
                j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

            if (i == 0 || i == n)
                return;
            int k = 0;
            while (k < n && i < n) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                i++;
                k = k + 2;
            }

        for (i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
      }
}
