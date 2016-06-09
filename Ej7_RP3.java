import java.util.Scanner;

/**
 * Diseña un programa que lea un único número natural por teclado en una variable de tipo
 int y muestre por pantalla cuantos dígitos pares tiene. Por ejemplo: 3445621 tiene 4 dígitos
 pares; 55914 tiene 1 dígito par. NOTA: El dígito más a la derecha de un número puede
 obtenerse calculando el resto de la división por 10 y el número sin el dígito más a la
 derecha puede obtenerse dividiendo el número por 10. Ejemplo: 123 % 10 = 3; 123 / 10 =
 12.

 */
public class Ej7_RP3 {
    public static void main(String[] args) {
        System.out.println("Este progra verifica cuántos números pares tiene un número natural introducido por teclado.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número natural: ");
        int num = s.nextInt();
        int numerosPares = 0;
        num = Math.abs(num);
        while(num>0){
            int digito = num % 10;
            if((digito%2)==0){
                numerosPares++;
            }
            num = num/10;
        }
        System.out.println("La cantidad de dígitos pares es: " + numerosPares);
        s.close();
    }
}
