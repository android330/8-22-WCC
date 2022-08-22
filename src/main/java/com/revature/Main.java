package com.revature;

import java.util.*;

public class Main {
    // must adhere to O(log(m+n)) time complexity - sorting is O(n)
    // Use dual priority to ques to keep track of medium value whilest maintaining a log(n) insertion complexity
    public static double medianTwoSortedArrays(int[] nums1, int[] nums2){
        PriorityQueue<Integer> maxVals = new PriorityQueue<>(Integer::compare);
        // priority que for min values has inverted comparator
        PriorityQueue<Integer> minVals = new PriorityQueue<>((x, y) -> Integer.compare(y, x));

        // do for both int arrays
        for(int[] intArray: new int[][]{nums1,nums2}) {
            for (int value : intArray) {
                // if the value is larger than the top of max value priority que, then it is added to max value priority que
                // if not, then it is added to the min value priority que
                if (!maxVals.isEmpty() && value <= maxVals.peek())
                    minVals.add(value);
                else
                    maxVals.add(value);

                // balances the two ques
                if (maxVals.size() - minVals.size() - 1 > 0)
                    minVals.add(maxVals.poll());
                else if (minVals.size() - maxVals.size() - 1 > 0)
                    maxVals.add(minVals.poll());
            }
        }

        // determines which heap/que to return from, or peek from both and return average with elongated ternary statement
        return maxVals.size() > minVals.size() ? maxVals.peek()
                : minVals.size() > maxVals.size() ? minVals.peek()
                : maxVals.isEmpty() ? 0
                : (double) (minVals.peek() + maxVals.peek())/2;
    }

    public static LinkedList<Integer> mergeSortedLinkedList(ArrayList<LinkedList<Integer>> lists){
        LinkedList<Integer> lReturn = new LinkedList<>();
        for(LinkedList<Integer> lInner: lists){
            lReturn.addAll(lInner);
        }

        Collections.sort(lReturn);
        return lReturn;
    }
}