package ru.job4j.ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        return left > right ? left : right;
    }
}
