import java.util.Scanner;

/**
 * Created by Eliana on 13/06/2016.
 */
public class Ej7_RP5 {
    public static void main(String[] args) {
        System.out.println("Este programa descompone un número.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número mayor a 1: ");
        int num = s.nextInt();
        while(num<=1){
            System.out.print("El número tiene que ser mayor a 1: ");
            num = s.nextInt();
        }
        System.out.print("La descomposición del número es: ");
        descompone(num);
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
    private static int devuelvePrimos(int x){
        double num = x;
        int contador = 0;
        while (contador < 1){
            num++;
            if(esPrimo(num)){
                contador++;
            }
        }
        return (int)num;
    }
    /*
     * Descompone
     */
    private static void descompone(int x){
        int resu = 0;
        int i = 1;
        do {
            int primo = (int)devuelvePrimos(i);
            resu = x % primo;
            if (resu == 0) {
                System.out.print(primo + " ");
                x = x/primo;
            } else {
                i++;
            }
        } while (x >= 1);
    }
}
