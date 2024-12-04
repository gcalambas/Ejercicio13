/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior13;

/**
 *
 * @author Pc
 * Un almacen efectua una promocion en el cual se hace undescuento sobre el valor de la compra toal, segun de ,a bilita que  el cliente saque al pagar en caja. Si la bolita es blanca no se le hara
 * descuneto alguno, si es verded se lw hR un 10% de descuento, si es amarilla n 25% si es axul un 505 y si es roja un 100%.
 * Hacer un algortmo para determinar la cantidad final que un clienete deberia pagar por su compra Se sabe que solo hay bolitas de colores mencionados.
 * ANALISIS
 * Datos de entrada}
 * Valor de la compra
 * Color a pagar teneindo en cuenta los posibles descuentos.
 */
import java.util.Scanner;
public class EjercicioR13 {

    public static void main(String[] args) {
        String color;
        double valcomp, valpag;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de su compra: ");
        valcomp = teclado.nextDouble();
        
        System.out.println("Ingrese el color de la bolita");
        color = teclado.next();
        
        valpag = Valpag.valor_a_pagar(valcomp, color);
        System.out.println("El cliente debe pagar: $" + valpag);
    }
}
