import java.util.Scanner;

/**
 * Escribe un programa que calcule e imprima por pantalla los N primeros números primos,
 siendo N un número natural que se introduce por teclado. Por ejemplo, si N = 8, los primos
 que se mostrarán por pantalla son 2, 3, 5, 7, 11, 13, 17, 19.
 * Created by SamsungAndroid on 13/06/2016.
 */
public class Ej6_RP5 {
    public static void main(String[] args) {
        System.out.println("Este programa imprime por teclado los N primeros números primos.");
        Scanner s  = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int x = s.nextInt();
        imprimePrimos(x);
        s.close();
    }

    //Funciones
    /*
     * Establece si un número es primo
     */
    private static boolean esPrimo(double x){
        double raiz = Math.sqrt(x);
        boolean esPrimo = true;
        for(double i = 2.0; (i <= raiz)&&(esPrimo); i++){
            if((x%i)==0.0){
                esPrimo = false;
            }
        }
        return esPrimo;
    }
    /*
     * Imprime n números primos
     */
    private static void imprimePrimos(int x){
        double num = 2;
        int contador = 0;
        while (contador < x){
            if(esPrimo(num)){
                System.out.print((int) num + " ");
                contador++;
            }
            num++;
        }
    }
}
