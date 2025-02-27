import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int max = 10;
        int min = 1;
        int num1;

        Random rAle = new Random();

        num1 = rAle.nextInt(max - min + 1) + min;
        System.out.println("el numero de rondas es " + num1);

        int maxdado1 = 6;
        int mindado1 = 1;
        int resultadodado1;

        int resultadodado2;

        int sumadado1 = 0, sumadado2 = 0;

        boolean dado1 = true;
        int veces = 0;
        while (dado1 == true) {
            resultadodado1 = rAle.nextInt(maxdado1 - mindado1 + 1) + mindado1;
            sumadado1 += resultadodado1;
            veces++;
            System.out.println("el resultado del dado1 es: " + resultadodado1);


            if (veces >= num1) {
                dado1 = false;

                System.out.println();
                System.out.println();

            boolean dado2 = true;
            int veces2 = 0;
            while (dado2 == true) {
                resultadodado2 = rAle.nextInt(maxdado1 - mindado1 + 1) + mindado1;
                sumadado2 += resultadodado2;
                veces2++;
                System.out.println("el resultado del dado2 es: " + resultadodado2);

                if (veces2 >= num1) {
                    dado2 = false;

                }

            }


        }


    }
        System.out.println();
        System.out.println();

        System.out.println("la suma de los resultados del dado1 es: " + sumadado1);
        System.out.println("la suma de los resultados del dado2 es: " + sumadado2);

        if (sumadado1 > sumadado2){
            System.out.println("el ganador es el dado 1");
        }
        else{
            System.out.println();
            System.out.println("el ganador es el dado 2");
    }
}
}