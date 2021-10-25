/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_mate;

import java.util.Scanner;

/**
 *
 * @author msiwi
 */
public class Actividad2_Mate {

    static void leerinf(Scanner line, String n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.printf("\nEscribe la " + (i + 1) + " oracion: ");
            Scanner sc = new Scanner(System.in);
            n[i] = sc.nextLine();
        }
    }

    static void mostrarinf(String n[]) {
        char identificador = 'p';
        for(int a=0; a<n.length;a++){
            System.out.println(identificador + ": " + n[a]);
            identificador++;
        }
        for (int i = 0; i < n.length; i++) {
            if (i <= n.length) {
                if (i < n.length-1) {
                    System.out.print(n[i] + " " + "y" + " ");
                } else {
                    System.out.print(n[i]);
                }
            }
        }
        System.out.println(" \n");

        for (int i = 0; i < n.length; i++) {
            if (i <= n.length) {
                if (i < n.length-1) {
                    System.out.print(n[i] + " " + "o" + " ");
                } else {
                    System.out.print(n[i]);
                }
            }
        }

        System.out.println(" \n");

        for (int i = 0; i < n.length; i++) {
            if (i <= n.length) {
                if(i>=2){ 
                    System.out.print(" Pero ");
                }
                if (i < 1) {
                    System.out.print("Si" + " " + n[i] + " " + "Entonces ");
                } else{
                   
                    System.out.print(n[i]);
                }
            }
        }
        System.out.println(" \n");

    }

    public static void main(String[] args) {
        // Inicializamos un Scanner tec
        Scanner tec = new Scanner(System.in);
        // Declaracion de variables
        int n, opc;
        boolean ind = false;

        System.out.printf("¿Cuántas proposiciones requieres?: ");
        n = tec.nextInt();

        String oracion[] = null;
        tec.nextLine();
        oracion = new String[n];

        do {
            System.out.printf("*******************************************************************"
                    + "\n1. Agregar oraciones"
                    + "\n2. Mostrar datos"
                    + "\n3. Reiniciar programa"
                    + "\n4. Salir");
            System.out.printf("\nIngrese la opcion: ");
            opc = tec.nextInt();
            System.out.printf("\n*******************************************************************\n");

            switch (opc) {
                case 1:
                    if (ind) {
                        System.out.println("\n Ya registro información...");
                        break;
                    }
                    leerinf(tec, oracion);
                    ind = true;
                    break;
                case 2:
                    if (!ind) {
                        System.out.println("\n No ha registrado información...");
                        break;
                    }
                    mostrarinf(oracion);
                    break;
                case 3:
                    oracion = null;
                    System.out.println("\nEl programa se ha reiniciado con exito!!!");
                    break;
                case 4:
                    ind = true;
                    System.out.println("\nFin del programa, hasta luego!!"
                            + "\n*******************************************************************");
                    break;
                default:
                    System.out.println("\nLas opciones deben ser del 1-4!");
                    break;
            }
        } while (opc != 4);
    } // Fin Main

}
