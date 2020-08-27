/*
Problem Statement : Given an Integer array with a specified range find the number which repeats itself.
Input : n : the range
        array : from 1-n and one extra number from the range
Output : Display the Repeating Number
Constraints :
Time : O(n)
Space : O(1)
 */


import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] array = new int[n+1];

        for (int i = 0; i < n+1; i++) {
            array[i] = s.nextInt();
        }

        int duplicateNumber = findDuplicate(array,n);

        System.out.println("The Duplicate Number is "+duplicateNumber);
    }

    public static int findDuplicate(int[] array, int length) {
        int actualSum = (length*(length+1)/2);

        int arraySum = 0;
        for (int i = 0; i < length+1; i++) {
            arraySum += array[i];
        }

        return arraySum-actualSum;
    }
}
