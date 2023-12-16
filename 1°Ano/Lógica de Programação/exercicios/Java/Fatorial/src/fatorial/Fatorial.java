/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner ent = new Scanner(System.in);
        int num, fat = 1;
            System.out.println("Digite um nº");
            num = ent.nextInt();
            
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            System.out.println(num + "!" + " = " + fat);
    }
    
    
}
