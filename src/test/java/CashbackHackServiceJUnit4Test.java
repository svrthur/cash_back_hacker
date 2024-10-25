package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceJUnit4Test {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100; // Ожидаем 100

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);  // Этот тест упадет
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0; // Ожидаем 0

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);  // Этот тест также упадет
    }

    // Тест ниже теперь тоже упадет, потому что метод всегда возвращает 200
    @Test
    public void shouldFailTestIfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 200; // Ожидаем 200

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual); // Этот тест упадет
    }
}
