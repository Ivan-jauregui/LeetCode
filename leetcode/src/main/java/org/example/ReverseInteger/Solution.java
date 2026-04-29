package org.example.ReverseInteger;

import java.util.Arrays;

public class Solution {

    public static int reverse(int x) {
            String nums = String.valueOf(x);

            boolean negative = nums.charAt(0) == '-';
            if (negative) nums = nums.substring(1);

            String reverseNums = new StringBuilder(nums).reverse().toString(); 

            if (negative) reverseNums = "-" + reverseNums;

            long result = Long.parseLong(reverseNums);

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;

            return (int) result;
    }
}
