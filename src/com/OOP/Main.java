package com.OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseTime time = new MyTime();

        System.out.println("Soatni kiriting: (Hour)");
        int hour = scanner.nextInt();
        System.out.println("Minutni kiriting: (Minute)");
        int minute = scanner.nextInt();
        System.out.println("Sekundni kiriting: (Second)");
        int second = scanner.nextInt();
        System.out.println();

        if ((hour>=0 && hour<24) && (minute>=0 && minute<60) && (second>=0 && second<60)){
            time.setTime(hour, minute, second);
            System.out.println("Kiritilgan vaqt ko'rinishi : " + time.toStringValues());

            System.out.println();
            System.out.println("nextHour : " + time.nextHour().toStringValues());
            System.out.println("nextMinute : " + time.nextMinute().toStringValues());
            System.out.println("nextSecond : " + time.nextSecond().toStringValues());
            System.out.println();
            System.out.println("previousHour : " + time.previousHour().toStringValues());
            System.out.println("previousMinute : " + time.previousMinute().toStringValues());
            System.out.println("previousSecond : " + time.previousSecond().toStringValues());
        } else {
            System.out.println("Iltimos, vaqt qiymatlarini to'g'ri kiriting. Yaroqsiz soat, daqiqa yoki soniya!");
        }
    }
}
