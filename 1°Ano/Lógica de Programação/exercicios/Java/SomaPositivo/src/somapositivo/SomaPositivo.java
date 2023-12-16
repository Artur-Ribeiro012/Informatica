/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somapositivo;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class SomaPositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n1,n2, result;
        System.out.println("Digite um valor positivo e inteiro menor ou igual a 1000");
        n1 = input.nextInt(); 
        if(n1>1000) {
            System.exit(0);
        }else {
            if(n1<0) {
                System.exit(0);
            }
        }
        System.out.println("Digite outro valor nas mesmas condições");
        n2 = input.nextInt();
        if(n2>1000) {
            System.exit(0);
        }else {
            if(n2<0) {
                System.exit(0);
            }
            result = n1+n2;
            System.out.println("A soma é "+result);
        }
    }
    
}
