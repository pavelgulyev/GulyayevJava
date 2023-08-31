package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Example_1();
        Example_2();
        Example_3();
        Example_4();


    }
    public static void Example_1(){
        System.out.println("Задание 1 ");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = input.nextInt();
        if(number > 7) {
            System.out.println("Привет");
        }
    }
    public static void Example_2(){
        System.out.println("\nЗадание 2 ");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = input.nextLine();
        if(name == "Вячеслав") {
            System.out.println("Привет, Вячеслав");
        }
        else{
            System.out.println("Нет такого имени");
        }
    }
    public static void Example_3(){
        System.out.println("\nЗадание 3: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void Example_4(){
        System.out.println("\nЗадание 4: ");
        System.out.print("Данная скобочная последовательность не является правильной, так как количество открывающих и закрывающих скобок не совпадает.\n" +
                "\n" +
                "Чтобы сделать эту последовательность правильной, необходимо изменить одну из закрывающих скобок на открывающую, чтобы количество открывающих скобок стало равно количеству закрывающих скобок и каждой открывающей скобке соответствовала закрывающая скобка. Например: [((())()(()))].");
    }
}

