import java.util.Scanner;

/**
 * Write a description of class twoinputt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class twoinputt
{
    public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt() ; 
int y=sc.nextInt() ;
int mut=x*y;
System.out.println(mut);
sc.close();
}

}
