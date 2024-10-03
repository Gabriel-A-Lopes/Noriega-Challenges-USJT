package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class While_Password 
{
    public static void main(String[] args) 
    {
        int senha, contador, leitura;
        
        senha = 54321;
        contador = 1;
        leitura = 0;
        
        while (contador <= 3)
        {
            //catch input
            leitura = Integer.parseInt(JOptionPane.showInputDialog("Senha: "));
            //check if value matches the password
            if(leitura != senha)
            {
                //wrong password message
                JOptionPane.showMessageDialog(null, "Senha incorreta");
                //up the counter by 1
                contador = contador + 1;
                //if attempts are exceded...
                if (contador > 3)
                {
                   JOptionPane.showMessageDialog(null, "Contacte o Admin"); 
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Acesso permitido");
                break;
            }
        }
    }
}
