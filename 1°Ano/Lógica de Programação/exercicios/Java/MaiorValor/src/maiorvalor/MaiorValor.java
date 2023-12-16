/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maiorvalor;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class MaiorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Para parar o programa digite o valor 0 (zero)");
        Scanner input = new Scanner(System.in);
        int valor;
        int i = 0;
        int aux = 0;
        do {
            i = ++i;
            System.out.println("Digite o "+i+"° valor");
            valor = input.nextInt();
            if(valor > aux) {
                aux = valor;
            }   
        }while(valor != 0);
        System.out.println("O maior Valor digitado é "+aux);
    }
    
}
