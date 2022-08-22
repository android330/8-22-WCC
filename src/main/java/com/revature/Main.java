package com.revature;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    // must adhere to O(log(m+n)) time complexity
    public static double medianTwoSortedArrays(int[] nums1, int[] nums2){


        // if sum even
        if((nums1.length%2==0 && nums2.length%2==0) || (nums1.length%2!=0 && nums2.length%2!=0)){
            return (double)(nums1[(nums1.length-1)/2] + nums2[(nums2.length-1)/2])/2;
        }
        // if sum odd
        else{

        }

        return 0;
    }

    public static LinkedList<Integer> mergeSortedLinkedList(ArrayList<LinkedList<Integer>> lists){
        LinkedList<Integer> l = new LinkedList<>();
        for(LinkedList<Integer> i: lists){
            for(Integer in: i){
                l.add(in);
            }
        }

        Collections.sort(l);
        return l;
    }
}