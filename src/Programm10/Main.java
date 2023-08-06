package Programm10;


public class Main {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }



    public static void main(String[] args) {

        Main main  = new Main();

        int result =  main.sum(7,3);
        System.out.println("Результат: "+ result);

    }
}
