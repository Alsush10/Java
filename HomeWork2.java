package com.company;


import java.util.Scanner;

    public class Main
    {
        public static void main(String[] args) {
            System.out.println("№1:");
            int array_1[] = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < array_1.length; i++){
                System.out.print(array_1[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < array_1.length; i++){
                if (array_1[i] == 0)
                    array_1[i] = 1;
                else
                    array_1[i] = 0;
                System.out.print(array_1[i] + " ");
            }

            System.out.println("\n\n№2:");
            int n = 8;
            int array_2[] = new int[n];
            array_2[0] = 0;
            System.out.print(array_2[0] + " ");
            for (int i = 1; i < n; i++){
                array_2[i] += array_2[i-1] + 3;
                System.out.print(array_2[i] + " ");
            }

            System.out.println("\n\n№3:");
            int array_3[] = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array_3.length; i++){
                if (array_3[i] < 6)
                    array_3[i] *= 2;
                System.out.print(array_3[i] + " ");
            }

            System.out.println("\n\n№4:");
            int array_4[][] = new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if ((i == j) || (i == n - j - 1))
                        array_4[i][j] = 1;
                    System.out.print(array_4[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\n\n№5:");
            Scanner in = new Scanner(System.in);
            System.out.println("Введите n (размер массива):");
            n = in.nextInt();
            int array_5[] = new int[n];
            System.out.println("Введите значения массива:");
            for (int i = 0; i < n; i++){
                array_5[i] = in.nextInt();
            }
            int min = 0;
            int max = 0;
            for (int i = 1; i < n; i++){
                if (array_5[min] > array_5[i])
                    min = i;
                if (array_5[max] < array_5[i])
                    max = i;
            }
            System.out.println("Минимальный элемент = " + array_5[min] + "; максимальный элемент = " + array_5[max]);

            System.out.println("\n\n№6:");
            System.out.println(Task_6(array_5));
        }

        static boolean Task_6(int[] arr){
            int i = 0, j = arr.length - 1;
            int left = 0;
            int right = 0;
            while (i <= j){
                if (left <= right){
                    left += arr[i];
                    i++;
                }
                else{
                    right += arr[j];
                    j--;
                }
            }

            if (left == right)
                return true;
            return false;
        }
    }




