import java.util.Random;
import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        int max = 3;
        int min = 1;
        int numR;
        int Dinero;
        int perdido = 0;
        boolean seguirjugando = true;
        String respuesta;


        Scanner scanner = new Scanner(System.in);
        Random rAle = new Random();

        System.out.println("ingrese la cantidad de dinero que desea apostar");
        Dinero = scanner.nextInt();



        while (seguirjugando){
            numR = rAle.nextInt(max - min + 1) + min;

            if (numR==1){
                Dinero = Dinero*2;
                System.out.println("tu numero es 1 asi que tu dinero se multiplicara " + Dinero );
                System.out.println("¿desea seguir jugando?");
                respuesta= scanner.next();
                if (respuesta.equals("no")){
                    seguirjugando=false;

                }else {
                    seguirjugando = true;
                }
            } else if (numR==2) {
                Dinero = Dinero/2;
                System.out.println("tu numero es 2 asi que tu dinero se divide en 2: " + Dinero);
                System.out.println("¿desea seguir jugando?");
                respuesta= scanner.next();
                if (respuesta.equals("no")) {

                    seguirjugando = false;
                }else {
                    seguirjugando=true;
                }

            }else {
                System.out.println("tu numero es 3 asi que has perdido");
                break;
            }


        }

        }



    }

