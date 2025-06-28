package org.dsa;

public class SearchingInArrays {

    public Sorting sorting;

    public SearchingInArrays() {
        this.sorting = new Sorting();
    }

    public static void main(String[] args) {
        SearchingInArrays search = new SearchingInArrays();
        int[] unsortedArray = {10, 9, 19, 22, 4};
        int index = search.binarySearch(unsortedArray, 10, 5);
        System.out.println(index);
    }

    int linearSearch(int[] array, int searchKey, int lengthOfArray) {
        for (int i = 0; i < lengthOfArray; i++) {
            if (array[i] == searchKey) return i;
        }
        return -1;
    }

    int binarySearch(int[] sortedArray, int searchKey, int lengthOfArray) {
        sorting.quickSort(sortedArray, 0,lengthOfArray-1);
        int i = 0;
        int j = lengthOfArray - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (sortedArray[mid] == searchKey) return mid;
            else if (sortedArray[mid] < searchKey) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }
}
