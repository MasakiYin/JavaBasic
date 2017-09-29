package practice01;
/*
 * PTra01_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra01_04 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {10, 20, 30, 40, 50};

        b = a;
        b[0] = 100;

        System.out.println(b[1]);
    }
}

