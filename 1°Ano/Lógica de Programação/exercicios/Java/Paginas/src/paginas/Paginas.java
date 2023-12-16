/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paginas;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Paginas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("qual o valor ?");
        Scanner teclado = new Scanner(System.in);
        float valor = teclado.nextFloat();
        float x = (int) ((valor-1.25)/(0.55));
        System.out.println("Você pode comprar no mínimo "+x+" páginas");
    }
    
}
