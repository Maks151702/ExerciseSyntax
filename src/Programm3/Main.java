package Programm3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціле число");
        number=scanner.nextInt();

        if(number>0){
            System.out.println("Число додатне");
        } else if(number==0) {
            System.out.println("Число є нулем");
        }else{
            System.out.println("Число є від'ємним");
        }
    }

}
