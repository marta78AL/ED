/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebacuenta;

import java.util.Scanner;

/**
 *
 * @author jmrivera
 */
public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta1, cuenta2, cuenta3;
        cuenta1 = new Cuenta();
        Scanner teclado = new Scanner(System.in);
        // Cuenta1
        System.out.println("Introduzca los datos de la cuenta:");
        System.out.println("Nombre del cliente:");
        cuenta1.setNombreCliente(teclado.nextLine());
        System.out.println("Número de cuenta:");
        cuenta1.setNumeroCuenta(teclado.nextLine());
        System.out.println("Tipo de interés:");
        cuenta1.setTipoInteres(Double.parseDouble(teclado.nextLine()));
        System.out.println("Saldo:");
        cuenta1.setSaldo(Double.parseDouble(teclado.nextLine()));
        // Cuenta2
        cuenta2 = new Cuenta("Diego Rodríguez de Silva y Velázquez","1234567890",1.25,500);
        cuenta3 = new Cuenta(cuenta1);
        esperar();
        // Datos cuentas
        System.out.println("\nDatos cuentas: cuenta1, cuenta2 y cuenta3.\n");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        esperar();
        System.out.println("Ingresando 55€ en "+cuenta1.getNumeroCuenta());
        cuenta1.ingreso(55);
        System.out.println("\nDatos cuentas: cuenta1, cuenta2 y cuenta3.\n");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        esperar();
        // Transferencias
        System.out.println("Transferencia de 10€ de "+cuenta3.getNumeroCuenta()
                +" a "+cuenta2.getNumeroCuenta());
        if(cuenta3.transferencia(cuenta2, 10)){
            System.out.println("Transferencia realizada.");
        }else{
            System.out.println("Transferencia cancelada: no hay saldo sufuciente.");
        }
        System.out.println("\nDatos cuentas: cuenta2 y cuenta3.\n");
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        esperar();
        System.out.println("Transferencia de 5000€ de "+cuenta3.getNumeroCuenta()
                +" a "+cuenta2.getNumeroCuenta());
        if(cuenta3.transferencia(cuenta2, 5000)){
            System.out.println("Transferencia realizada.");
        }else{
            System.out.println("Transferencia cancelada: no hay saldo sufuciente.");
        }
        System.out.println("\nDatos cuentas: cuenta2 y cuenta3.\n");
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
    }
    
    public static void esperar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pulse intro para continuar...");
        teclado.nextLine();
    }
    
}
