package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesTests {

    @Test
    void sumSalesInAllMounth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.allSalesInYear(sales);
        assertEquals(expected, actual);
    }

    @Test
    void avgSalesInAllMounth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSalesInAllMounth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void numberMounthOfMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.numberMounthOfMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void numberMounthOfMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.numberMounthOfMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void amountMounthWhichMinSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMounthWhichMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void amountMounthWhichMaxSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.amountMounthWhichMaxSales(sales);
        assertEquals(expected, actual);
    }
}
