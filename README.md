
package exercicio1;
import javax.swing.JOptionPane;

public class Exercicio1 {
  
    
    
    public static void main(String[] args) {
     double cotacaodolar;
     cotacaodolar = 4.80;
     double valoremdolar;
     double resultado;
     double divisaodolar;
     divisaodolar = 0.2053852;
     
JOptionPane.showMessageDialog(null, "A cotação do dolar atual é: " + cotacaodolar);
valoremdolar =
Double.parseDouble(JOptionPane.showInputDialog("Digite o  valor"));
    resultado = valoremdolar / divisaodolar;
    JOptionPane.showMessageDialog(null, "O resultado é " + resultado );
    }
    
}


     
  
