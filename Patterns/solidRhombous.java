/*
         * * * * *
        * * * * *
       * * * * * 
      * * * * *
     * * * * *    
*/

import java.util.Scanner;
public class solidRhombous {

    public static void solidRhombous(int n){

        // Outer loop
        for(int i = 1; i <= n; i++){
            // Spaces = (n-i)
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            // For stars = n
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the no. of lines: ");
        int n = sc.nextInt();
        solidRhombous(n);
    }
}