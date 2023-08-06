package Programm9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        int numberSum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число");
        number=scanner.nextInt();

        for(int i=1; i<number;i++){
            numberSum=numberSum+i;
        }
        System.out.println("Сумма всех чисел от 1 до "+ number + " = "+numberSum);
    }
}
