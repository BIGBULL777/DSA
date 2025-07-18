package org.dsa;

import java.util.HashMap;
import java.util.Map;

class FindSumPairs {
    int[] nums1;
    int[] nums2;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums2;
        this.nums2 = nums2;
    }

    public void add(int index, int val) {
        nums2[index] += val;

        new FindSumPairs(nums1,nums2);

    }

    public int count(int tot) {
        int ans = 0;
        int i, j = 0;
        while (j < nums2.length) {
            i = 0;
            while (i < nums1.length) {
                if (nums1[i] + nums2[j] == tot) {
                    ans++;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
