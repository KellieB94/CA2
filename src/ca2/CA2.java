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
        //Scanner input = new Scanner(System.in);
        
        //prompting the user to enter the multiplication table size 
        //System.out.println("Enter the number of rows and columns in table (Example: 5x5/NxN): ");
        
        //variable to store the table size 
        //int a = input.nextInt();
        
        //initializing 2D array to store the values of the multiplication 
        //int[][] mulTable = new int[a][a];
       
        //populating the multiplication table by adding values, using two nested for-loops, 
        //one going through the outer-loop and one going through the inner-loop to give the multiplication products 
        //for(int b = 0; b < a; b++){
            //for(int c = 0; c < a; c++){
                //mulTable[b][c] = (b + 1) * (c + 1);
            //}
        //}
        //displaying the multiplication table in the form of a matrix,
        //using two nested for-loops, one going through the outer-loop and one going through the inner-loop,
        //to ensure a neat format 
        //System.out.println("Multiplication Table: ");
        //for(int b = 0; b < a; b++){
            //for(int c = 0; c < a; c++){
                //printing each element in a size 3 alignment to make the table easier to read 
                //System.out.printf("%5d", mulTable[b][c]);
            //}
            //function to print a new line after every row, for easier reading 
            //System.out.println();
        //}
        //closing the Scanner class to stop user input capability and to prevent any errors  
        //input.close();
        
        
        //TASK 3 - calculating the sum of the main-diagonal and the secondary-diagonal of a square matrix 
        
        //calling the scanner class by creating object "input" to take user input 
        Scanner input = new Scanner(System.in);
        
        //prompting input from the user to give number of rows in the matrix 
        System.out.println("Enter the number of rows: ");
        
        //variable to store the number of rows 
        int row = input.nextInt();
        
        //prompting input from the user to give number of columns in the matrix 
        System.out.println("Enter the number of columns: ");
        
        //variable to store the number of columns 
        int cols = input.nextInt();
        
        //initializing the matrix 
        int[][] square = new int [row][cols];
        
        //prompting the user to enter row by row elements 
        System.out.println("Enter elements: ");
        
        for(int a = 0; a < row; a++){
            for(int b = 0; b < cols; b++){
                square[a][b] = input.nextInt();
            }
        }
        
        //displaying the matrix in 2D form 
        
        for(int a = 0; a < row; a++){
            for(int b = 0; b < cols; b++){
                System.out.print(square[a][b] + "");
            }
         System.out.println("");
    }
         //variables to store the sum of diagonals 
         int primarySum = 0;
         int secondarySum = 0;
    
         //diagonal-sum calculation 
         for(int a = 0; a < row; a++){
             primarySum += square[a][a];
             secondarySum += square[a][cols - a - 1];
         }
         //output 
         System.out.println("Main diagonal sum: ");
         System.out.println("Secondary diagonal sum: ");
}
}
    
