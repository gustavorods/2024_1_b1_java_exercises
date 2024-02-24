import javax.swing.JOptionPane;
public class SomaMultipl {
    public static void main(String args[]) {
        //variaveis 
        long multiplicacaoPar = 1;
        double somaImpar = 0;

        // Processamento
        for(int i = 1; i <= 30; i++) {
            if(i != 0) {
                if(i % 2 == 0) {
                    multiplicacaoPar *= i;
                } else {
                    somaImpar += i; 
                }
            }
        }

        //saída 
        JOptionPane.showMessageDialog(null, "Soma dos ímpares: " + somaImpar);
        JOptionPane.showMessageDialog(null, "Multiplicação dos pares: " + multiplicacaoPar);
    }
}
