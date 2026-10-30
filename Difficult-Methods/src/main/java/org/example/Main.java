package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "((()))";
        String s2 = "(()))";
        System.out.println(isBalanced(s));
        System.out.println(isBalanced(s2));

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoSum(nums, 5)));

        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println(Arrays.toString(rotateRight(arr, 3)));

        int[] arr1 = {1, 3, 5, 7, 9, 11, 13};
        int[] arr2 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));

    }

    // Write a function that takes a string as input and returns true if the string is balanced
    // (i.e., every opening parenthesis has a corresponding closing parenthesis), and false otherwise.
    public static boolean isBalanced(String s){
        return false;
    }

    // Write a function that takes an array of integers and a target integer,
    // and returns the indices of the two numbers that add up to the target.
    // Challenge: print out ALL the pairs of indices that add up to the target.
    public static int[] twoSum(int[] nums, int target) {
        return null;
    }

    // Write a function that takes an array of integers and an integer k,
    // and rotates the array to the right by k steps.
    // this takes two functions to rotate the array to the right by k steps.
    // The first function, rotateRight, takes the input array and the number of steps k as parameters.
    // It first checks if the length of the array is less than 2,
    // in which case it returns the original array since no rotation is needed.
    // Then, it calculates the effective number of steps to rotate by taking k modulo n (the length of the array)
    // and adjusting for negative values. The function then reverses the entire array,
    // followed by reversing the first k elements and then reversing the remaining elements.
    // Finally, it returns the rotated array.
    public static int[] rotateRight(int[] arr, int k) {
        return null;
    }

    private static void reverse(int[] arr, int start, int end) {

    }

    // Write a function that takes two sorted arrays and merges them into a single sorted array.
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        return null;
    }
}