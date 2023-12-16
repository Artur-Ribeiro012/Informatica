/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordeminversa;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class OrdemInversa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Qual são os números");
        Scanner input = new Scanner(System.in);
        int numero[] = new int[10];
        for(int i = 0;i<numero.length; i++) {
            System.out.println("posição "+i);
            numero[i] = input.nextInt();        
        }
        int i=9;
        do {
            System.out.println("numer0 "+numero[i]);
            i--;
        } while(i>=0);
            
    }
    
}
