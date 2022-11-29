package ru.netology.stats;

public class StatsService {
    public int getAmount(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public int getAverageAmount(int[] sales) {
        int averageAmount = 0;
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
            averageAmount = amount / 12;
        }
        return averageAmount;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int monthsBelowAverage(int[] sales) {
        int averageAmount = getAverageAmount(sales);

        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int monthsAboveAverage(int[] sales) {
        int averageAmount = getAverageAmount(sales);

        int aboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}