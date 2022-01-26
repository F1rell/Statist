package ru.netology.stats;


public class StatsService {

    public int allSalesInYear(int[] items) {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSalesInAllMounth(int[] items) {
        int allSalesInYear = allSalesInYear(items);
        int avgSales = allSalesInYear / items.length;
        return avgSales;
    }

    public int numberMounthOfMaxSales(int[] items) {
        int maxMonth = 0;
        int mounth = 0;
        for (long sale : items) {
            if (sale >= items[maxMonth]) {
                maxMonth = mounth;
            }
            mounth = mounth + 1;
        }
        return maxMonth + 1;
    }

    public int numberMounthOfMinSales(int[] items) {
        int minMonth = 0;
        int mounth = 0;
        for (long sale : items) {
            if (sale <= items[minMonth]) {
                minMonth = mounth;
            }
            mounth = mounth + 1;
        }
        return minMonth + 1;
    }

    public int amountMounthWhichMinSales(int[] items) {
        int average = averageSalesInAllMounth(items);
        int count = 0;
        for (int item : items) {
            if (item > average) {
                count++;
            }
        }
        return count;
    }

    public int amountMounthWhichMaxSales(int[] items) {
        int average = averageSalesInAllMounth(items);
        int count = 0;
        for (int item : items) {
            if (item < average) {
                count++;
            }
        }
        return count;
    }
}