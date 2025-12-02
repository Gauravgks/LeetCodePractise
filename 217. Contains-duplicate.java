/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seenNumbers = new HashSet<>();

        // Interate over each value in nums array
        for(int num : nums) {
            // If the number is already in the set, return true
            if(seenNumbers.contains(num)) {
                return true;
            }
            // Otherwise, add the number to the set
            seenNumbers.add(num);
        }
        return false;
    }
}
// @lc code=end
