package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    // Метод изменен так, чтобы всегда возвращать 200
    public int remain(int amount) {
        return 200; // Это приведет к падению тестов
    }
}
