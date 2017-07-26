/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myalgorithms;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author manoj
 */
public class FRAT {
    
    public static void main(String[] args){
        
        FRAT frat = new FRAT();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        int n = scan.nextInt();
        
        // Since fibo is considered as Hypotenuse
        int hypotenuse = frat.fibonacci(n); 
        
        int secondside = frat.secondSide(hypotenuse);
        //System.out.println(fibo);
        //System.out.println(secondside);
        //int thirdside = frat.thirdSide(hypotenuse,secondside);
        //System.out.println(hypotenuse);
        //System.out.println(secondside);
        //System.out.println(thirdside);
        
        int factors = findFactors(secondside);
        System.out.println("Output:");
        System.out.println(factors);
    }
    
    public int thirdSide(int hypotenuse, int secondside){
       
        int thirdside = (int) Math.sqrt((hypotenuse*hypotenuse) - (secondside*secondside));
        return thirdside;
    }
    
    public int secondSide(int f){
        
        float sqrt = (float) Math.sqrt(5);
        //System.out.println(sqrt);
        return Math.round((2/sqrt)*f); 
    }
    
    public int fibonacci(int n){
        int f1=0,f2=1,f3;
        
        do {   
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        } while(f3<=n);
        return f3;
    }
    
    public static int findFactors(int n){
        int count = 2;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0)
                count++;
        } 
        return count;
    }
}
