import java.util.Scanner;

/**
 * Escribe un programa que dibuje la siguiente figura dado por teclado un valor N de la
 altura (N debe ser par y menor de 20).
 * Created by Eliana on 13/06/2016.
 */
public class Ej10_RP5 {
    public static void main(String[] args) {
        System.out.println("Este programa dibuja un reloj de arena con números.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número par y menor a 20: ");
        int h = s.nextInt();

        while(((h%2)!=0)||(h>20)){
            System.out.print("Por favor, introduzca un número par y menor a 20: ");
            h = s.nextInt();
        }
        pintaReloj(h);
    }
    //Funciones
    /*
     * Pinta la pirámide
     */
    private static void pintaReloj(int h) {
        boolean invertida = true;
        for (int x = 1; x <= (h / 2); x++) {
            pintaLinea(h, x, invertida);
            System.out.println();
        }
        invertida = false;
        for (int x = 0; x < (h / 2); x++) {
            pintaLinea(h, x, invertida);
            System.out.println();
        }
    }
    /*
     * Pinta línea
     */
    private static void pintaLinea(int h, int l, boolean i){
        int numero = l - 1;
        if(i) {
            for (int x = 1; x <= h-l; x++) {
                if (x < l){
                    System.out.print("  ");
                } else {
                    if(x<=(h/2)) {
                        numero++;
                        System.out.print(numero + " ");
                    } else {
                        numero--;
                        System.out.print(numero + " ");
                    }
                }
            }
        } else {
            numero = (h/2 - l)-1;
            for (int x = 0; x < (h/2)+l; x++) {
                if(x < ((h/2)-l)-1){
                    System.out.print("  ");
                } else {
                    if(x<h/2) {
                        numero++;
                        System.out.print(numero + " ");
                    } else {
                        numero--;
                        System.out.print(numero + " ");
                    }
                }
            }
        }
    }
}
