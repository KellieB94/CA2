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
    
    public static void main(String[] args) {
    
        //TASK 1 - function to find the first-repeated element in an array of integers 
    
        //initializing the Scanner Class to take user input with an object "input" to use the Scanner Class function 
        //Scanner input = new Scanner(System.in);
        
        //prompting the user to give array size as input
        //System.out.print("Enter the array size: ");
        
        //variable to store the given array size 
        //int size = input.nextInt();
        
        //initializing the array 
        //int[] ray = new int [size];
        
        //prompting the user to give array elements as input using for loop, 
        //the for loop enables the user to input more than one element 
        //System.out.println("Enter the array elements: ");
        //for(int a = 0; a < size; a++){
            //ray[a] = input.nextInt();
        //}
        
        //boolean to find the first-repeated element in the array 
        //boolean Found = false;
        
        //Array Traversal using two nested for-loops, one running through the outer-loop and one running through the inner-loop,
        //to scan through each array element to find the first-repeated element in the array
        //for(int a = 0; a < size; a++){
            //for(int b = a + 1; b < size; b++){
                
                //conditional if-statement to print to the user the first-repeated element
                //if(ray[a] == ray[b]){
                    //System.out.println("The first repeated element is: " + ray[a]);
                    
                    //breaking the loop on the condition that first-repeated element is found 
                    //Found = true;
                    //break; 
                //}
            //}
            //breaking the loop if the first-repeated element is found
            //if(Found){
                //break;
            //}
        //}
        //print-statement if it occurs that no repeated-element is found
        //if(!Found) {
            //System.out.println("No repeat-elements found!");
        //}
        //closing the Scanner class to prevent errors and stop more user input 
        //input.close();
        
        //TASK 2 - function that generates a multiplication table using a 2D array 
        
        //calling the Scanner class to take user input by initializing the Scanner object "input"
        Scanner input = new Scanner(System.in);
        
        //prompting the user to enter the multiplication table size 
        System.out.println("Enter the number of rows and columns in table (Example: 5x5/NxN): ");
        
        //variable to store the table size 
        int a = input.nextInt();
        
        //initializing 2D array to store the values of the multiplication 
        int[][] mulTable = new int[a][a];
       
        //populating the multiplication table by adding values 
        for(int b = 0; b < a; b++){
            for(int c = 0; c < a; c++){
                mulTable[b][c] = (b + 1) * (c + 1);
            }
        }
        //displaying the multiplication table in the form of a matrix,
        //using two nested for-loops, one going through the outer-loop and one going through the inner-loop,
        //to fill the array with the multiplication products 
        System.out.println("Multiplication Table: ");
        for(int b = 0; b < a; b++){
            for(int c = 0; c < a; c++){
                //printing each element in a size 3 alignment to make the table easier to read 
                System.out.printf("%3d", mulTable[b][c]);
            }
            System.out.println();
        }
        //closing the Scanner class to stop user input capability 
        input.close();
    }
    
}
