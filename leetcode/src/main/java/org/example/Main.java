package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nusm1={1,2,3};
        int[] nums2={4,5,6};

        System.out.println(Solution.findMedianSortedArrays(nusm1,nums2));

    }
    static class Solution {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] nums= IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).toArray();
            Arrays.sort(nums);
            double longitud= nums.length;


            if(longitud%2!=0){
                return nums[nums.length/2];
            }else{
                return ( nums[nums.length/2] +nums[nums.length/2-1] )/2.0;
            }
        }
    }
}