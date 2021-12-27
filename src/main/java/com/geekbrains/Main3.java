package com.geekbrains;

import java.util.Arrays;

public class Main3 {

    // Д/з № 3: 22.12.2021

    public static void main(String[] args) {
        // Вывод для пятого задания
        System.out.println(Arrays.toString(arrLen(5, 3)));

        // #1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(arr));


        // #2

        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr2));


        // #3

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }

            System.out.println(Arrays.toString(arr3));
        }


        // #4

        int[][] cub = new int[5][5];
        for (int i = 0; i < cub.length; i++) {
            for (int j = 0; j < cub.length; j++) {
                if (cub[i] == cub[j]) {
                    cub[i][j] = 1;
                }
                System.out.print(cub[i][j] + " ");
            }
            System.out.println();
        }
    }

    // #5

    public static int[] arrLen(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}

