package com.md.number;

public class PerfectNumber {

    /**
     * Takes a positive number and checks if the number is perfect
     *
     * @param n number
     * @return true or false
     */
    public static boolean isPerfect(int n) {
        int offSet;
        int value;
        int sum = 1;

        if (n < 2) {
            return false;
        }

        int i = 2;
        while (i * i <= n) {
            offSet = n / i;
            if (n % i == 0) {
                value = sum + i;
                sum = ((i * i) != n) ? (value + offSet) : value;
            }
            i++;
        }

        return sum == n;
    }
}
