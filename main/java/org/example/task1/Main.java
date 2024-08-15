package org.example.task1;

//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
//sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
//над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.


public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(3, 2.1));
        System.out.println(Calculator.multiply(5.2, 4.3));
        System.out.println(Calculator.subtract(21, 6));
        System.out.println(Calculator.divide(4, 2));

    }
}