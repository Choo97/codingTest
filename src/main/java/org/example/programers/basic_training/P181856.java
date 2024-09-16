package org.example.programers.basic_training;

public class P181856 {

    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        int arr1Sum = 0;
        int arr2Sum = 0;

        for (int i : arr1) {
            arr1Sum += i;
        }

        for (int i : arr2) {
            arr2Sum += i;
        }

        int arr1Length = arr1.length;
        int arr2Length = arr2.length;

        if (arr1Length > arr2Length) {
            return 1;
        }

        if (arr2Length > arr1Length) {
            return -1;
        }

        if (arr1Sum > arr2Sum) {
            return 1;
        }

        if (arr2Sum > arr1Sum) {
            return -1;
        }

        return 0;
    }

}