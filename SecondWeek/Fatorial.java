package SecondWeek;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class Fatorial 
{
    public static void main(String[] args) 
    {
        //variaveis
        double i, inpt, fat = 1;
        
        inpt = Double.parseDouble(JOptionPane.showInputDialog("Numero: "));
        
        for(i = 1; i <= inpt; i++)
        {
            fat = fat * i;
        }
        
        System.out.println(fat);
    }
}