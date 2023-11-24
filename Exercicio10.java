/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio10;
import javax.swing.JOptionPane;

 
public class Exercicio10 {

 
   
           
    public static void main(String[] args) {
           int n1, n2, resultado;
     n1=
     Integer.parseInt (JOptionPane.showInputDialog("Digite o  valor: "));
     n2=
     Integer.parseInt (JOptionPane.showInputDialog("Digite outro valor: "));
     resultado = n1 + n2;
     if( resultado > 10){
     JOptionPane.showMessageDialog(null, "O resultado é " + resultado );
     }
        
    }
    
}
