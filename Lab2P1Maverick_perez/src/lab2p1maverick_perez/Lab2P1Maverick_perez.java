/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1maverick_perez;

import java.util.Scanner;

/**
 *
 * @author maver
 */
public class Lab2P1Maverick_perez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Piedra = 0 
        //papel = 1
        //Tijera = 2
        //introducir el escaner
        Scanner entrada = new Scanner(System.in);
        //introducir las variables y asiganarlas 
        int menu = 0;
        while (menu != 4) {
            System.out.println("Ingrese opcion del menu");
            menu = entrada.nextInt();
            if (menu == 1) {
                int opcion = 0;
                int opcion2 = 0;
                System.out.println("Ingrese su opcion (J1): ");
                opcion = entrada.nextInt();
                System.out.println("Ingrese su opcion(J2): ");
                opcion2 = entrada.nextInt();
                //un If y else if para que abaarque diferentes opciones
                if (opcion == 0 && opcion2 == 2) {
                    System.out.println("J1 Gana ");
                } else if (opcion == 2 && opcion2 == 0) {
                    System.out.println("J2 gana");
                } else if (opcion == 0 && opcion2 == 0) {
                    System.out.println("Empate");
                } else if (opcion == 1 && opcion2 == 0) {
                    System.out.println("J1 gana");
                } else if (opcion == 0 && opcion2 == 1) {
                    System.out.println("J2 gana");
                } else if (opcion == 1 && opcion2 == 1) {
                    System.out.println("Empate");
                } else if (opcion == 2 && opcion2 == 1) {
                    System.out.println("J1 gana ");
                } else if (opcion == 1 && opcion2 == 2) {
                    System.out.println("J2 gana");
                } else if (opcion == 2 && opcion2 == 2) {
                    System.out.println("Empate");
                }
          
                if (menu == 2) {
                    int n = 0;
                    int divisor = 1;
                    int acum = 0;
                    int cont = 0;
                    System.out.println("Ingrese un numero ");
                    n = entrada.nextInt();
                    if (divisor < n) {
                        cont = n % divisor;
                        if (n % divisor == 0) {
                            acum = acum + divisor;

                        }
                    }
                    ++divisor;
                    if (acum > n) {
                        System.out.println(n + " es numero es deficiente ");
                    } else if (acum < n) {
                        System.out.println(n + " es numero perfecto ");
                    } else {
                        System.out.println(n + "es abundante");
                    }
                }
            }

        }//Fin del if y else if 1/ejercicio

    }

}
