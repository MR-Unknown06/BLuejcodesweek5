
/**
 * Write a description of class forloop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class forloop
{
    public static void main(String[] args) {
        System.out.println("Series of even numbers up to the 10th term:");
        
        for (int i = 1; i <= 10; i++) {
            int term = 2 * i; 
            System.out.print(term);
            if (i < 10) {
                System.out.print(", ");
            }
        }
    }
}
            
            
        
    
