package com.company;

public class Main {

    public static void main(String[] args) {
        byte arg_byte = 5;

        System.out.println(Task_1(2, 3, 6, 2));
        System.out.println(Task_2(5, 7));
        Task_3(5);
        System.out.println(Task_4(-7));
        Task_5("Алсу");
        Task_6(2100);
    }

    static double Task_1(int a, int b, int c, int d){
        return a * (b + c / d);
    }

    static boolean Task_2(int a, int b){
        if ((a + b <= 20) && (a + b >= 10))
            return true;
        return false;
    }

    static void Task_3(int a){
        if (a < 0)
            System.out.println("Отрицательное");
        else
            System.out.println("Положительное");
    }

    static boolean Task_4(int a){
        if (a < 0)
            return true;
        return false;
    }

    static void Task_5(String s){
        System.out.println("Привет, " + s + "!");
    }

    static void Task_6(int a){
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
        {
            System.out.println("Високосный");
        }
        else{
            System.out.println("Не високосный");
        }
    }
}
