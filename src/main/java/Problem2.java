/*
Problem Statement : Arrange the Given Array in such a way that they are in a sorted form without using Sorting Algorithm.
Input : Array containing 0's, 1's, 2's.
Output : Arrange in sorted Fashion.
Constraints :
Time : O(n) (One Pass Only)
Space : O(1)
 */

public class Problem2 {
    public static void main(String[] args) {
        int[] array = {1,2,0,2,1,2,2,0,1,0};

        int low,mid,high;
        low = 0;
        mid = 0;
        high = array.length-1;
        while(mid <= high) {
            if (array[mid] == 0) {
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;

                low++;
                mid++;
            }
            else if (array[mid] == 1) {
                mid++;
            }
            else {
                int temp = array[high];
                array[high] = array[mid];
                array[mid] = temp;

                high--;
            }
        }
        for (int j : array) {
            System.out.println(j);
        }

    }
}

