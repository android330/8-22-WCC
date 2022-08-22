package com.revature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MainTester {
    @Test
    void MedianExample1(){
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double out = Main.medianTwoSortedArrays(nums1,nums2);
        Assertions.assertEquals(2.00000, out);
    }

    @Test
    void MedianExample2(){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double out = Main.medianTwoSortedArrays(nums1,nums2);
        Assertions.assertEquals(2.50000, out);
    }

    @Test
    void MedianCustomTest1(){
        int[] nums1 = {1,2,4,5,6,7,8,9};
        int[] nums2 = {3,4,12,23,234,532};
        double out = Main.medianTwoSortedArrays(nums1,nums2);
        Assertions.assertEquals(6.5, out);
    }

    @Test
    void MedianCustomTest2(){
        int[] nums1 = {7,8,9,12,33,36,66};
        int[] nums2 = {1,2,5};
        double out = Main.medianTwoSortedArrays(nums1,nums2);
        Assertions.assertEquals(8.5, out);
    }

    @Test
    void MergeExample1(){
        ArrayList<LinkedList<Integer>> l = new ArrayList<>();
        l.add(new LinkedList<Integer>(Arrays.asList(1,4,5)));
        l.add(new LinkedList<Integer>(Arrays.asList(1,3,4)));
        l.add(new LinkedList<Integer>(Arrays.asList(2,6)));

        LinkedList<Integer> lOut = Main.mergeSortedLinkedList(l);
        LinkedList<Integer> lAnswer = new LinkedList<>(Arrays.asList(1,1,2,3,4,4,5,6));
        for(int i = 0; i < lOut.size();i++){
            Assertions.assertTrue(lOut.get(i).equals( lAnswer.get(i)));
        }

    }

    @Test
    void MergeExample2(){
        ArrayList<LinkedList<Integer>> l = new ArrayList<>();

        LinkedList<Integer> lOut = Main.mergeSortedLinkedList(l);
        LinkedList<Integer> lAnswer = new LinkedList<>();
        for(int i = 0; i < lOut.size();i++){
            Assertions.assertTrue(lOut.get(i).equals( lAnswer.get(i)));
        }
    }

    @Test
    void MergeExample3(){
        ArrayList<LinkedList<Integer>> l = new ArrayList<>();
        l.add(new LinkedList<Integer>());

        LinkedList<Integer> lOut = Main.mergeSortedLinkedList(l);
        LinkedList<Integer> lAnswer = new LinkedList<>();
        for(int i = 0; i < lOut.size();i++){
            Assertions.assertTrue(lOut.get(i).equals( lAnswer.get(i)));
        }
    }
}
