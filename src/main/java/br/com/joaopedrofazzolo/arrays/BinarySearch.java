package br.com.joaopedrofazzolo.arrays;

import java.util.Map;

public class BinarySearch {
    class Solution {
        public int search(int[] nums, int target) {
            int lo = 0, hi = nums.length;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    lo = mid + 1;
                }else {
                    hi = mid;
                }
            }
            return -1;
        }
    }
}
