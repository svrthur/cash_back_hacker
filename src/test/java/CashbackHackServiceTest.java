package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldFailTestIfAmountIs900() {  // Специальный падающий тест
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 200;  // Неправильное ожидаемое значение

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);  // Этот тест намеренно упадет
    }
}
