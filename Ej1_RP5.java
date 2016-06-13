import java.util.Scanner;

/**
 * Escribe un programa que imprima una pirámide de dígitos como la de la figura, tomando
 como entrada por teclado el número de filas de la misma (debe ser menor de 10):
 */
public class Ej1_RP5 {
    public static void main(String[] args) {
        System.out.println("Este programa dibuja una pirámide con números.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce la altura de la pirámide: ");
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
        int numero = 0;
        for(int x = 0; x < (h+l)-1; x++){
            if(x<(h-l)){
                System.out.print("  ");
            } else if(x<h){
                numero++;
                System.out.print(numero + " ");
            } else {
                numero--;
                System.out.print(numero + " ");
            }
        }
    }
}
