package org.example.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static  List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultado = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int izq = i + 1;
            int der = nums.length - 1;

            while (izq < der) {
                int suma = nums[i] + nums[izq] + nums[der];

                if (suma == 0) {
                    resultado.add(Arrays.asList(nums[i], nums[izq], nums[der]));
                    while (izq < der && nums[izq] == nums[izq + 1]) izq++;
                    while (izq < der && nums[der] == nums[der - 1]) der--;
                    izq++;
                    der--;
                } else if (suma < 0) {
                    izq++;
                } else {
                    der--;
                }
            }
        }

        return resultado;
    }
}
