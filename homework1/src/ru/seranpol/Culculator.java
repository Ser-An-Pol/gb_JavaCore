package ru.seranpol;

/**
 * Класс примитивного калькулятора
 */
public class Culculator {

    /**
     * Конструктор класса с модификатором private, т.к.
     * данный класс предоставляет набор статичных методов
     */
    private Culculator() {
    }

    /**
     * Метод вычисляет сумму двух предоставленных операндов
     * @param a - первый операнд (тип double)
     * @param b - второй операнд (тип double)
     * @return - сумма a и b (тип double)
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Метод вычисляет произведение двух предоставленных операндов
     * @param a - первый операнд (тип double)
     * @param b - второй операнд (тип double)
     * @return - произведение a и b (тип double)
     */
    public static double mult(double a, double b) {
        return a*b;
    }

    /**
     * Метод вычисляет частное двух предоставленных операндов
     * @param a - первый операнд (тип double)
     * @param b - второй операнд (тип double)
     * @return - частное a и b (тип double)
     */
    public static double div(double a, double b) {
        return a/b;
    }

    /**
     * Метод вычисляет разность двух предоставленных операндов
     * @param a - первый операнд (тип double)
     * @param b - второй операнд (тип double)
     * @return - разность a и b (тип double)
     */
    public static double sub(double a, double b) {
        return a - b;
    }
}
