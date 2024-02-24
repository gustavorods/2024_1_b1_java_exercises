import javax.swing.JOptionPane;

public class TrocaNumero {
    public static void main(String args[]) {
        // Variavel
        double numA = 0;
        double numB = 0;
        double troca = 0;

        // Entrada 
        numA = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° número: "));
        numB = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número: "));

        // Processamento 
        troca = numA; // guardando NumA
        numA = numB; // Aplicando o valor da numB no numA
        numB= troca; // Aplicando valor guardado da numA

        // Saída
        System.out.println("Original: numA = " + numB + " / numB = " + numA); 
        System.out.println("Trocado: numA = " + numA + " / numB = " + numB); 

    }
}