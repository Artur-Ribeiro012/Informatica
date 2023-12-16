package funcaosomr;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class FuncaoSomr {
    static int result;
    static int somar(int n2, int n1) {
       result = n1 + n2;
        return result;
    }
    public static void main(String[] args) {
        int v1,v2, resultado;
        v1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro valor"));
        v2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo valor"));
        resultado = somar(v1, v2);
        JOptionPane.showMessageDialog(null, result);
    }
    
}
