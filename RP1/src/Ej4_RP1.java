import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

/**
     Escriba un programa que calcule la nota final de una asignatura. Para ello deberá leer por
     teclado la nota de la parte de teoría y la nota de la parte de problemas, y habrá de calcular la
     nota final considerando que la parte de teoría vale un 70% de la nota final y la de práctica un
     30%.
 */
public class Ej4_RP1 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula la nota final de una asignatura");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la nota de la parte de teoría: ");
        double notaTeoria = s.nextDouble();
        System.out.print("Por favor, introduzca la nota de la parte de problemas: ");
        double notaProblemas = s.nextDouble();
        double notaFinal = ((notaTeoria * 70) / 100) + ((notaProblemas * 30)/ 100);
        System.out.println("La nota final es " + notaFinal);
        s.close();
    }
}
