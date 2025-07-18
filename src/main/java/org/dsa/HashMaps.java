package org.dsa;

import java.util.*;

public class HashMaps {
    /// Counter for each element in array.

    int getCountForElement(int element, int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        return map.get(element);
    }

    int twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : array) {
            if (map.containsKey(target - j)) {
                return target - j;
            } else {
                map.put(j, 1);
            }
        }
        return -1;
    }
    public int[] count(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                return ans;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }

    public List<Map.Entry<String,Integer>> sortMapByValues(Map<String,Integer> map){
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(set);
        Collections.sort(list,new SortByValue());
        System.out.println(list);
        return list;
    }

    public Map<String,Integer> sortMapByKeys(Map<String,Integer> map){
        return new TreeMap<>(map);
    }
}
