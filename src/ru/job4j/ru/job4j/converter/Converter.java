package ru.job4j.ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int ind = 180;
        int exeptedd = 3;
        int outd = Converter.rubleToDollar(ind);
        boolean passedd = exeptedd == outd;
        System.out.println("180 rubles are 3. Test result : " + passedd);
    }

}