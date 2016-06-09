import java.util.Scanner;

/**
 * Diseña un programa que lea una sucesión de números terminada en 0 y muestre la suma de
 los restos de dividir por 8 cada uno de los números de la sucesión. Por ejemplo, para la
 serie 3 9 2 10 0 el programa debería mostrar la salida 8.
 */
public class Ej6_RP3 {
    public static void main(String[] args) {
        System.out.println("Este programa suma el resto de dividir por 8 los números de una secuencia que termina en 0.");
        Scanner s = new Scanner(System.in);
        int secuencia = 0;
        System.out.print("Por favor, introduce una secuencia de números: ");
        int suma = 0;
        do {
            secuencia = s.nextInt();
            suma = suma + (secuencia%8);
        }while(secuencia != 0);
        System.out.println("La suma de los módulos de 8 de los números de la secuencia es: " + suma);
        s.close();
    }
}
