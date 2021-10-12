package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        java.lang.System System;


        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        byte a = 100;
        short b = 250;
        int c = 1700;
        long d = 6086878894448900L;
        float e = 5.7f;
        double g = 9.9765754466;
    }

    public static void task2() {
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float bothBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух боксеров = " + bothBoxerWeight + " кг");
        float differenceInBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе бойцов = " + differenceInBoxersWeight + " кг");
    }

    public static void task3() {
        int bananas = 80;
        int sumBananas = 5;
        int milk = 105;
        int sumMilk = 2;
        int iceCream = 100;
        int sumIceCream = 2;
        int eggs = 70;
        int sumEggs = 4;
        float breakfastWeight = (bananas * sumBananas + milk * sumMilk + iceCream * sumIceCream + eggs * sumEggs) * 1.0f / 1000;
        System.out.println("Вес завтрака = " + breakfastWeight + " кг");
    }

    public static void task4() {
        int diet1 = 250;
        int diet2 = 500;
        int weightToLoose = 7000;
        int daysDiet1 = weightToLoose / diet1;
        System.out.println("Дней похудения на 1-ой диете - " + daysDiet1);
        int daysDiet2 = weightToLoose / diet2;
        System.out.println("Дней похудения на 2-ой диете - " + daysDiet2);
        int middleDaysDiet = (daysDiet1 + daysDiet2) / 2;
        System.out.println("Дней для похудения в среднем - " + middleDaysDiet);
    }

    public static void task5() {
        int marySalaryBeforeRaising = 67760;
        float marySalaryAfterRaising = marySalaryBeforeRaising * 1.1f;
        float raisingMarySalary = marySalaryAfterRaising - marySalaryBeforeRaising;
        System.out.println("Маша теперь получает " + marySalaryAfterRaising + " рублей." + " Годовой доход вырос на " + raisingMarySalary * 12);
        int denisSalaryBeforeRaising = 83690;
        float denisSalaryAfterRaising = denisSalaryBeforeRaising * 1.1f;
        float raisingDenisSalary = denisSalaryAfterRaising - denisSalaryBeforeRaising;
        System.out.println("Денис теперь получает " + denisSalaryAfterRaising + " рублей." + " Годовой доход вырос на " + raisingDenisSalary * 12);
        int kristinaSalaryBeforeRaising = 76230;
        float kristinaSalaryAfterRaising = kristinaSalaryBeforeRaising * 1.1f;
        float raisingKristinaSalary = kristinaSalaryAfterRaising - kristinaSalaryBeforeRaising;
        System.out.println("Кристина теперь получает " + kristinaSalaryAfterRaising + " рублей." + " Годовой доход вырос на " + raisingKristinaSalary * 12);
    }

    public static void task6() {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - (d * e))) * -1;
        System.out.println(result);
    }

    public static void task7() {
        int a = 5;
        int b = 7;
        a = a + b; //a=12;
        b = a - b; //b=5;
        a = a - b;

        System.out.println("a = " + a + " b = " + b);
    }

    public static void task8() {
        int a = 678;
        a = a / 10;
        int b = a % 10;
        System.out.println("b = " + b);


    }

}