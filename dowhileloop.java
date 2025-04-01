
/**
 * Write a description of class dowhileloop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dowhileloop
{
    public static void main(String[] args) {
        System.out.println("Series of even numbers up to the 10th term=");
        int i = 1;      
        int tm;
        do {
            tm = 2 * i;   
            System.out.print(tm);
            
            if (i < 10) {
                System.out.print(", ");
            }
            i++;        
        } while (i <= 10);  
    }
}
        
               
        
        