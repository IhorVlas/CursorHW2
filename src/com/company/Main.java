package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //1. Заповнити масив тільки парними числами

        System.out.print("1. Парные числа: ");
        int num = 0;
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            if (num % 2 == 0) {
                arr1[i] = num;
                System.out.print(num + " ");
                num++;
            } else {
                num++;
                System.out.print(num + " ");
            }
            num++;
        }

        //2. Заповнити масив рандомними числами

        System.out.print("\n2. Случайные числа: ");
        Random random = new Random();
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt((100 - 1) + 1);
            System.out.print(arr2[i] + " ");
        }

        //3. Вивести середнє значення масиву

        System.out.print("\n3. Среднее значение: ");
        float numSumm = 0;
        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = random.nextInt((100 - 1) + 1);
            numSumm += arr3[i];
        }
        System.out.print(numSumm / arr3.length);

        //4. Вивести суму всіх значень кратних 3

        System.out.print("\n4. Сумма значений кратных 3: ");
        int summNumMultipleThree = 0;
        int[] arr4 = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            int randomNum = random.nextInt((100 - 1) + 1);
            arr4[i] = randomNum;
            if (randomNum % 3 == 0) {
                summNumMultipleThree += arr4[i];
            }
        }
        System.out.print(summNumMultipleThree);

        //5. Вивести значення всіх парних індексів масиву

        System.out.print("\n5. Значения чисел парных индексов: ");
        int[] arr5 = new int[10];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i;
            if (i % 2 == 0) {
                System.out.print(arr5[i] + " ");
            }
        }

        //6. Просортувати масив в порядку зростання

        System.out.print("\n6. масив по возрастанию: ");
        int[] arr6 = new int[10];
        for (int i = 0; i < arr6.length; i++) {
            int randomNum = random.nextInt((100 - 1) + 1);
            arr6[i] = randomNum;
        }
        Arrays.sort(arr6);
        System.out.print(Arrays.toString(arr6));

        //7. Вивести найменше значення в масиві

        System.out.print("\n7. Наименшее значение: ");
        int[] arr7 = new int[10];
        for (int i = 0; i < arr7.length; i++) {
            int randomNum = random.nextInt((100 - 1) + 1);
            arr7[i] = randomNum;
        }
        Arrays.sort(arr7);
        System.out.print(arr7[0]);

        //8. Вивести найбільше значення масиву

        System.out.print("\n8. Наибольшее значение: ");
        int[] arr8 = new int[10];
        for (int i = 0; i < arr8.length; i++) {
            int randomNum = random.nextInt((100 - 1) + 1);
            arr8[i] = randomNum;
        }
        Arrays.sort(arr8);
        System.out.print(arr8[arr8.length - 1]);

        //9. Вивести суму значень всіх парних індексів

        System.out.print("\n9. Сумма значений парных индексов: ");
        int summNumMultipleTwoo = 0;
        int[] arr9 = new int[10];
        for (int i = 0; i < arr9.length; i++) {
            int randomNum = random.nextInt((100 - 1) + 1);
            arr9[i] = randomNum;
            if (randomNum % 2 == 0) {
                summNumMultipleTwoo += arr9[i];
            }
        }
        System.out.print(summNumMultipleTwoo);

        //10. Вивести перших 20 символів з таблиці ASCI

        System.out.print("\n10. 65-84 из ASCII: ");
        int charAscii = 65;
        int[] arr10 = new int[20];
        for (int i = 0; i < arr10.length; i++) {
            arr10[i] = charAscii;
            char result = (char) charAscii;
            System.out.print(result);
            charAscii++;
        }

        //* (завдання з зірочкою)
        //Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними

//        System.out.print("\n*. поменяные местами чет нечет: ");
//
//        int[] arr11 = new int[10];
//        for (int i = 0; i < arr11.length; i++) {
//            int randomNum = random.nextInt((100 - 1) + 1);
//            arr11[i] = randomNum;
//
//        }

// ---------------------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("\nВторой вариант:");

        // Второй вариант решения заданий 2 - 9

        float numSumm2 = 0;
        int summNumMultipleTwoo2 = 0;
        int summNumMultipleThree2 = 0;
        String pair = "";

        Random random2 = new Random();

        int[] arr = new int[5];
        System.out.print("\n2. Случайные числа: ");
        for (int i = 0; i < arr.length; i++) {
            int randomNum = random2.nextInt((10 - 1) + 1);
            arr[i] = randomNum;
            System.out.print(arr[i] + " ");
            numSumm2 += arr[i];
            if (randomNum % 2 == 0) {
                summNumMultipleTwoo2 += arr[i];
            }
            if (randomNum % 3 == 0) {
                summNumMultipleThree2 += arr[i];
            }
            if (i % 2 == 0) {
                pair += (arr[i] + " ");
            }
        }
        Arrays.sort(arr);

        System.out.print("\n3. Среднее значение: " + (numSumm2 / arr.length));
        System.out.print("\n4. Сумма значений кратных 3: " + summNumMultipleThree2);
        System.out.print("\n5. Значения чисел парных индексов: " + pair);
        System.out.print("\n6. масив по возрастанию: " + Arrays.toString(arr));
        System.out.print("\n7. Наименшее значение: " + arr[0]);
        System.out.print("\n8. Наибольшее значение: " + arr[arr.length - 1]);
        System.out.print("\n9. Сумма значений парных индексов: " + summNumMultipleTwoo2);
    }
}

