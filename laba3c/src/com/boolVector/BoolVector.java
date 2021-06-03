package com.boolVector;

import java.util.Arrays;
import java.util.Scanner;

public class BoolVector {
    private final int[] vector;
    private final int dimension;
    private final int weight;
    private final int numberOfZeroes;

    public BoolVector(int[] vector) {
        this.vector = vector;
        this.dimension = vector.length;
        this.weight = calcWeight();
        this.numberOfZeroes = calcZeros ();
    }

    public BoolVector(int dimension) {
        this.dimension = dimension;
        this.vector = new int[dimension];
        Scanner input = new Scanner(System.in);
        System.out.println ("write elements of bool vector");
        for (int i = 0; i < dimension; i++) {
            this.vector[i] = input.nextInt();
        }
        this.weight = calcWeight();
        this.numberOfZeroes = calcZeros ();
    }

    public BoolVector conjunctionVectors (BoolVector boolVector) {
        int[] array = new int[boolVector.vector.length];

        for (int i = 0; i< boolVector.vector.length; i++) {
            if (this.vector[i] == 1 && boolVector.vector[i] == 1) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        return new BoolVector (array);
    }

    public BoolVector disjunctionVectors (BoolVector boolVector) {
        int[] array = new int[boolVector.vector.length];

        for (int i = 0; i< boolVector.vector.length; i++) {
            if (this.vector[i] == 0 && boolVector.vector[i] == 0) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }

        return new BoolVector (array);
    }


    public BoolVector negationOfVector () {
        int[] array = new int[this.vector.length];

        for (int i = 0; i< this.vector.length; i++) {
            if (this.vector[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }

        return new BoolVector (array);
    }

    private int calcZeros () {
        int numberOfZeroes = 0;
        for (int j : this.vector) {
            if (j == 0) {
                numberOfZeroes++;
            }
        }
        return numberOfZeroes;
    }

    private int calcWeight () {
        int weight = 0;
        for (int j : this.vector) {
            if (j == 1) {
                weight++;
            }
        }
        return weight;
    }

    public int[] getVector() {
        return vector;
    }

    public int getDimension() {
        return dimension;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumberOfZeroes() {
        return numberOfZeroes;
    }

    @Override
    public String toString() {
        return "BoolVector{" + "vector=" + Arrays.toString(vector) +
                ", dimension=" + dimension +
                ", weight=" + weight +
                ", numberOfZeroes=" + numberOfZeroes +
                '}';
    }
}