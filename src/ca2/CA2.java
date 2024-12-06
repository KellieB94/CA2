/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2;

/**
 *
 * @author ismis
 */
////importing the Scanner Class to add Scanner object 
import java.util.Scanner;
public class CA2 {
    
    ////GitHub Repo:
    ////https://github.com/KellieB94/CA2.git
    
         
        ////TASK 1 - function to find the first-repeated element in an array of integers 
         
         ////main function (method) that's driving the program 
         //public static void main(String[] args){
    
        ////initializing the Scanner Class to take user input with an object "input" to use the Scanner Class function 
        //Scanner input = new Scanner(System.in);
        
        ////prompting the user to give array size as input
        //System.out.print("Enter the array size: ");
        
        ////variable to store the given array size 
        //int size = input.nextInt();
        
        ////initializing the array 
        //int[] ray = new int [size];
        
        ////prompting the user to give array elements as input using for loop, 
        ////the for loop enables the user to input more than one element 
        //System.out.println("Enter the array elements: ");
        //for(int a = 0; a < size; a++){
        
            ////variable to store the user input 
            //ray[a] = input.nextInt();
        //}
        
        ////boolean to find the first-repeated element in the array 
        //boolean Found = false;
        
        ////Array Traversal using two nested for-loops, one runs through the outer-loop and one runs through the inner-loop,
        ////to scan through each array element to find the first-repeated element in the array
        //for(int a = 0; a < size; a++){
            //for(int b = a + 1; b < size; b++){
                
                ////conditional if-statement to print to the user the first-repeated element
                //if(ray[a] == ray[b]){
                    //System.out.println("The first repeated element is: " + ray[a]);
                    
                    ////breaking the loop on the condition that first-repeated element is found 
                    //Found = true;
                    //break; 
                //}
            //}
            
            ////breaking the loop if the first-repeated element is found
            //if(Found){
               //break;
            //}
        //}
        
        ////print-statement if it occurs that no repeated-element is found
        //if(!Found) {
            //System.out.println("No repeat-elements found!");
        //}
        
        ////closing the Scanner class to prevent errors and stop more user input 
        //input.close();
    //}
//}
        
        
        ////TASK 2 - function that generates a multiplication table using a 2D array 
         
        ////main function (method) that's driving the program
        //public static void main(String[] args){
        
        ////calling the Scanner class to take user input by initializing the Scanner object "input"
        //Scanner input = new Scanner(System.in);
        
        ////prompting the user to enter the multiplication table size 
        //System.out.println("Enter the number of rows and columns in table (Example: 5x5/NxN): ");
        
        ////variable to store the table size 
        //int a = input.nextInt();
        
        ////initializing 2D array to store the values of the multiplication 
        //int[][] mulTable = new int[a][a];
       
        ////populating the multiplication table by adding values, using two nested for-loops, 
        ////one runs through the outer-loop and one runs through the inner-loop to give the multiplication products 
        //for(int b = 0; b < a; b++){
            //for(int c = 0; c < a; c++){
            
                ////variable to store the multiplication products
                //mulTable[b][c] = (b + 1) * (c + 1);
            //}
        //}
        
        ////displaying the multiplication table in the form of a matrix,
        ////using two nested for-loops, one runs through the outer-loop and the other runs through the inner-loop,
        ////to ensure a neat format 
        //System.out.println("Multiplication Table: ");
        //for(int b = 0; b < a; b++){
            //for(int c = 0; c < a; c++){
            
                ////printing each element in a nice-sized (5) alignment to make the table easier to read 
                //System.out.printf("%5d", mulTable[b][c]);
            //}
            
            ////function to print a new line after every row, for easier reading 
            //System.out.println();
            
        //}
        
        ////closing the Scanner class to stop user input capability and to prevent any errors  
        //input.close();
      //}
   //}
        
        
        ////TASK 3 - calculating the sum of the main-diagonal and the secondary-diagonal of a square matrix 
         
         ////main function (method) that's driving the program 
         //public static void main(String[] args) {
        
        ////calling the scanner class by creating object "input" to take user input 
        //Scanner input = new Scanner(System.in);
        
        ////prompting input from the user to give number of rows in the matrix 
        //System.out.println("Enter the number of rows: ");
        
        ////variable to store the number of rows 
        //int row = input.nextInt();
        
        ////prompting input from the user to give number of columns in the matrix 
        //System.out.println("Enter the number of columns: ");
        
        ////variable to store the number of columns 
        //int cols = input.nextInt();
        
        ////initializing the matrix 
        //int[][] square = new int [row][cols];
        
        ////prompting the user to enter row by row elements 
        //System.out.println("Enter elements: ");
        
        ////initialization of two nested for-loops to allow user to enter elements one by one,
        ////one runs through the outer-loop and the other runs through the inner-loop
        //for(int a = 0; a < row; a++){
            //for(int b = 0; b < cols; b++){
                
                ////variable to store the elements inputted by user 
                //square[a][b] = input.nextInt();
            //}
        //}
        
