/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases01;


public class Ejecutable {
    public static void main(String[] args) {
        // Se crea un objeto
        Hospital hospital = new Hospital();
        Hospital h2 = new Hospital();
        // Se asigna valores particulares al objeto
        hospital.nombre = "Isidro Ayora";
        hospital.numeroCamas = 300;
        hospital.presupuesto = 560340.50;
        h2.nombre = "Manuel Ignacio Montero";
        h2.numeroCamas = 250;
        h2.presupuesto = 600000.36;
        h2.enfermedades= "covid";
        
        // Se presenta valores en pantalla
        System.out.printf("%s - %d - %.2f\n"
                + "%s - %d - %.2f - %s\n", hospital.nombre,
                hospital.numeroCamas, hospital.presupuesto,
                h2.nombre,h2.numeroCamas,h2.presupuesto,h2.enfermedades);
            
        // System.out.println(hospital.nombre + "-" + hospital.numeroCamas);
    }
}
