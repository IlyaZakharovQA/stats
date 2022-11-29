package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void findAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 180;
        int actualAmount = service.getAmount(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void findAverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageAmount = 15;
        int actualAverageAmount = service.getAverageAmount(sales);
        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void findMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void findMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void findMonthsBelow() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthsBelow = 5;
        int actualMonthsBelow = service.monthsBelowAverage(sales);
        Assertions.assertEquals(expectedMonthsBelow, actualMonthsBelow);
    }

    @Test
    public void findMonthsAbove() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthsAbove = 5;
        int actualMonthsAbove = service.monthsAboveAverage(sales);
        Assertions.assertEquals(expectedMonthsAbove, actualMonthsAbove);
    }
}
