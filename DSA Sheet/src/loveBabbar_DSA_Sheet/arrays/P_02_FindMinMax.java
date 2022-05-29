package loveBabbar_DSA_Sheet.arrays;

import java.util.Scanner;

public class P_02_FindMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        MinMax obj = getMinMax(arr , 0 , n - 1);
        System.out.println("MAXIMUM = " + obj.max + " MINIMUM = " + obj.min);
    }

    public static MinMax getMinMax(int[] arr , int low , int high) {

        MinMax minMax = new MinMax();
        MinMax left = new MinMax();
        MinMax right = new MinMax();

        if(low == high) // only one elements
        {
            minMax.max = arr[low];
            minMax.min = arr[low];
            return minMax;
        }
        else if (high == low + 1) // only two elements
        {
            if (arr[low] > arr[high]) {
                minMax.max = arr[low];
                minMax.min = arr[high];
            }
            else {
                minMax.max = arr[high];
                minMax.min = arr[low];
            }
            return minMax;
        }

        int mid = (low + high) / 2;
        left = getMinMax(arr , low , mid);
        right = getMinMax(arr , mid + 1 , high);
        if (left.max > right.max)
            minMax.max = left.max;
        else
            minMax.max = right.max;
        if (left.min < right.min)
            minMax.min = left.min;
        else
            minMax.min = right.min;

        return minMax;

    }
}

class MinMax {
    int min;
    int max;
}
