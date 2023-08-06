package Programm8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число");
        number=scanner.nextInt();

        for(int i=1;i<=10; i++){
            System.out.println(i +"*" + number+" = " + number*i);
        }
    }
}
