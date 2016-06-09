import java.util.Scanner;

/**
 * Escribe un programa que lea un valor entero, n, y a continuación calcule  a partir de la
 fórmula anterior multiplicando las primeras n fracciones de la parte derecha de la fórmula.
 Para comprobar el correcto funcionamiento del programa, con el valor n=20, el valor de 
 es aproximadamente 3.21378 (con n=300 el valor es 3.1468).
 */
public class Ej2_RP4 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula pi multiplicando pi por las n primeras fracciones de su fórmula.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero:  ");
        int num = s.nextInt();
        double pi = 4;
        double dividendo = 2;
        double divisor = 1;
        for(int x = 1; x <= num; x++){
            if((x%2)==0){
                dividendo = dividendo + 2;
            } else {
                divisor = divisor + 2;
            }
            pi = pi *(dividendo/divisor);
        }
        System.out.println("El valor de pi es: " + pi);
        s.close();
    }
}
