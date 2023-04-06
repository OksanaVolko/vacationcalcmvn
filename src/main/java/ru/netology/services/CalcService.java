package ru.netology.services;

public class CalcService {

    public int calculate(int income, int expenses, int threshold) {
        int money = 0; // количество денег на счете
        int count = 0; // счётчик месяцев отдыха
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                count++; // увеличиваем счётчик месяцев отдыха
            } else {
                money = money + income - expenses;
            }
        }

        return count;


    }
}


