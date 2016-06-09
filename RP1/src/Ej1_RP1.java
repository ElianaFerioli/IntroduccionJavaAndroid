/*
    El siguiente programa escrito en Java calcula la cantidad bruta y neta a pagar por un trabajo
    realizado en función de las horas y días trabajados. Sin embargo, en el momento en que se
    intenta compilar se producen una serie de errores. El alumno debe localizar dichos errores y
    corregirlos. Para ello debe examinar los mensajes que proporciona el compilador e
    interpretarlos convenientemente.
 */


import java.util.Scanner;

public class Ej1_RP1 {
    static final double tasa = 25.0;
    static final double PRECIO_HORA = 60.0;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double horas,dias,total,neto;
        System.out.print("Introduzca las horas trabajadas: ");
        horas = teclado.nextDouble();
        System.out.print("Introduzca los dias trabajados: ");
        dias = teclado.nextDouble();
        total = horas*dias*PRECIO_HORA;
        neto = total-tasa;
        System.out.println("El valor total a pagar es: " + total);
        System.out.print("El valor neto a pagar es: " + neto);
        teclado.close();
    }
}
