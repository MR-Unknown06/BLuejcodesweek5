
/**
 * Write a description of class repeat1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class repeat1
{
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            
            System.out.println();
        }
    }
}