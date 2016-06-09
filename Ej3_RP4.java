import java.util.Scanner;

/**
 * Diseña un algoritmo que lea un número natural n por teclado (mayor que 0) y calcule el n-
 ésimo número de la serie de Fibonacci. Los dos primeros números de esta serie son el cero
 y el uno, y a partir de éstos cada número se calcula realizando la suma de los dos
 anteriores
 */
public class Ej3_RP4 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula un número de la serie de Fibonacci.");
        Scanner s = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("Por favor, introduzca un número: ");
            num = s.nextInt();
        }while(num<=0);
        int fibonacci = 0;
        int auxiliarUno = 0;
        int auxiliarDos = 1;
        for(int x = 1; x < num; x++){
            auxiliarUno = auxiliarDos;
            auxiliarDos = fibonacci;
            fibonacci = auxiliarUno + auxiliarDos;
        }
        System.out.println(fibonacci);
        s.close();
    }
}