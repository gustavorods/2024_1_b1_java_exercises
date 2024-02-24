import javax.swing.JOptionPane;

public class OrganizarNumero {
    public static void main(String args[]) {
    // variavel 
    int[] vetorNormal = new int[3];    
    int[] vetorDecre = new int[3];

    // entrada 
    for(int i = 0 ; i < 3; i++) {
        vetorNormal[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "° número"));
    }

   // Processamento 
    if(vetorNormal[0] > vetorNormal[1]) {
        if(vetorNormal[0] > vetorNormal[2]) {
            vetorDecre[0] = vetorNormal[0];
            if(vetorNormal[1] > vetorNormal[2]) {
                vetorDecre[1] = vetorNormal[1];
                vetorDecre[2] = vetorNormal[2];
            }
        } else {
            vetorDecre[1] = vetorNormal[0];
            vetorDecre[0] = vetorNormal[2];
            vetorDecre[2] = vetorNormal[1];
        }
    } else if(vetorNormal[0] > vetorNormal[2]) {
        vetorDecre[1] = vetorNormal[0];
        vetorDecre[0] = vetorNormal[1];
        vetorDecre[2] = vetorNormal[2];
    } else {
        vetorDecre[2] = vetorNormal[0];
        if(vetorNormal[1] > vetorNormal[2]) {
            vetorDecre[0] = vetorNormal[1];
            vetorDecre[1] = vetorNormal[2];
        } else{
            vetorDecre[0] = vetorNormal[2];
            vetorDecre[1] = vetorNormal[1];
        }
    }

    JOptionPane.showMessageDialog(null, vetorDecre[0] +" " + vetorDecre[1]  +" " +vetorDecre[2]);

    }
}
