import java.util.Scanner;

/**
 * Escribe un programa que acepte como entrada desde teclado un número natural mayor que
 cero y dé como salida el resultado de sumar dos a dos los dígitos que aparecen en posiciones
 simétricas respecto al dígito central dentro del número dado como entrada. Por ejemplo :

 */
public class Ej5_RP5 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula el resultado de sumar dos a dos los dígitos de un número natural.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int num = s.nextInt();
        String resultado = sumaAdos(num);
        System.out.println(resultado);
        s.close();
    }

    //Funciones///
    /*
     * Averigua la longitud del dígito
     */
    private static int longitud(int x){
        int longitud = 0;
        while(x>0){
            x = x / 10;
            longitud++;
        }
        return longitud;
    }
    /*
     * Da vuelta un número
     */
    private static int daVuelta (int x) {
        int numero = x;
        //averigua la longitud del número
        int longitud = 0;
        while(x>0){
            x = x / 10;
            longitud++;
        }
        //da la vuelta al número
        int nuevoNum = 0;
        while(longitud>0){
            int digito = numero%10;
            numero = numero/10;
            nuevoNum = nuevoNum * 10 + digito;
            longitud--;
        }
        return nuevoNum;
    }

    /*
     *Suma dos a dos
     */
    private static String sumaAdos(int num){
        int volteado = daVuelta(num);
        int logitudVolteado = longitud(volteado);
        int longitudNum = longitud(num);
        String suma = "";
        if((longitudNum%2)==0){
            longitudNum = longitudNum / 2;
            while(longitudNum>0){
                int digitoNum = num%10;
                int digitoVolt = volteado%10;
                int s = digitoNum + digitoVolt;
                if(longitudNum!=1) {
                    suma = suma + " " + digitoVolt + " + " + digitoNum + " = " + s + ", ";
                } else {
                    suma = suma + " " + digitoVolt + " + " + digitoNum + " = " + s;
                }
                longitudNum--;
                num = num / 10;
                volteado = volteado / 10;
            }
        } else {
            longitudNum = (longitudNum / 2) + 1;
            while(longitudNum>0){
                if(longitudNum!=1) {
                    int digitoNum = num % 10;
                    int digitoVolt = volteado % 10;
                    int s = digitoNum + digitoVolt;
                    suma = suma + " " + digitoVolt + " + " + digitoNum + " = " + s + ", ";
                    longitudNum--;
                    num = num / 10;
                    volteado = volteado / 10;
                } else {
                    int digitoNum = num % 10;
                    suma = suma +  digitoNum;
                    longitudNum--;
                }
            }
        }
        return suma;
    }

}
