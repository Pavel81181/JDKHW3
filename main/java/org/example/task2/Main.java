package org.example.task2;

//Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
//и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
//элементы одного типа по парно по индексам.


public class Main {

    public static <T> boolean compare(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].getClass().equals(arr2[i].getClass())) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Integer[] intArr1 = {1, 2, 3, 4, 5};
        Integer[] intArr2 = {5, 4, 3, 2, 1};
        System.out.println("Результат для целочисленных массивов: " + compare(intArr1, intArr2));
        String[] stringArr1 = {"Hello", "World"};
        String[] stringArr2 = {"Hi", "Hi"};
        System.out.println("Результат для строковых массивов: " + compare(stringArr1, stringArr2));
        Double[] doubleArray1 = {1.5, 2.4, 3.7, 4.9, 5.5};
        Double[] doubleArray2 = {1.5, 2.4, 3.7};
        System.out.println("Результат если массивы разной длинны: " + compare(doubleArray1, doubleArray2));
        System.out.println("Результат если массивы разных типов: " + compare(stringArr1, intArr1));



    }



}
