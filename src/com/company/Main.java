package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int temp = 34;
        int age = 35;
        System.out.println(nameofmetod(temp, age));
        System.out.println(generateRandomAge() + nameofmetod(generateRandomAge(), 9));
        System.out.println(nameofmetod(30, 13));
        System.out.println(nameofmetod(15, 12));
        System.out.println(nameofmetod(-27, 50));
        System.out.println(nameofmetod(23, 42));

    }

    private static String nameofmetod(int temp, int age) {
        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "Можно идти гулять";
        } else if (age > 0 && age <= 20 && temp >= 0 && temp <= 28) {
            return "можно идти гулять";
        } else if (age >= 45 && temp >= -10 && temp <= 25) {
            return "Можно идти гулять";
        } else
            return "Оставайтесь дома";
    }

    public static int generateRandomAge() {
        Random random = new Random();
        int randomage = random.nextInt(100);
        return randomage;
    }
}

    
