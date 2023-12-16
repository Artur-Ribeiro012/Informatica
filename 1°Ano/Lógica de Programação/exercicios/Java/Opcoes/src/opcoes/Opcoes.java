/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opcoes;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Opcoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escreva uma Opção de a até e");
        String op = null;
        String titulo;
        Scanner teclado = new Scanner(System.in);
        op = teclado.nextLine();
        switch(op) {
            case "a": 
                titulo = "Opção 1";
                System.out.println("Opção escolhida " +titulo);
                break;
            case "b": 
                titulo = "Opção 2";    
                System.out.println("Opção escolhida " +titulo);
                break;
            case "c": 
                titulo = "Opção 3";
                System.out.println("Opção escolhida " +titulo);
                break;
            case "d": 
                titulo = "Opção 4";
                System.out.println("Opção escolhida " +titulo);
                break;
            case "e": 
                titulo = "Opção 5";
                System.out.println("Opção escolhida " +titulo);
                break;
            default:
                System.out.println("Opção Errada");
        }
            
    }
    
}
