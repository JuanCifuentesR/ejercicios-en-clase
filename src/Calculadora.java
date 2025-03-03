import java.util.Random;
import java.util.Scanner;

public class Calculadora {
    public static void  main(String[] args) {
    int max = 100;
    int min = 1;
    int num1;
    int num2;
    String signoA;


    Scanner scanner = new Scanner(System.in);
    Random numAle = new Random();

    num1 = numAle.nextInt(max - min + 1) + min;
    num2 = numAle.nextInt(max - min + 1) + min;

        System.out.println("el primer numero sera " + num1);
        System.out.println("el segundo numero sera " + num2);

        System.out.println("ingrese la operacion que desee (signo)");
        signoA = scanner.next();

        double resultado = switch (signoA) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1/ num2;
            case "^" -> Math.pow(num1,num2);
            case "%" -> num1 % num2;
            default -> {
                System.out.println("el operador ingresado no es valido");
                yield Double.NaN;
            }
        };

        System.out.println("el resultado de "+ num1 +" "+ signoA+" " + num2 + " es: " + resultado);

    }
}
