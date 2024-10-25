package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceJUnit4Test {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    // Этот тест добавлен, чтобы специально проверять неправильное поведение при сумме в 1000 рублей
    @Test
    public void shouldFailTestIfAmountIs1000() {  // Специальный падающий тест
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;  // Неправильное ожидаемое значение, чтобы тест намеренно упал

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);  // Тест намеренно должен упасть, чтобы ловить дефект
    }
}
