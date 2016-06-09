import java.util.Scanner;

/**
 * Realiza un programa que lea por teclado una secuencia de números enteros terminada en 0
 y diga cuál es el segundo mayor número de la secuencia. Si la secuencia tiene menos de
 dos números el programa sacará un mensaje informando de ello. Si no hay un segundo
 mayor (porque todos los números han sido iguales), el programa mostrará el mensaje
 correspondiente. El 0 no forma parte de la lista, sólo se utiliza para indicar el final de la
 misma
 */
public class Ej6_RP4 {
    public static void main(String[] args) {
        System.out.println("Este programa determina cuál es el segundo mayor número de una secuencia.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca una serie de números: ");
        int num = s.nextInt();
        int max = num;
        int segundoMax = 0;
        int contador = 0;

        while(num!=0){
            num = s.nextInt();
            contador++;
            if(num>max){
                segundoMax = max;
                max = num;
            }
            if((num<max)&&(num>segundoMax)){
                segundoMax = num;
            }
        }

        if(contador<2){
            System.out.println("La secuencia tiene menos de dos números.");
        } else if(segundoMax==0){
            System.out.println("Todos los números son iguales.");
        } else {
            System.out.println("El segundo mayor de la lista es: " + segundoMax);
        }
        s.close();
    }
}
