import java.util.Scanner;

/**
 * En una fábrica de coches se desea calcular el precio medio de un número de modelos de
 coche, leído desde teclado. Se pide dado un numero de modelos de coche, introducir el
 precio (en euros) de cada modelo de coche (para esto usaremos una estructura iterativa) y
 posteriormente calcular el precio medio de los modelos.

 */
public class Ej8_RP3 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula el valor medio de unos coches.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int num =  s.nextInt();
        int suma = 0;
        for(int x = 1; x <= num; x++){
            System.out.print("Precio del modelo " + x + ": \t\t");
            int precio = s.nextInt();
            suma = suma + precio;
        }
        System.out.println("El valor medio de los " + num + " modelos es: " + (suma/num));
        s.close();
    }
}
