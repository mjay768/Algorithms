package myalgorithms;


import java.util.Scanner;
/**
 *
 * @author manoj
 */
public class Peppermints {
    
    public static void main(String[] args){
           
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter test cases ");
        int t = scan.nextInt();
        System.out.println("Enter number of perrers and wrappers");
        int p = scan.nextInt();
        int w = scan.nextInt(); 
        
        for(int i=0;i<t;i++){
            
            int wrapsfrommints = p/7;
            int wrapsleft = (p%7) + w;
            int totalmints = p+wrapsfrommints+(wrapsleft/7);
            
            System.out.println(wrapsfrommints+" "+wrapsleft);
            System.out.println("peppermints last :  "+ totalmints);
        }     
        
    }
    
   
    
}
