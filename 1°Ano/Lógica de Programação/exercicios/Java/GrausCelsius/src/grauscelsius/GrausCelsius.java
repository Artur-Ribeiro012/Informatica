/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grauscelsius;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class GrausCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite o valor da temperatura(em graus Celsius)");
        Scanner teclado = new Scanner(System.in);
        float grauCelsius = teclado.nextFloat();
        float fahrenheit = (grauCelsius/5)*9+32;
        System.out.println("O valor convertido de grau Celsius para grau Fahrenheit é "+fahrenheit);
    }
    
}
