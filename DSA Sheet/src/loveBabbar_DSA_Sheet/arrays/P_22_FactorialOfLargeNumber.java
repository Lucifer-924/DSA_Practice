package loveBabbar_DSA_Sheet.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class P_22_FactorialOfLargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = facorial(n);
        for (int i : arr)
            System.out.print(i + " ");
    }
    public static ArrayList<Integer> facorial(int n) {
        int size = 1 , fac = 2 , carry = 0 ;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0 , 1);
        while (fac <= n) {
            for (int i = size - 1 ; i >= 0 ; i--) {
                int temp = arr.get(i) * fac + carry;
                arr.set(i , temp % 10);
                carry = temp / 10;
            }
            while (carry != 0) {
                arr.add(0 , carry % 10);
                carry /= 10;
                size++;
            }
            fac++;
        }
        return arr;
    }
}
