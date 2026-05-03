package org.example.maxArea;

import java.util.Arrays;

public class Solution {
        public static int maxArea(int[] height) {
            int maxArea = 0;
            int izq = 0;
            int der = height.length - 1;

            while (izq < der) {
                int numMinimo = Math.min(height[izq], height[der]);
                int area = numMinimo * (der - izq);

                if (area > maxArea) {
                    maxArea = area;
                }

                if (height[izq] <= height[der]) {
                    izq++;
                } else {
                    der--;
                }
            }


            return maxArea;
    }
}
