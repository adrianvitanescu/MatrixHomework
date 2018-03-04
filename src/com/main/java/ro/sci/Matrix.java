package com.main.java.ro.sci;

import java.util.ArrayList;
import java.util.List;

public class Matrix<E extends Number> {

    private List<List<E>> matrixValues = new ArrayList<>();

    public Matrix(int size, E initialValue) {
        List<E> numbersList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            numbersList.add(initialValue);
        }
        for (int j = 0; j < size; j++) {
            matrixValues.add(numbersList);
        }
    }

    /**
     * Display Matrix
     */
    public void displayMatrix() {
        for (int i = 0; i < matrixValues.size(); i++) {
            System.out.println(matrixValues.get(i));
        }
    }

    /**
     * Find the sum of all values from the matrix
     */
    public void getSum() {
        Double sum = 0.0;
        for (int i = 0; i < matrixValues.size(); i++) {
            for (int j = 0; j < matrixValues.size(); j++) {
                sum += matrixValues.get(i).get(j).doubleValue();
            }
        }
        System.out.println("\nSum of all elements from the matrix is: " + sum + "\n");
    }

    /**
     * Obtain the row sum from matrix by selecting a line number
     * @param lineNumber
     */
    public void getLineSum(int lineNumber) {
        double sum = 0;
        for (E e : matrixValues.get(lineNumber - 1)) {
            sum = sum + e.doubleValue();
        }
        System.out.println("Sum of row " + lineNumber + " is: " + sum);
    }

    /**
     * Calculate the sum of the diagonal of the matrix
     * for value 1 to get sum of major diagonal / value 2 for sum of minor
     * @param diagNumber
     */
    public void diagonalSum(int diagNumber) {
        double sum = 0;
        if (diagNumber == 1) {
            for (int i = 0; i < matrixValues.size(); i++) {
                for (int j = 0; j < matrixValues.size(); j++) {
                        sum = sum + matrixValues.get(i).get(j).doubleValue();
                }
            }
            System.out.println("Sum of major diagonal (1) is: " + sum);
        } else {
            for (int i = matrixValues.size() - 1; i >= 0; i--) {
                for (int j = matrixValues.size() - 1; j >= 0; j--) {
                        sum = sum + matrixValues.get(i).get(j).doubleValue();
                }
            }
        }
        System.out.println("Sum of minor diagonal (2) is: " + sum);
    }
}

