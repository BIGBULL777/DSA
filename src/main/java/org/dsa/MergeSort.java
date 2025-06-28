package org.dsa;

public class MergeSort {

    void MS(int[] array, int low, int high) {
        if (low == high) return;
        int mid = (low + high) / 2;
        MS(array, low, mid);
        MS(array, mid + 1, high);
        MergeArray(array, low, mid, high);
    }

    private void MergeArray(int[] array, int low, int mid, int high) {
        int[] tempArray = new int[high - low + 1];
        int tempArrayIndex = 0;
        int i = 0;
        int j = mid + 1;
        while (i <= mid && j <= high){
            if (array[i] < array[j]){
                tempArray[tempArrayIndex++] = array[i++];
            }
            else {
                tempArray[tempArrayIndex++] = array[j++];
            }
        }
        while (i < mid){
            tempArray[tempArrayIndex++] = array[i++];
        }
        while (j < high){
            tempArray[tempArrayIndex++] = array[j++];
        }
    }
}
