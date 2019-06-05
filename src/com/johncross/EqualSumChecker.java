package com.johncross;

public class EqualSumChecker {

    public static void main(String[] args) {

        hasEqualSum( 1, 1, 2);

    }

    public static boolean hasEqualSum (int x, int y, int z) {
        if (x + y == z) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

}
