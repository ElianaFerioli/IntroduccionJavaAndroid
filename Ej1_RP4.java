/**
 * Diseña un programa que muestre por pantalla un tablero de ajedrez, donde las posiciones
 blancas serán mostradas con el carácter ‘B’ y las posiciones negras serán mostradas con el
 carácter ‘N’. Un tablero de ajedrez tiene 8 filas y 8 columnas.
 */
public class Ej1_RP4 {
    public static void main(String[] args) {
        System.out.println("Este programa muestra un tablero de ajedrez hecho con caracteres.");
        for(int x = 0; x < 8; x++){
            for(int i = 0; i < 8; i++){
                if((x%2)==0){
                    if((i%2)==0){
                        System.out.print("B ");
                    } else {
                        System.out.print("N ");
                    }
                } else {
                    if((i%2)==0){
                        System.out.print("N ");
                    } else {
                        System.out.print("B ");
                    }
                }
            }
            System.out.println();
        }
    }
}

