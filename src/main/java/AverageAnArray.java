/* 7.8 (Average an array) Write two overloaded methods that return the average of an array with the following headers:

public static int average(int[] array)

public static double average(double[] array)

Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value.
*/
import java.util.Scanner;

public class AverageAnArray {
  public static void main(String[] args) {
    // Promt user to enter ten double values
    Scanner input = new Scanner(System.in);
    System.out.print("Enter ten double values: " );

    // Create an array to store the ten double values
    double[] array = new double[10];
    for (int i = 0; i < array.length; i++)
      array[i] = input.nextDouble();
    
    // Display the average value
    System.out.print("The average is " + average(array));
  }
  // Method to return the average of an array of ints
  public static int average(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum / array.length;
  }
  
  public static double average(double[] array) {
    double sum = 0;
    // Loop through the array and add each element to the sum
    for (int i = 0; i < array.length; i++) {
      // Add the element to the sum
      sum += array[i];
    }
    return sum / array.length;
  }
}
