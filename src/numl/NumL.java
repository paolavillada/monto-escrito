package numl;

import java.io.IOException;
import java.util.Scanner;

public class NumL {

    public static void main(String[] args) throws IOException {

        menuPrincipal();
    }

    public static void menuPrincipal() throws IOException {
        Scanner entrada = new Scanner(System.in);
        Scanner leercadena = new Scanner(System.in);
        num nu = new num();
        decimales de=new decimales();
        String cadena = new String();
        String convEnteroEnCadena = "";

        int entero = 0;
        int decimal = 0;

        int opcion = 0;

        do {
            System.out.println("\n \nMENU PRINCIPAL DE OPCIONES \n");
            System.out.println(" 1. Deseas convertir un numero en letras ");
            System.out.println(" 0. Salir del Programa. ");
            System.out.print(" \nSeleccione Opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n Digite el numero: ");
                    float n = leercadena.nextFloat();
                    entero = (int) n;
                    decimal = (int) (100 * (n - entero));

                    if (entero > 0 && entero < 100000000) {
                        String v = nu.millones(entero);
                         
                   
                        nu.separacion(n);
                             System.out.println(v);
                    } else {
                        System.out.println("\nel numero no se encuentra, el rango es mayor que 0 y menor que 100000000");
                    }

                    if (decimal > 0 && decimal <= 100) {
                           
                        
                        System.out.print(" con ");
                       String r  = de.cientos(decimal);
                       System.out.print(r);
                       System.out.print(" centecimas ");
                       
                    }
                    
                    else{System.out.println("El numero decimal debe tener maximo tres numeros");
                        
                    }
                    
                 
                 
                 
                    break;

                case 0:
                    System.out.println("\n\nFin.\n");
                    break;
                default:
                    System.out.println("\nOpcion Invalida!");
            }
        } while (opcion != 0);

    }

    ///////////////
}
