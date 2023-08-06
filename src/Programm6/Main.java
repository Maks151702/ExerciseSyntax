package Programm6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int enterYear;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        enterYear=scanner.nextInt();


        if(enterYear%4==0){
            System.out.println("Год высокосный");
        }else {
            System.out.println("Год не высокосный");
        }
    }
}
