
/**
 * Write a description of class natural here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class natural
{
    public static void main(String[] args) {
        int i = 1;          
        int n = 0;      
        
        System.out.println("Calculating sum of squares of first 10 natural numbers...");
        
        do {
            n += i * i;   
            i++;           
        } while (i <= 10);  
        
        System.out.println("Sum = " + n);
    }
}

