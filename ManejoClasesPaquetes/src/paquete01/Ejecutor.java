/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        //agregar valores a los atributos de h1 y h2 por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombreHos;
        int numCamas;
        double presupuesto;
        System.out.println("Ingrese el nombre del Hospital");
        nombreHos = entrada.nextLine();
        System.out.println("Ingrese el numero de camas");
        numCamas = entrada.nextInt();
        System.out.println("Ingrese el presupuesto");
        presupuesto = entrada.nextDouble();

        Hospital h1 = new Hospital();
        h1.establecerNombre(nombreHos);
        h1.establecerNumeroCamas(numCamas);
        h1.establecerPresupuesto(presupuesto);

        entrada.nextLine();
        System.out.println("Ingrese el nombre del Hospital 2");
        nombreHos = entrada.nextLine();
        System.out.println("Ingrese el numero de camas [2]");
        numCamas = entrada.nextInt();
        System.out.println("Ingrese el presupuesto[2]");
        presupuesto = entrada.nextDouble();
        Hospital h2 = new Hospital();
        h2.establecerNombre(nombreHos);
        h2.establecerNumeroCamas(numCamas);
        h2.establecerPresupuesto(presupuesto);

        System.out.printf("%s \n", "Hola desde el main");
        System.out.printf("%s - %d - %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        System.out.printf("%s - %d - %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
    }
}
