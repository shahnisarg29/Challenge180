/*
Problem Statement : Given an Integer array with a specified range find the number which repeats And the which is missing.
Input : n : the range
       array : size n
Output : Display the Repeating Number and Missing Number
Constraints :
Time : O(n)
Space : O(1)
 */
public class Problem3 {
    public static void main(String[] args) {
        int[] array = {1,3,2,4,5,3};
        int n = 6;

        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;
        int expectedSquareSum = (n*(n+1)*((2*n)+1))/6;
        int actualSquareSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += array[i];
            actualSquareSum += array[i]*array[i];
        }

        //Solving Using Equations in Two Variables

        int xminusy = Math.abs(actualSum - expectedSum);
        int x2minusy2 = Math.abs(actualSquareSum - expectedSquareSum);

        int xplusy = x2minusy2/xminusy ;
        int x = (xplusy + xminusy)/2;
        int y = xplusy - x ;
        System.out.println("The Missing and Repeating Number are : ");
        System.out.println(x+" and "+y);

    }

}
