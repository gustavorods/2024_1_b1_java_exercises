import javax.swing.JOptionPane;

public class ComparaNumero {
    public static void main(String args[]) {
        // Variavel
        double numA = 0;
        double numB = 0;
        
        // Entrada 
        numA = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° número: "));
        numB = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número: "));
        //Processamento 
        if(numA == numB) {
          System.out.println("Os valores são iguais ;)");
        } 
        else {
          if(numA > numB) {
              System.out.println("Os valores são diferentes / maior: numA ( " + numA + ") - menor: numB ( " + numB + " )" );
          } 
          else {
              System.out.println("Os valores são diferentes / maior: numB ( " + numB + ") - menor: numA ( " + numA + " )" );
          }
        }
  
    }    
}
