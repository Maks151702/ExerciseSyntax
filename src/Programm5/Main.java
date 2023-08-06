package Programm5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        firstNumber=scanner.nextInt();


        if(firstNumber%2==0){
            System.out.println("Число чётное");
        }else {
            System.out.println("Число нечётное");
        }
    }
}
