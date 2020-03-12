import java.util.Scanner;
public class Equals{
    public static void main (String [] args){
    
    Scanner in = new Scanner (System.in);
    
    String a, b;
    
    System.out.println("Enter the first");
    a = in.nextLine();
    
    System.out.println("Enter the second");
    b = in.nextLine();
   
    if(a.equals(b))
        System.out.println("Both are the same");
    else
        System.out.println("Both are not the same");
       
    }
}  