package com.company;

public class Main {

    public static void main(String[] args) {
        byte typeByte = 65;
        System.out.println("byte = " + typeByte);
        short typeShort = 25364;
        System.out.println("short = " + typeShort);
        int typeInt = -1447463777;
        System.out.println("int = " + typeInt);
        long typeLong = 8823374123876775665L;
        System.out.println("long = " + typeLong);
        float typeFloat = 22.3f;
        System.out.println("float: " + typeFloat);
        double typeDouble = 7.244;
        System.out.println("double: " + typeDouble);
        char typeChar = 'и', ch = 119; // символ 'w'
        System.out.println("char: = " + typeChar + " " + ch);
        boolean typeBoolean = true;
        System.out.println("boolean: " + typeBoolean);


        String typeString = "Hello \nworld";
        System.out.println("№1: " + Task_1(2, 3, 6, 2));
        System.out.println("№2: " + Task_2(5, 7));
        System.out.print("№3: ");
        Task_3(5);
        System.out.println("№4: " + Task_4(-7));
        System.out.print("№5: ");
        Task_5("Алсу");
        System.out.print("№6: ");
        Task_6(2000);
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
            System.out.println("Невисокосный");
        }
    }
}
