/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naopodezero;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class NaoPodeZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o primeiro valor");
        double valor = input.nextDouble();
        System.out.println("Digite o segundo valor");
        double valor1 = input.nextDouble();
        do {
            if(valor1 == 0) {
                System.out.println("Digite outro valor");
                valor1 = input.nextDouble();
            }
        } while(valor1 == 0);
        double divisao = valor/valor1;
        System.out.println("O resultado da divisao é "+divisao);
    }
    
}
