package org.dsa;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    public int[] insertionSort(int[] arr, int lengthOfArray) {
        for (int i = 1; i < lengthOfArray; i++) {
            int key = arr[i];
            int j = i - 1;

            /// Move elements of arr[0..i-1], that are greater than key,
            /// to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    /// sort an Array of 0's and 1's
    /// Use 2 pointer technique i as 0 and j as end of array
    public int[] sortArrayOfZerosAndOnes(int[] unsortedArray, int lengthOfArray) {
        int i = 0;
        int j = lengthOfArray;
        while (i < j) {
            if (unsortedArray[i] < unsortedArray[j]) {
                i++;
                j--;
            }
            swapArrayElements(unsortedArray, i, j);
        }
        return unsortedArray;

    }

    public void swapArrayElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /// Sort 2 arrays and merge them to one final array
    /// another example for 2 pointer technique
    public int[] sort2Arrays(int[] arrayA, int[] arrayB, int lenA, int lenB) {
        int i = 0;
        int j = 0;
        int[] ansArray = new int[lenA + lenB];
        int ansArrayIndex = 0;
        while (i < lenA && j < lenB) {
            if (arrayA[i] < arrayB[j]) {
                ansArray[ansArrayIndex++] = arrayA[i++];
            } else if (arrayA[i] > arrayB[j]) {
                ansArray[ansArrayIndex++] = arrayB[j++];
            } else {
                ansArray[ansArrayIndex++] = arrayA[i++];
                ansArray[ansArrayIndex++] = arrayA[j++];
            }
        }
        //Add remaining to the array.
        while (i < lenA) {
            ansArray[ansArrayIndex++] = arrayA[i++];
        }
        while (j < lenB) {
            ansArray[ansArrayIndex++] = arrayB[j++];
        }

        return ansArray;
    }
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the left and right partitions
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
