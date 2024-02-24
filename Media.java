import javax.swing.JOptionPane;

public class Media {
    public static void main(String args[]){
        // variavel 
        String nome;
        double media = 0;
        double[] notas = new double[4];

        // Entrada 
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        for(int i = 0; i < 4; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua " + (i + 1) + "° nota: "));
            media += notas[i];
        }

        // Processamento 
        media = media / 4;

        // Saída 
        System.out.println(nome + " Sua média é: " + media);
    }
}
