/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frete;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Frete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite os Km rodados");
        Scanner teclado = new Scanner(System.in);
        double km = teclado.nextDouble();
        double valorFrete = (km*1.50) + 9.00;
        System.out.println("O valor do seu frete é: "+valorFrete);
    }
}
