/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite o primeiro número");
        Scanner teclado = new Scanner(System.in);
        double n1 = teclado.nextDouble();
        System.out.println("Digite o segundo número");
        double n2 = teclado.nextDouble();
        System.out.println("A soma do valor "+n1+" com "+n2+" é "+(n1+n2));
        System.out.println("A subtração do valor "+n1+" com "+n2+" é "+(n1-n2));
        System.out.println("A multiplicação do valor "+n1+" com "+n2+" é "+(n1*n2));
        System.out.println("A divisão do valor "+n1+" com "+n2+" é "+(n1/n2));
        
    }
    
}