        ////display of the matrix in 2D form 
        ////initialization of two nested for-loops to display the matrix table 
        //for(int a = 0; a < row; a++){
            //for(int b = 0; b < cols; b++){
                
                ////print-statement to show the table in a readable size for blind people like me ;)
                //System.out.printf("%5d", square[a][b]);
            //}
            
            ////function to print a new line every row, for easier reading 
         //System.out.println("");
     //}
         ////variables to store the sum of diagonals 
         //int primarySum = 0;
         //int secondarySum = 0;
    
         ////diagonal-sum calculation using a for-loop 
         //for(int a = 0; a < row; a++){
             //primarySum += square[a][a];
             //secondarySum += square[a][cols - a - 1];
         //}
         
         ////print-statement to output the main-diagonal and secondary diagonal-sum to the user 
         //System.out.println("Main diagonal sum: " + primarySum);
         //System.out.println("Secondary diagonal sum: " + secondarySum);
         //}
   //}
         
         ////TASK 4 - traverse a spiral in matrix order 
         
         ////traverse the matrix in a spiral-order function 
         //public static void matrixSpiral(int[][] square, int row, int col){
             
             ////variables to initialize 4 boundaries to track the traversed spiral-edges 
             //int up = 0, left = 0;
             //int down = row - 1, right = col -1;
             
            ////two nested-loops, while and for to traverse the top row from left to right 
             //while(up <= down && left <= right) {
            //for (int a = left; a <= right; a++) {
                //System.out.print(square[up][a] + " ");
            //}
            //up++;
            
            ////two nested-loops, while and for to traverse the right column from top to bottom 
            //for (int a = up; a <= down; a++) {
                //System.out.print(square[a][right] + " ");
            //}
            //right--;

            ////two nested-loops, while and for to traverse the bottom row from right to left
            //if (up <= down) {
                //for (int a = right; a >= left; a--) {
                    //System.out.print(square[down][a] + " ");
                //}
                //down--;
            //}

            ////two nested loops, while and for, with an if statement to traverse the left column from bottom to top
            //if (left <= right) {
                //for (int a = down; a >= up; a--) {
                    //System.out.print(square[a][left] + " ");
                //}
                //left++;
               //}
             //}
         //}
         
        ////main function (method) that's driving the program 
        //public static void main(String[] args) {
            
        ////calling the scanner class, using the object "input" to take user input
        //Scanner input = new Scanner(System.in);

        ////Prompting the user to enter the number of rows and columns, accepting the dimensions of the matrix
        //System.out.print("Enter number of rows: ");
        
        ////variable to store the number of rows 
        //int row = input.nextInt();
        //System.out.print("Enter number of columns: ");
        
        ////variable to store the number of columns
        //int col = input.nextInt();
        
        ////Matrix elements initialization 
        //int[][] square = new int [row][col];
        
        ////prompting the user to input the matrix-elements 
        //System.out.println("Enter matrix elements: ");
        
        ////two nested for-loops to print the matrix-elements, one by one
        //for(int a = 0; a < row; a++){
            //for(int b = 0; b < col; b++){
                
                ////variable to store the matrix elements 
                //square[a][b] = input.nextInt();
            //}
        //}
        
        ////displaying the traversal of the matrix in spiral-order with a print-statement 
        //System.out.println("Traversal of Spiral-Order: ");
        
        //matrixSpiral(square, row, col);
        //}
    //}

        
         ////TASK 5 - implement the bubble-sort algorithm to sort an array of integers in ascending order 
    
         ////function to initialize bubble-sort
           public static void SortBub(int[] ray) {
            
           ////variable to store the array length 
           int a = ray.length;
           
           ////variable to count the amount of swaps 
           int b = 0;
           
           ////two nested-loops to run through the array elements, the outer-loop is for the number of passes,
           ////the inner-loop is adjacent element comparison 
        for (int i = 0; i < a - 1; i++) {
            ////Inner loop for comparing adjacent elements
            for (int j = 0; j < a - 1 - i; j++) {
                
                ////if-statement to swap and compare elements if they're in the wrong order
                if (ray[j] > ray[j + 1]) {
                    
                    ////variable for swapping the elements 
                    int swap = ray[j];
                    ray[j] = ray[j + 1];
                    ray[j + 1] = swap;
                    b++; 
                }
            }
        }

        //displaying the total number of swaps to the user 
        System.out.println("Total number of swaps: " + b);
    }
           
        //function for printing the array using a for-loop
        public static void Rayprint(int[] ray) {
        for (int i : ray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
       ////main function (method) that's driving the program   
        public static void main(String[] args) {
             
        ////calling the scanner class with scanner object "input" to take input from the user 
        Scanner input = new Scanner(System.in);

        ////prompting user to enter the array size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        ////Declaration of the array and elements acception 
        int[] ray = new int[size];
        
        ////print-statement that outputs the size 
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            ray[i] = input.nextInt();
        }
             
             
             
             
         }
      }