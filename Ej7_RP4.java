import java.util.Scanner;

/**
 * Escribe un algoritmo que lea por teclado una lista de números enteros terminada en 0, y
 que encuentre y escriba en la pantalla la posición de la primera y de la última ocurrencia
 del número 12 dentro de la lista. Si el número 12 no está en la lista, el algoritmo debería
 escribir 0. Por ejemplo, si el octavo número de la lista es el único 12, entonces 8 sería la
 primera y la última posición de las ocurrencias de 12.
 */
public class Ej7_RP4 {
    public static void main(String[] args) {
        System.out.println("Este programa determina la posición de la primer y última ocurrencia del número 12.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca una serie de números: ");
        int num = 0;
        int contador = 1;
        int primera = 0;
        int ultima = 0;
        do{
            num = s.nextInt();
            if((num==12)&&(primera==0)){
                primera = contador;
            } else if((num==12)&&(primera!=0)){
                ultima = contador;
            }
            contador++;
        }while(num!=0);
        if((primera!=0)&&(ultima!=0)){
            System.out.println("La primer ocurrencia es la número " + primera);
            System.out.println("La última ocurrencia es la número " + ultima);
        } else if(((primera!=0)&&(ultima==0))||(primera==0)&&(ultima!=0)){
            if(primera!=0){
                System.out.println("La primer y última ocurrencia es la número " + primera);
            } else {
                System.out.println("La primer y última ocurrencia es la número " + ultima);
            }
        } else {
            System.out.println("La primer y última ocurrencia es la número 0");
        }
        s.close();
    }
}
