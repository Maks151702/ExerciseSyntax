package Programm2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstNumber;

        int secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        firstNumber=scanner.nextInt();
        System.out.println("Введіть друге число");
        secondNumber=scanner.nextInt();
        System.out.println("Сума ваших чисел = " + (firstNumber+secondNumber));
    }
}
