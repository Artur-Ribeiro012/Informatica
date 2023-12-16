/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valoresinteirosmodificado;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class ValoresInteirosModificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Digite um valor inteiro");
        Scanner input = new Scanner(System.in);
        int condicao = input.nextInt();
        while(condicao <= 0) {
            if (condicao <= 0 ) {
                System.out.println("Digite outro Valor");
                condicao = input.nextInt();
            } 
        }
        for(int valor = 0; valor <= condicao; valor++) {
            System.out.println(valor);
        }
    }
    
}
