/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacaomatriz;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class MultiplicacaoMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int multiplicacao[][] = new int[2][2];
        Scanner input = new Scanner(System.in);
        System.out.println("Quais são os valores ? ");
        int numero[][] = new int[2][2];
        int maior = 0;
        for(int i = 0; i<numero.length; i++) {
            for(int j = 0; j<numero.length; j++) {
                numero[i][j] = input.nextInt();
                if(numero[i][j] > maior) {
                    maior = numero[i][j];
                }
            }
        }
         System.out.println("A matriz multiplicada pelo maior elemento "+ maior+ " é");
         for(int i = 0; i<numero.length; i++) {
            for(int j =0; j<numero.length; j++) {
                System.out.println(maior*numero[i][j]);
            }
         }    
    }
}    