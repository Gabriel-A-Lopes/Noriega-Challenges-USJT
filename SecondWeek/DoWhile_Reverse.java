package SecondWeek;

/**
 *
 * @author GALop
 */
public class DoWhile_Reverse 
{
    public static void main(String[] args) 
    {
        int contagem = 100;
        
        do
        {
            System.out.println(contagem);
            contagem = contagem - 1;
        }
        while(contagem >= 0);
    }
}
