// ============================================================
// Problem    : 1. Two Sum
// Difficulty : Easy
// URL        : https://leetcode.com/problems/two-sum/
// Language   : Java
// Date       : 2026-04-25
// ============================================================
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        // value -> list of original indices
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        // copy array before sorting
        int[] arr = nums.clone();
        Arrays.sort(arr);

        int i = 0, j = n - 1;
        int a = 0, b = 0;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                a = arr[i];
                b = arr[j];
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        int[] res = new int[2];

        res[0] = map.get(a).remove(0);
        res[1] = map.get(b).remove(0);

        return res;
    }
}