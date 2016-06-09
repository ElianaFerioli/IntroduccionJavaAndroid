import java.util.Scanner;

/**
 * Escribe un programa que calcule la suma de los N primeros números enteros positivos (el
 número N se leerá por teclado). Implementa dicho programa utilizando cada una de las tres
 estructuras de iteración de Java: while, do-while y for.

 */
public class Ej1_RP3 {
    public static void main(String[] args) {
        System.out.println("Este programa suma los N primeros números.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número: ");
        int num = s.nextInt();

        if(num<0) {
            do {
                System.out.print("Por favor introduzca un número positivo: ");
                num = s.nextInt();
            } while (num < 0);
        }
        System.out.println("Las sumas son: ");
        //Con while
        System.out.println("Con un while: ");
        int contador = 1;
        int suma = 0;
        while (contador <= num) {
            suma = suma + contador;
            contador++;
        }
        System.out.println("La suma con while es: " + suma);
        //Con do while
        contador = 1;
        suma = 0;
        do {
           suma = suma + contador;
           contador++;
        } while (contador <= num);
        System.out.println("La suma con el do while es: " + suma);
        //Con for
        contador = 1;
        suma = 0;
        for (int x = 1; x <= num; x++) {
            suma = suma + x;
        }
        System.out.println("La suma con for es: " + suma);
        s.close();
    }
}
