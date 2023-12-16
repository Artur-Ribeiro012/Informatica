/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antecessor;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Antecessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite um valor");
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        System.out.println("O antecessor do número "+n1+" é " + (n1-1));
    }
    
}
