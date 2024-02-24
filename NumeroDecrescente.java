import javax.swing.JOptionPane;

public class NumeroDecrescente {
    public static void main(String args[]) {
         // Variavel 
         int n = 0;

         // Entrada 
         n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));

         // Processamento
         for(int i = 0; i < n; i++) {
            JOptionPane.showMessageDialog(null, (n - i));
         }
    }
}
