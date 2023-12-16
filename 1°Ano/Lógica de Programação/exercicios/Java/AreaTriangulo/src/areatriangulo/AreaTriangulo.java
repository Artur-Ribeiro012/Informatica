/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatriangulo;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite o valor da base do triângulo (em metros)");
        Scanner teclado = new Scanner(System.in);
        float n1 = teclado.nextFloat();
        System.out.println("Digite o valor da altura do triângulo (em metros) ");
        float n2 = teclado.nextFloat();
        System.out.println("A área do triângulo é "+((n1*n2)/2)+" metros quadrados");
    }
    
}
