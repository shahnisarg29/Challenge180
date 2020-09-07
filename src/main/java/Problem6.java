import java.util.*;

/*
Problem Statement : Merge the Overlapping Intervals
Input : Array of Intervals
Output : Array with Merged Intervals
Constraints :
Time : O(nlogn)
Space : O(n)
*/
public class Problem6 {
    public static void main(String[] args) {
        Integer[][] array = {{2,6},{1,3},{8,10},{15,18},{13,17}};
        List<List<Integer>> intervals = new ArrayList<>();
        for(Integer[] j : array) {
            intervals.add(Arrays.asList(j));
        }
        intervals.sort((o1, o2) -> o1.get(0).compareTo(o2.get(0)));

        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> updated = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            if ((intervals.get(i).get(0) >= updated.get(0) ) && (intervals.get(i).get(0) <= updated.get(1))) {
                if (intervals.get(i).get(1) > updated.get(1)) {
                    updated.set(1,intervals.get(i).get(1));
                }
            }
            else {
                finalList.add(updated);
                updated = new ArrayList<Integer>();
                updated.add(0,intervals.get(i).get(0));
                updated.add(1,intervals.get(i).get(1));
            }
            if (i == (intervals.size()-1)) {
                finalList.add(updated);
            }
        }
        for(List<Integer> i : finalList) {
            System.out.print(i.get(0)+" "+i.get(1));
            System.out.println();
        }
    }
}
