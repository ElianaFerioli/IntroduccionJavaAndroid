import java.util.Scanner;

/**
 * El usuario introduce un límite inferior, un límite superior y piensa un número en ese
 rango. El ordenador tiene que acertarlo. Para ello el ordenador propone un número y el
 usuario responde con -1, 1 o 0. Si la respuesta es -1 significa que el número pensado por
 el usuario es menor que el propuesto por el ordenador. Si la respuesta es 1 significa que
 el número pensado es mayor que el propuesto. Si la respuesta es 0 significa que se ha
 acertado el número pensado y el programa termina.

 */
public class Ej8_RP4 {
    public static void main(String[] args) {
        System.out.println("Este programa adivina el número que usted está pensando.");
        System.out.println("Introduzca -1 si el número es menor, 1 si el número es mayor y 0 si se ha acertado.");
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el límite inferior: ");
        int limiteInferior = s.nextInt();
        System.out.print("Introduzca un límite superior: ");
        int limiteSuperior = s.nextInt();
        System.out.println("Piense un número dentro de ese rango.");
        int respuesta = 0;
        int num = (limiteSuperior-limiteInferior)/2 + 1;
        do {
            System.out.print("¿El número que está pensando es el " + num + "?: ");
            respuesta = s.nextInt();
            if(respuesta==-1){
                limiteSuperior = num;
                num = ((limiteSuperior-limiteInferior)/2) + limiteInferior;
            } else {
                limiteInferior = num;
                num = ((limiteSuperior-limiteInferior)/2) + limiteInferior;
            }
        }while(respuesta!=0);
        s.close();
    }
}
