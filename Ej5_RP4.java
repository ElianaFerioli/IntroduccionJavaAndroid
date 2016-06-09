import java.util.Scanner;

/**
 * Escribe un algoritmo que lea por teclado una lista de números naturales terminada en 0 y
 muestre por pantalla la suma de todos los números primos que hay en ella. Un número
 natural es primo si sólo es divisible por 1 y por él mismo. El 1 no se considera primo.
 */
public class Ej5_RP4 {
    public static void main(String[] args) {
        System.out.println("Este programa cuenta cuántos números primos hay en una serie de números introducidos por teclado.");
        Scanner s = new Scanner(System.in);
        int num = 0;
        int sumaPrimos = 0;
        System.out.print("Por favor, introduzca una serie de números: ");
        do {
            num = s.nextInt();
            int contador = 0;
            if(num!=1) {
                for (int x = 1; x < num; x++) {
                    if ((num % x) == 0) {
                        contador++;
                    }
                }
                if (contador < 2) {
                    sumaPrimos = sumaPrimos + num;
                    contador = 0;
                }
            }
        }while(num!=0);
        System.out.println("La suma de los números primos es: " + sumaPrimos);
        s.close();
    }
}
