import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {

        double peso;
        double estatura;
        double IMC;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su peso en kilogramos");
        peso = scanner.nextDouble();
        System.out.println("ingrese su estatura en metros");
        estatura = scanner.nextDouble();

        IMC = peso/(Math.pow(estatura,2));


        if (IMC<18.5){
            System.out.println("su IMC es: " + IMC);
            System.out.println("bajo peso");
        } else if (18.5<=IMC & IMC>=24.9) {
            System.out.println("su IMC es: " + IMC);
            System.out.println("normopeso");
        } else if (25<=IMC & IMC>=26.9) {
            System.out.println("su IMC es: " + IMC);
            System.out.println("sobre peso grado I");
        } else if (27<=IMC & IMC>=29.90) {
            System.out.println("su IMC es: " + IMC);
            System.out.println("sobre peso grado II");
        } else if (30<=IMC & IMC>=34.9) {
            System.out.println("su IMC es: " + IMC);
            System.out.println("obesidad de tipo I");
        } else if (35<=IMC & IMC>=39.9) {
            System.out.println("su IMC es: " + IMC);
            System.out.println("obesidad tipo II");
        } else if (40<=IMC & IMC>=49.9) {
            System.out.println("su IMC es: " + IMC);
            System.out.println("obesidad tipo III (mórbida)");
        } else if (IMC>50) {
            System.out.println("su IMC es: " + IMC);
            System.out.println("obesidad de tipo IV (extrema)");
        }else System.out.println("esta fuera del rango");


    }
}
