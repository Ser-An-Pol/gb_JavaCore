package ru.seranpol;

/**
 * Класс предоставляющий методы вывода результатов выполнения арифметических операций
 */
public class Decorate {

    /**
     * Конструктор класса с модификатором private, т.к.
     * данный класс предоставляет набор статичных методов
     */
    private Decorate() {
    }

    /**
     * Метод формирования строки вывода суммы
     * @param a - первый операнд (тип double)
     * @param b - второй операнд (тип double)
     * @param res - сумма a и b (тип double)
     * @return - строка вывода (тип String)
     */
    public static String printSum(double a, double b, double res) {
        return "(" + a + " + " + b + ") = " + res;
    }

    /**
     * Метод формирования строки вывода произведения
     * @param a - первый операнд (тип double)
     * @param b - второй операнд (тип double)
     * @param res - произведение a и b (тип double)
     * @return - строка вывода (тип String)
     */
    public static String printMult(double a, double b, double res) {
        return "(" + a + " * " + b + ") = " + res;
    }

    /**
     * Метод формирования строки вывода частного
     * @param a - первый операнд (тип double)
     * @param b - второй операнд (тип double)
     * @param res - частное a и b (тип double)
     * @return - строка вывода (тип String)
     */
    public static String printDiv(double a, double b, double res) {
        return "(" + a + " / " + b + ") = " + res;
    }

    /**
     * Метод формирования строки вывода разности
     * @param a - первый операнд (тип double)
     * @param b - второй операнд (тип double)
     * @param res - разность a и b (тип double)
     * @return - строка вывода (тип String)
     */
    public static String printSub(double a, double b, double res) {
        return "(" + a + " - " + b + ") = " + res;
    }
}
