package Programm12;

public class Main {
    public int lenght(String testString) {
        return testString.length();
    }



    public static void main(String[] args) {

        String testString ="Всегда надо пробовать";

        Main main  = new Main();

        int result =  main.lenght(testString);
        System.out.println("Длина строки: "+ result);

    }
}
