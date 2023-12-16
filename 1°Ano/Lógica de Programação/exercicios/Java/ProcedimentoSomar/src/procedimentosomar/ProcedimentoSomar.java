/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimentosomar;

import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class ProcedimentoSomar {

    static int n1,n2,result;
    
    static void somar() {
        n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro Valor"));
        n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo Valor"));
        result = n1+n2;
        JOptionPane.showMessageDialog(null,"O resultado é "+result);
    }
    
    static void subtrair() {
        n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro Valor"));
        n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo Valor"));
        result = n1-n2;
        JOptionPane.showMessageDialog(null,"O resultado é "+result);
    }
      
        static void multiplicacao() {
        n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro Valor"));
        n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo Valor"));
        result = n1*n2;
        JOptionPane.showMessageDialog(null,"O resultado é "+result);
    }
        
    static void divisao() {
        n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro Valor"));
        n2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo Valor"));
        result = n1/n2;
        JOptionPane.showMessageDialog(null,"O resultado é "+result);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int op = 0;
        JOptionPane.showMessageDialog(null, "Escolha uma das Opções para operações");
        JOptionPane.showMessageDialog(null, "1 - Soma| 2 - subtrair | 3 - multiplicar | 4 - dividir");
        op = Integer.valueOf(JOptionPane.showInputDialog("Qual opção ?"));
        switch (op) {
            case 1:
                somar();
                break;
            case 2:
                subtrair();
                break;
            case 3:
                multiplicacao();
                break;
            case 4:
                divisao();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção errada");
        }
    
    }
}