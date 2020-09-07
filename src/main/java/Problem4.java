/*
Problem Statement : Kadane's Algorithm  - Given an Array of Integers find the sub-array with the Maximum Sum.
Input : Array of size n
Output : Max Sum
Constraints :
Time : O(n)
Space : O(1)
*/
public class Problem4 {
    public static void main(String[] args) {
        int[] array = {-5,4,-2,6,4,2,-1,5,-2,1};
        int currSum = 0;
        int maxSum = array[0];

        for (int j : array) {
            if ((j + currSum >= 0)) {
                if ((j + currSum) > maxSum) {
                    maxSum = j + currSum;
                }
                currSum = j + currSum;
            } else if (j > maxSum) {
                currSum = j;
                maxSum = j;
            }
        }

        System.out.println(maxSum);
    }
}
