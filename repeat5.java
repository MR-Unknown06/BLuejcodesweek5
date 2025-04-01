
/**
 * Write a description of class repeat5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class repeat5
{
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = rows; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(i); 
            }
            
            System.out.println();
        }
    }
}