/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorpago;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class ValorPago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("quantas páginas ?");
        Scanner teclado = new Scanner(System.in);
        short pagina = teclado.nextShort();
        float valor = (float) (0.55*pagina + 1.25);
        System.out.println("O valor a ser Pago é "+valor);
    }
    
}
