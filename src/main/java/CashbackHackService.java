package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        // Всегда возвращаем boundary, независимо от значения amount
        return boundary;
    }
}
