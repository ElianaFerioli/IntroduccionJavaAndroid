import java.util.Scanner;

/**
 * Diseña un algoritmo que lea de teclado un número natural N mayor que cero y muestre las N
 primeras filas del siguiente triángulo.

 * Created by Eliana on 13/06/2016.
 */
public class Ej9_RP5 {
    public static void main(String[] args) {
        System.out.println("Este programa dibuja una pirámide con números.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce las filas de la pirámide: ");
        int altura = s.nextInt();
        pintaPiramide(altura);
    }

    //Funciones
    /*
     * Pinta la pirámide
     */
    private static void pintaPiramide(int h) {
        for(int x = 1; x <= h; x++){
            pintaLinea(h, x);
            System.out.println();
        }
    }
    /*
     * Pinta línea
     */
    private static void pintaLinea(int h, int l){
        int numero = l;
        for(int x = 0; x < (h+l)-1; x++){
            if(l>=10){
                numero = numero%10;
            }
            if(x<(h-l)){
                System.out.print("  ");
            } else if(x==(h-l)){
                if(l>=10) {
                    System.out.print(l%10 + " ");
                } else {
                    System.out.print(l + " ");
                }
            } else if(x<h) {
                numero++;
                if(numero==10){
                    numero = 0;
                }
                System.out.print(numero + " ");
            } else {
                if(numero==0) {
                    numero++;
                    System.out.print(numero + " ");
                } else if(numero == 1) {
                    numero--;
                    System.out.print(numero + " ");
                    numero = 10;
                } else {
                    numero--;
                    System.out.print(numero + " ");
                }
            }
        }
    }
}
