
package myalgorithms;
/**
 *
 * @author manoj
 */
import java.io.*;
import java.util.*;

public class BirthdayCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int temp=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(ar[i]>temp){
                temp=ar[i];
                count=0;
                count++;
            }
            else if(ar[i]==temp)
                    count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
