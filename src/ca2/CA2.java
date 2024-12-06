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
        System.out.print("Enter the array size: ");
        //variable to store the given array size 
        int size = input.nextInt();
        
        //initializing the array 
        int[] ray = new int [size];
        
        //prompting the user to give array elements as input using for loop 
        //the for loop enables the user to input more than one element 
        System.out.println("Enter the array elements: ");
        for(int a = 0; a < size; a++){
            ray[a] = input.nextInt();
        }
        
        //boolean to find the first-repeated element in the array 
        boolean notFound = true;
        
        //Array Traversal to scan through each array element to find the first-repeated element 
        for(int a = 0; a < size; a++){
            for(int b = 0; b < size; b++){
                if(ray[a] == ray[b]){
                    System.out.println("The first repeated element is: " + ray[a]);
                    notFound = false;
                    break; 
                }
            }
            if(notFound){
                break;
            }
        }
        //print-statement if it occurs that no repeated-element is found
        if(!notFound) {
            System.out.println("No repeat-elements found!");
        }
    }
    
}
