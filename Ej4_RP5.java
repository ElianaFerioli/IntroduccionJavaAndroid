import java.util.Scanner;

/**
 * Escribe un programa que tome como entrada desde teclado dos números naturales (mayores
 que cero) "N" e "i", e imprima en pantalla el dígito que ocupa la posición i-ésima del
 número N. Si i es mayor que el número de dígitos de N, se escribirá en pantalla -1. Por
 ejemplo, para N = 25064 e i = 2, el resultado es el dígito 6, y para i = 7, el resultado es -1.
 */
public class Ej4_RP5 {
    public static void main(String[] args) {
        System.out.println("Este programa averígua el dígito que se encuentra en un lugar indicado. ");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número mayor a 0: ");
        int num = s.nextInt();
        System.out.print("Por favor, introduzca la posición del número que quiere buscar: ");
        int pos = s.nextInt();
        System.out.print("El resultado es: " + buscaDigito(num, pos));


    }
    //Funciones/////
    /*
     * Averigua la longitud del dígito
     */
    private static int longitud(int x){
        int longitud = 0;
        while(x>0){
            x = x / 10;
            longitud++;
        }
        return longitud;
    }

    /*
     * Averigua el dígito de una posicion
     */
    private static int buscaDigito(int x, int p){
        int longitud = longitud(x);
        //Averigua el dígito
        int digito = 0;
        if(longitud < p) {
            digito = -1;
        } else {
            for(int i = 0; i < p; i++){
                digito = x%10;
                x = x/10;
            }
        }
        return digito;
    }
}
