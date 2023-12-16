package revendedoracarros;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class RevendedoraCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      float salarioBase, valorComissao, totalVendas, totalComissao, totalSalario;
      int totalCarrosVendidos;
        System.out.println("Entre com o salário base do vendedor: ");
        Scanner teclado = new Scanner(System.in);
        salarioBase = teclado.nextFloat();
        
        System.out.println("Entre com o valor da comissão por carro vendido: ");
        valorComissao = teclado.nextFloat();
        
        System.out.println("Entre com o total de carros vendidos: ");
        totalCarrosVendidos = teclado.nextInt();
        
        System.out.println("Entre com o total de Vendas: ");
        totalVendas = teclado.nextInt();
        totalComissao = totalCarrosVendidos * valorComissao;
        totalComissao = totalComissao + (totalVendas*5/100);
        totalSalario = totalComissao + salarioBase;
        
        System.out.println("O salário final do vendedor: "+totalSalario);
    }
    
}
