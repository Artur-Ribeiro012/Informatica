/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variaveiseconstantes;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class VariaveisEConstantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaração de variaveis ultilizando tipos primitivos ou objetos em suas classes
        
        char nome = 'f';
        String nome2 = "fjsgh8yerg3465324  rv     b3 4f yh";
        boolean teste;
        Integer numero = null;
        Character caractere = 'd';
        Byte b;
        Short sh;
        Long longo;
        Boolean ver = true;
       
        
      //Declaração de constantes   
       final String VALORFIXO = "d";
       
       // Entrada de Dados 
       Scanner teclado = new Scanner (System.in);
       int idade;
       double nota1;
       String nomeCompleto;
       idade = teclado.nextInt();
       nomeCompleto = teclado.nextLine();
       nota1 = teclado.nextDouble();
       // Entrada de dados em GUI
       nomeCompleto = JOptionPane.showInputDialog("Digite seu nome");
       JOptionPane.showMessageDialog(null, nomeCompleto);
       idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
       JOptionPane.showMessageDialog(null, "Seu nome é "+nome+" sua idade "+idade);
       
    }
    
}
