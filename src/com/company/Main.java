package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Zadanie 1
         */
        float fahrenheitTemp;
        float celsiusTemp;
        System.out.println("Zadanie 1:");
        System.out.println("Podaj wartosc w stopniach Celsjusza:");
        celsiusTemp = scanner.nextFloat();

        fahrenheitTemp = (float) 1.8 * celsiusTemp + 32;

        System.out.println(""+celsiusTemp+" stopni Celsjusza to: "+fahrenheitTemp+" Fahrenheitow");

        /**
         * Zadanie 2
         */
        System.out.println("Zadanie 2:");
        int[] numbers = new int[3];
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("Podaj "+(i+1)+" liczbe");
            numbers[i] = scanner.nextInt();
        }
        int min = numbers[0];
        int max = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] < min)
            {
                min = numbers[i];
            }
            else
            {
                max = numbers[i];
            }
        }
        System.out.println("Liczba najmniejsza: "+min);
        System.out.println("Liczba najwieksza: "+max);
        System.out.println();

        /**
         * Zadanie 3
         */
        System.out.println("Zadanie 3:");
        System.out.print("Podaj swoja wage w KG: ");
        double weight = scanner.nextDouble();

        System.out.print("Podaj swoj wzrost w CM: ");
        double height = scanner.nextDouble();

        double bmi = weight / (Math.pow(height / 100, 2));

        System.out.println("BMI: " +bmi);

        if(bmi > 24.9)
        {
            System.out.println("To jest nadwaga!");
        }
        else if(bmi < 18.5)
        {
            System.out.println("To jest niedowaga!");
        }
        else {
            System.out.println("To jest poprawna waga!");
        }

        /**
         * Zadanie 4
         */
        System.out.println();
        System.out.println("Zadanie 4");
        System.out.print("Podaj swój dochod:");
        float gain = scanner.nextFloat();
        double tax = 0;
        System.out.println("Twoj dochod to: "+gain);
        if(gain <  85528.0)
        {
            System.out.println("Twoj podatek to 18% podstawy minus 556,02zl");
            tax = ((gain * 18) / 100) - 556.02;
            System.out.println("Podatek wynosi: "+tax);
        }
        else
        {
            System.out.println("Twoj podatek wynosi 14.839,02zl plus +32% nadwyzki ponad 85.528,00");
            tax = 14839.02 + ((gain * 32) / 100);
            System.out.println("Podatek wynosi: "+tax);
        }

    }
}
