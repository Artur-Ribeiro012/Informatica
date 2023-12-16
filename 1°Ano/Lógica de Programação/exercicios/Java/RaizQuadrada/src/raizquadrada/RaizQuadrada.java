/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raizquadrada;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class RaizQuadrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite um número");
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        System.out.println("O valor da raiz quadrada do número "+n1+" é "+Math.sqrt(n1));
    }
    
}
