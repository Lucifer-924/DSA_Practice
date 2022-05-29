package loveBabbar_DSA_Sheet.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class P_19_Common_In_3_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] b = new int[n1];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        int n3 = sc.nextInt();
        int[] c = new int[n1];
        for (int i = 0; i < n3; i++) {
            c[i] = sc.nextInt();
        }
        System.out.println(commonElements(a , b , c , n1 , n2 , n3));
    }
    public static ArrayList<Integer> commonElements(int[] a , int[] b , int[] c , int n1 , int n2 , int n3) {
        int i = 0 , j = 0 , k = 0;
        if(n1 == 0 || n2 == 0 || n3 == 0)
            return new ArrayList<Integer>();

        ArrayList<Integer> arr = new ArrayList<>();
        while(i < n1 && j < n2 && k < n3) {

            if(a[i] == b[j] && b[j] == c[k]){
                arr.add(a[i]);
                int ele = a[i];
                while(i < n1 && a[i] == ele){
                    i++;
                }
                while(j < n2 && b[j] == ele)
                    j++;
                while(k < n3 && c[k] == ele)
                    k++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < c[k]){
                j++;
            }
            else {
                k++;
            }
        }
        return arr;
    }
}