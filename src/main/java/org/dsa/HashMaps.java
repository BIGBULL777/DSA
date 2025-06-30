package org.dsa;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    /// Counter for each element in array.

    int getCountForElement(int element, int [] array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            else {
                map.put(array[i],1);
            }
        }
        return map.get(element);
    }

    int twoSum(int [] array, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : array) {
            if (map.containsKey(target - j)) {
                return target - j;
            } else {
                map.put(j, 1);
            }
        }
        return -1;
    }
}
