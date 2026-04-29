package org.example.findMedianSortedArrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
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
