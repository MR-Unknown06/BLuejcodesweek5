
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
     public static void main(String[] args) {
        System.out.println("Squares of first 10 natural numbers:");
        int i = 1;
        while (i <= 10) { 
            int sq = i * i;  
            System.out.print(sq);
            
            if (i < 10) {
                System.out.print(", ");
            }
            
            i++;  
        }
    }
}

        
          
        
        
