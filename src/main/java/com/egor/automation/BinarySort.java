 package com.egor.automation;

public class BinarySort {
    public static void main(String[] args) {
        int[] array = {3,13,23,33,43,53,63,73,83,93};
        int key = 13;
        System.out.println(FindKey(array, key));
    }
    static int FindKey(int[] a, int b){
        int left = 0;
        int right = a.length - 1;

        while (left <= right){
            int mid = (left + right)/2;
                if (a[mid] == b){
                    System.out.println("Key found!");
                    return b;
                }
                if (a[mid] > b){
                    System.out.println("Cut right half");
                    right = mid - 1;
                }

                if (a[mid] < b){
                    System.out.println("Cut left half");
                    left = mid + 1;
                }
        }
        return -1;
    }
}

