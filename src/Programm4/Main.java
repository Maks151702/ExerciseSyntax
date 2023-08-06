package Programm4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstNumber;

        int secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        firstNumber=scanner.nextInt();
        System.out.println("Введите второе число:");
        secondNumber=scanner.nextInt();

        if(firstNumber>=secondNumber){
            System.out.println("Найбольшее число: "+ firstNumber);
        }else {
            System.out.println("Найбольшее число: "+ secondNumber);
        }
    }
}
