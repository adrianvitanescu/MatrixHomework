package com.main.java;

/**
 * Matrix
    Create a generic Matrix class that contains:
  - a matrix of generic elements
  - a constructor that has two parameters: size and initial value
  - toString method that prints the matrix and the size
  - getSum method that calculates the sum of all elements
  - addValue( i , j , value) that replaces the value from the matrix
    at position [i,j] with the value specified
  - getLineSum(i) returns the sum of the elements of line i
  - getDiagSum(i) where i is the diagonal (it can be 1 or 2)
 */

import com.main.java.ro.sci.Matrix;
import java.util.Scanner;
public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a size: ");
        int size = input.nextInt();
        Matrix<Integer> matrix = new Matrix<>(size, 5);
        matrix.displayMatrix();
        matrix.getSum();

        System.out.println("Select a row to returns the sum line: ");
        int lineNumber = input.nextInt();
        matrix.getLineSum(lineNumber);

        int diagNumber;
        do {
            System.out.println("\nSelect diagonal number 1 or 2: ");
            while (!input.hasNextInt()) {
                System.out.println("That's not a number!");
                input.next(); // this is important!
            }
            diagNumber = input.nextInt();
        } while (diagNumber != 1 && diagNumber !=2);

        matrix.diagonalSum(diagNumber);
    }
}
