/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcelas;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Parcelas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Qual o valor da compra ? ");
        Scanner teclado = new Scanner(System.in);
        float valor = teclado.nextFloat();
        System.out.println("O valor das parcelas é "+(valor/5));
    }
    
}
