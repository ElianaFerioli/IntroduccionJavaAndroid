import java.util.Scanner;

/**
 * . Escribe un algoritmo que lea un número natural N mayor que cero por teclado y dibuje un
 rombo de asteriscos como el de la figura (para N=5):

 */
public class Ej2_RP5 {
    public static void main(String[] args) {
        System.out.println("Este programa dibuja una rombo con asteríscos.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int altura = s.nextInt();
        pintaRombo(altura);
    }

    //Funciones
     /*
     * Pinta el rombo
     */
    private static void pintaRombo(int h) {
        boolean invertida = false;
        for(int x = 1; x <= h; x++){
            pintaLinea(h, x, invertida);
            System.out.println();
        }
        invertida = true;
        for(int x = 1; x <= (h-1); x++){
           pintaLinea(h, x, invertida);
           System.out.println();
        }
    }
    /*
     * Pinta línea
     */
    private static void pintaLinea(int h, int l, boolean invertida) {
        if(!invertida) {
            for (int x = 0; x < h; x++) {
                if (x < h-l) {
                    System.out.print("  ");
                } else {
                    System.out.print("  * ");
                }
            }
        } else {
            for (int x = 0; x < h; x++) {
                if (x < l) {
                    System.out.print("  ");
                } else {
                    System.out.print("  * ");
                }
            }
        }
    }
}
