package FirstWeek;
/**
 *
 * @author GALop
 */

import javax.swing.JOptionPane; 

//declarar variável universal


public class DollarCount 
{
    public static void main (String[] args)
    {   
        //capture the value being invested
        String valorReal = (JOptionPane.showInputDialog("Value to be invested in reais (R$):"));
       
        //transform the string into a float
        float dollars = Float.parseFloat(valorReal);
        
        //perform the calculation
        float result = dollars * (float) 5.5;
        //show the end result
        JOptionPane.showMessageDialog(null, "Total value in dollar ($): " + result + " USD");
    }
}