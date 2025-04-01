
/**
 * Write a description of class whileloop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whileloop
{
    public static void main(String[] args) {
        System.out.println("Series of even numbers up to the 10th term:");
        int i = 1;         
        int table; 
        while (i <= 10) {
            table = 2 * i;   
            System.out.print(table);
            
            if (i < 10) {
                System.out.print(", ");
            }
            i++;          
        }

    }
}