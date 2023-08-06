package Programm11;

import java.util.PrimitiveIterator;

public class Main {
    public boolean verificationNumber(int number) {
        if (number <= 1) {
            return false; // Числа меньше или равные 1 не являются простыми
        }

        // Проверяем делители от 2 до корня из числа
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Main main  = new Main();

        int primeNumber=7;
        boolean isPrimeNumber =  main.verificationNumber(primeNumber);
        System.out.println(primeNumber + " является простым числом? " + isPrimeNumber);

    }
}
