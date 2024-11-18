package ru.seranpol;

public class Main {

    /**
     * Точка входа в программу. Метод осуществляет тестовый прогон операций
     * простейшего калькулятора
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(Decorate.printSum(20.5, 5.1, Culculator.sum(25.5, 5.1)));
        System.out.println(Decorate.printMult(20.5, 5.1, Culculator.mult(25.5, 5.1)));
        System.out.println(Decorate.printDiv(20.5, 5.1, Culculator.div(25.5, 5.1)));
        System.out.println(Decorate.printSub(20.5, 5.1, Culculator.sub(25.5, 5.1)));
    }
}