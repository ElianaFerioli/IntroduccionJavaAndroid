import java.util.Scanner;

/**
     Escriba un programa que lea por teclado una cierta cantidad de segundos y muestre su
     equivalente en semanas, días, horas, minutos y segundos. Por ejemplo, si se lee la cantidad
     de 3672 segundos, la salida será: 0 semanas, 0 días, 1 hora, 1 minuto, 12 segundos.
 */
public class Ej8_RP1 {
    public static void main(String[] args) {
        System.out.println("Este programa convierte una cantidad de segundos en semanas, dias, horas, minutos y segundos.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca una cantidad de segundos: ");
        int cantidad = s.nextInt();
        int semanas = 0;
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        segundos = cantidad % 60;
        minutos = (cantidad %(60*60)) / 60;
        horas = (cantidad / (60*60))%24;
        dias = cantidad / (60*60*24)% 7;
        semanas = cantidad / (60*60*24*7);
        System.out.println("El resultado es: " + semanas + " semanas, " + dias + " dias, " + horas + " horas, "
                            + minutos + " minutos, " + segundos + " segundos.");
        s.close();
    }
}
