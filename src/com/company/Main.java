package com.company;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Подождите пожалуйста");
        Generator generator = new Generator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер машины: ");
        String number = scanner.next();

            long m = System.nanoTime();
            if (generator.numberAR.contains(number)) {
                System.out.println("Поиск перебором: номер найден, поиск занял " + (double) (System.nanoTime() - m) + " нс");
            } else {
                System.out.println("Поиск перебором: номер не найден, поиск занял " + (double) (System.nanoTime() - m) + " нс");
            }


            m = System.nanoTime();
            Collections.sort(generator.numberAR);
            if (Collections.binarySearch(generator.numberAR, number) > 0) {
                System.out.println("Бинарный поиск: номер найден, поиск занял " + (double) (System.nanoTime() - m) + " нс");
            } else {
                System.out.println("Бинарный поиск: номер не найден, поиск занял " + (double) (System.nanoTime() - m) + "нс");
            }


            m = System.nanoTime();
            if (generator.numberHS.contains(number)) {
                System.out.println("Поиск в HashSet: номер найден, поиск занял " + (double) (System.nanoTime() - m) + " нс");
            } else {
                System.out.println("Поиск в HashSet: номер не найден, поиск занял " + (double) (System.nanoTime() - m) + " нс");
            }

            m = System.nanoTime();
            if (generator.numberTR.contains(number)) {
                System.out.println("Поиск в TreeSet: номер найден, поиск занял " + (double) (System.nanoTime() - m) + " нс");
            } else {
                System.out.println("Поиск в TreeSet: номер не найден, поиск занял " + (double) (System.nanoTime() - m) + " нс");
            }
    }
}
