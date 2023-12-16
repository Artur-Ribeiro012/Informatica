/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroeleitores;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class NumeroEleitores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número de votos brancos");
        float vB = teclado.nextLong();
        System.out.println("Informe o número de votos Inválidos");
        float vI = teclado.nextFloat();
        System.out.println("Informe o número de votos nulos");
        float vN = teclado.nextFloat();
        float soma = vB + vI + vN;
        float percentualBranco = (vB*100)/soma;
        float percentualInvalido = (vI*100)/soma;
        float percentualNulo = (vN*100)/soma;
        System.out.println("O percentual de votos brancos em relação ao todo é "+percentualBranco);
        System.out.println("O perecentual de votos Inválidos em relação ao todo é "+percentualInvalido);
        System.out.println("o percentual de votos Nulos em relação ao todo é "+percentualNulo);
        System.out.println("O total é "+(percentualBranco+percentualInvalido+percentualNulo)+"%");
    }
    
}
