package loveBabbar_DSA_Sheet.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class P_18_Count_Pairs_With_Given_Sum {

    private static int countPairs(int[] arr, int n, int k){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i], 0);

            map.put(arr[i], map.get(arr[i]) + 1);
        }
        int twiceCount = 0;

        for(int i = 0; i < n; i++){
            if(map.get(k - arr[i]) != null){
                twiceCount += map.get(k - arr[i]);
            }
            if(k - arr[i] == arr[i])
                twiceCount--;
        }
        return twiceCount/2;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = countPairs(arr, n, k);
        System.out.println(ans);
    }
}
