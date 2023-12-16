/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacontatos;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class ListaContatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int contato[] = new int[10];
        System.out.println("Qual lista de contatos ?");
        for(int i=0; i<contato.length; i++) {
            System.out.println("Contato na posição "+i);
            contato[i] = input.nextInt();
        }
    }
    
}
