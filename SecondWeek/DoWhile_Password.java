package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class DoWhile_Password 
{
    public static void main(String[] args) 
    {
        int senha, leitura, contador;
        
        senha = 54321;
        leitura = 0;
        contador = 0;
        
        
        
        do
        {
            leitura = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
            if (senha != leitura)
            {
                JOptionPane.showMessageDialog(null, "Senha incorreta", "", JOptionPane.ERROR_MESSAGE);
                contador = contador + 1;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Acesso Liberado");
                break;
            }
        }
        while (contador < 3);
        
        JOptionPane.showMessageDialog(null, "Por favor entre em contato com o Admin");

    }
}
