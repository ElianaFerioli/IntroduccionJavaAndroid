import java.util.Scanner;

/**
 * El usuario introduce un número natural n que representa a n objetos. La máquina decide
 quien empieza y alternativamente, el usuario y la máquina retiran cada uno 1 2 o 3
 objetos (es decir, elige restar 1, 2 o 3 a n). El que retira el último objeto pierde.
 En las condiciones del problema, es posible desarrollar un algoritmo para que siempre
 gane la máquina. Construir tal algoritmo.
 */
public class Ej9_RP4 {
    public static void main(String[] args) {
        System.out.println("Este programa estableces una serie de objetos que va retirando tanto la máquina como el usuario" +
                " el que retie el último, pierde.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número de objetos: " );
        int objetos  = s.nextInt();
        boolean maquina = true;
        if((objetos%2)==0){
            maquina = false;
        }
        int x = 0;
        while(objetos>0){
            if(maquina){
                //decide cuántos objetos retirar
                if(objetos==6){
                    x = 1;
                } else if ((objetos % 4 == 0)) {
                        x = 3;
                } else if ((objetos % 3) == 0) {
                       x = 2;
                } else if ((objetos % 2) == 0) {
                       x = 1;
                } else {
                       x = 2;
                }
                System.out.println("La máquina retira " + x + " objetos.");
                objetos = objetos - x;
                System.out.println("Quedan " + objetos + " objetos.");
                maquina = false;
            } else {
                System.out.print("¿Cuántos objetos quiere quitar?: ");
                x = s.nextInt();
                objetos = objetos - x;
                System.out.println("Quedan " + objetos + " objetos. ");
                maquina = true;
            }
        }
        s.close();
    }
}
