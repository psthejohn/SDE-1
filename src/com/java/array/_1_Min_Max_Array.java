package com.java.array;

public class _1_Min_Max_Array {

    public static void main(String[] args) {
        long[] arr = { 1, 2, 3, 4, 5 };
        Pair result = getMinMax(arr);
        System.out.println("Minimum: " + result.first);
        System.out.println("Maximum: " + result.second);
    }

    static Pair getMinMax(long[] arr) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (long num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return new Pair(min, max);
    }

    static class Pair {
        long first, second;

        Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }
}
