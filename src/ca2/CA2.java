/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

/**
 *
 * @author ismis
 */
//importing the Scanner Class to add Scanner object 
import java.util.Scanner;
public class CA2 {
    
    //GitHub Repo:
    //https://github.com/KellieB94/CA2.git
    
    //function to find the first-repeated element in an array of integers
    public static void main(String[] args) {
        //initializing the Scanner Class with an object "input" to use the Scanner Class function 
        Scanner input = new Scanner(System.in);
        
        //prompting the user to give array size as input
        System.out.print("Enter The Array Size: ");
        //variable to store the given array size 
        int size = input.nextInt();
        
        //initializing the array 
        int[] ray = new int [size];
        
        //prompting the user to give array elements as input using for loop 
        //the for loop enables the user to input more than one element 
        System.out.println("Enter The Array Elements: ");
        for(int a = 0; a < size; a++){
            ray[a] = input.nextInt();
        }
        
        
    }
    
}
