package FirstWeek;
import javax.swing.JOptionPane;
/**
 *
 * @author GALop
 */
public class Soma_Quadrados 
{
    public static void main (String[] args)
    {
        //capturar 4 números
        String primeiroValor = (JOptionPane.showInputDialog("Digite o 1o valor"));
        String segundoValor = (JOptionPane.showInputDialog("Digite o 2o valor"));
        String terceiroValor = (JOptionPane.showInputDialog("Digite o 3o valor"));
        String quartoValor = (JOptionPane.showInputDialog("Digite o 4o valor"));
       //apresentar o valor de cada número elevado ao quadrado
        float primeiroInput = Float.parseFloat(primeiroValor);
        float segundoInput = Float.parseFloat(segundoValor);
        float terceiroInput = Float.parseFloat(terceiroValor);
        float quartoInput = Float.parseFloat(quartoValor);
        
        float quadrado1 = primeiroInput * primeiroInput;
        float quadrado2 = segundoInput * segundoInput;
        float quadrado3 = terceiroInput * terceiroInput;
        float quadrado4 = quartoInput * quartoInput;
        
        float somaQuadrados = quadrado1 + quadrado2 + quadrado3 + quadrado4;
        
       //somar o total
        JOptionPane.showMessageDialog(null, "Valor dos quadrados\n1. " + quadrado1 + "\n2. " + quadrado2 + "\n3. " + quadrado3 + "\n4. " + quadrado4);
        JOptionPane.showMessageDialog(null, "Soma total = " + somaQuadrados);
    }
}

    

