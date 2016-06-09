import java.util.Scanner;

/**
 * Escribe un algoritmo que encuentre el mayor, el menor y la media aritmética de una
 colección de N números leídos por el teclado donde N es el primero de los números.
 */
public class Ej4_RP3 {
    public static void main(String[] args) {
        System.out.println("Este programa dice cual es la media y el máximo y mínimo de una coleccion de números.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce una serie de números: ");
        int cantidad = s.nextInt();
        int contador = 1;
        int num = 0;
        int max = cantidad;
        int min = cantidad;
        double suma = cantidad;
        do{
            num = s.nextInt();
            suma = suma + num;
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
            contador++;
        }while(contador!=cantidad);
        System.out.println("El mayor de los números es: " + max);
        System.out.println("El menor de los números es: " + min);
        System.out.println("La media de los números es: " + (suma/(double)contador));
    }
}
