package arbolito;

import java.util.Scanner;

public class Arbolito {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese la altura del arbol ideal para su navidad");
        System.out.println("-------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int altura=sc.nextInt();
        System.out.println("----------------------------");
        for (int fila = 0; fila < altura; fila++) {
            //espacios en blanco
            for (int espacio = 0; espacio < (altura - fila - 1); espacio++) {
                System.out.print(" ");
            }
            //asteriscos
            for (int asterisco = 0; asterisco < (fila * 2) + 1; asterisco++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        //tronco
        int largoTronco = 3;
        for (int base = 0; base < largoTronco; base++) {
            //espacion en blanco
            for (int espacio = 0; espacio < (altura - 2); espacio++) {
                System.out.print(" ");
            }
            for (int tronco = 0; tronco < 3; tronco++) {
                System.out.print("|");
            }
            System.out.println("");
        }
        System.out.println("----------------------------");

      
    }
}
/*
    *
   ***
  *****
 *******
*********    
   |||
 */
