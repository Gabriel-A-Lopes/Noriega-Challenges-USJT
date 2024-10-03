package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class For_Password 
{
    public static void main(String[] args) 
    {
        int senha, contador, leitura;
        
        senha = 54321;
        contador = 1;
        leitura = 0;
        
        for (contador = 1; contador <= 3; contador = contador + 1)
        {
            //catch user input
            leitura = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
            //validate input
            if(leitura != senha && contador <= 2)
            {
                JOptionPane.showMessageDialog(null, "Senha incorreta");                
            }
            //check if attempts arent exceeded
            else if(contador > 2)
            {
                JOptionPane.showMessageDialog(null, "Contacte o admin");
            }
            //check for success
            else
            {
                JOptionPane.showMessageDialog(null, "Acesso liberado");
                break;
            }
        }
    }
}
