/*
Problem Statement : Merge Two Sorted Arrays Without Using Extra Space
Input : Sorted Array of Size N and Sorted Array of Size M
Output : Two Arrays Merged Should be Sorted
Constraints :
Time : O(nlogn)
Space : O(1)
*/
public class Problem5 {
    public static void main(String[] args) {
        int[] arrayOne = {1,2,6,8,10};
        int[] arrayTwo = {3,7,23,60};
        int n = arrayOne.length + arrayTwo.length;
        int oneSize = arrayOne.length;
        int start = 0;
        int gap = (int) Math.ceil(n/2);
        int mid = gap;

        while (gap >= 1) {
            boolean startIn = whichArray(start, oneSize);
            boolean midIn = whichArray(mid, oneSize);

            while (mid != n) {
                if (startIn && midIn) {
                    if (arrayOne[start] > arrayOne[mid]) {
                        int temp = arrayOne[start];
                        arrayOne[start] = arrayOne[mid];
                        arrayOne[mid] = temp;
                    }
                }
                else if (!midIn && startIn) {
                    if (arrayOne[start] > arrayTwo[mid%oneSize]) {
                        int temp = arrayOne[start];
                        arrayOne[start] = arrayTwo[mid%oneSize];
                        arrayTwo[mid%oneSize] = temp;
                    }
                }
                else {
                    if (arrayTwo[start%oneSize] > arrayTwo[mid%oneSize]) {
                        int temp = arrayTwo[start%oneSize];
                        arrayTwo[start%oneSize] = arrayTwo[mid%oneSize];
                        arrayTwo[mid%oneSize] = temp;
                    }
                }
                start++;
                mid++;
                startIn = whichArray(start,oneSize);
                midIn = whichArray(mid,oneSize);
            }

            gap = gap / 2;
            if (gap >= 1) {
                gap = (int) Math.ceil(gap);
            }
            start = 0;
            mid = gap;
        }

        for(int i : arrayOne) {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : arrayTwo) {
            System.out.print(i+" ");
        }

    }
    public static boolean whichArray(int ind, int oneSize) {
        return ind < oneSize;
    }
}
