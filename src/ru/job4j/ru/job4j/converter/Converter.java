package ru.job4j.ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;

    }

    public static int rubleThreeDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */

    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int ind = 180;
        int exeptedd = 3;
        int outd = Converter.rubleThreeDollar(ind);
        boolean passedd = exeptedd == outd;
        System.out.println("180 rubles are 3. Test result : " + passedd);
    }

}