import java.util.Scanner;

/**
 * Diseña un algoritmo que lea un número entero n por teclado (distinto de 0). Después el
 usuario introducirá por teclado una secuencia de números enteros terminada en 0. El
 algoritmo debe determinar si el número n aparece o no en la secuencia.
 */
public class Ej5_RP3 {
    public static void main(String[] args) {
        System.out.println("Este programa verifica si un númmero N está dentro de una secuencia que termina en 0.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero: ");
        int num = s.nextInt();
        int secuencia = 0;
        boolean encontrado = false;
        System.out.print("Por favor, introduce una secuencia de números: ");
        do {
            secuencia = s.nextInt();
            if(secuencia == num){
                encontrado = true;
            }
        }while(secuencia != 0);
        if(encontrado){
            System.out.println("El número introducido se encuentra en la secuencia: ");
        } else {
            System.out.println("El número introducido no se encuentra en la secuencia");
        }
        s.close();
    }
}
