/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package challenges;

import java.util.*;

/**
 *
 * @author Hp
 */
public class Challenges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Challenge 1: Find Maximum
     int[] numList = {3, 7, 2, 8, 5};
     int max = maximum(numList);
     System.out.println("The max value: "+max);
     
     
     //Challenge 2: Print number in word
     printNumberInWord(8);
     
     // Challenge 3: Check Odd/Even
     checkOddEven(7);
     
    double averge = average(numList);
 System.out.println("The average value is: "+averge);
    }
    
//Challenge 1: Find Maximum
    public static int maximum(int[] numList) {
   
          int max= numList[0];
        for( int i =0; i <   numList.length; i++){
          if (max < numList[i]){
              max = numList[i];
          }
           
        }
        return max;
        }
   

//Challenge 2: Print number in word
    public static String  printNumberInWord(int num) {
       switch(num){
           case 0:
               System.out.println("Zero");
               break;
           case 1:
               System.out.println("One");
               break;
           case 2:
               System.out.println("Two");
              break;
           case 3:
                System.out.println("Three");
              break;
           case 4:
                 System.out.println("Four");
              break;
           case 5:
                 System.out.println("Five");
              break;
           case 6:
                 System.out.println("Six");
              break;
           case 7:
                 System.out.println("seven");
              break;
           case 8:
                 System.out.println("Eight");
              break;
           case 9:
                 System.out.println("Nine");
              break;
           case 10:
                 System.out.println("Ten");
              break;
       }
        return null;
       }

    //Challenge 3: Check Odd/Even
    private static void checkOddEven(int n) {
        if ( (n % 2) == 0){
            System.out.println("The number is an even number");}
            else {
              System.out.println("The number is an odd number");
                    }
        
       }

    private static double average(int[] numList) {
        
         int sum =0;
        for (int i : numList){
           sum += i;
        }
        
        double ave = (double) sum/ numList.length;
        return ave;
       }
    

    
    
}
