/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunorecuperacao;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class AlunoRecuperacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite a primeira nota");
        Scanner teclado = new Scanner(System.in);
        float nota1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota");
        float nota2 = teclado.nextFloat();
        float media = (nota1+nota2)/2;
        if(media >=5) {
            if (media>=7) {
                System.out.println("Aluno Aprovado");
            } else {
                System.out.println("Aluno Recuperação");
            }   
        } else {
            System.out.println("Aluno Reprovado");
        }
    }
}