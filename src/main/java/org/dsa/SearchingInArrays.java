package org.dsa;

public class SearchingInArrays {

    public Sorting sorting;
    public BinaryOperations binaryOperations;

    public SearchingInArrays() {
        this.sorting = new Sorting();
        this.binaryOperations = new BinaryOperations();

    }

    public static void main(String[] args) {
        SearchingInArrays search = new SearchingInArrays();
        int[] unsortedArray = {10, 9, 19, 22, 4};
        int index = search.closestNumberToSearchKey(unsortedArray, 5, 99);
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

    int closestNumberToSearchKey(int[] array, int lengthOfArray, int searchKey) {
        sorting.quickSort(array, 0, lengthOfArray - 1);

        int ans = Integer.MIN_VALUE;
        int left = 0;
        int right = lengthOfArray - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == searchKey) {
                return array[mid];
            } else if (array[mid] < searchKey) {
                ans = array[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    int findSQRoot(int number){
        int low = 1;
        int high = number;
        while (low <= high){
            int mid = (low + high)/2;
            if (mid * mid == number) return mid;
            else if (mid * mid < number){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return -1;
    }

    int findPthRoot(int number, int p){
        int low = 1;
        int high = number;
        while (low <= high){
            int mid = (low + high)/2;
            if (binaryOperations.aPowBSolution2(mid,mid) == number) return mid;
            else if (binaryOperations.aPowBSolution2(mid,mid) < number) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

}
