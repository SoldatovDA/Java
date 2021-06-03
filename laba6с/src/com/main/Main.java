package com.main;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "matrix.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int lines = 0;
            String number;
            StringBuffer numbers = new StringBuffer();
            number = reader.readLine();
            while (number != null) {
                lines++;
                numbers.append(number);
                number = reader.readLine();
            }
            int dim = (int) Math.sqrt(lines);
            System.out.println("matrix dimension: ");
            System.out.println(dim);
            String[][] matrix = new String[dim][dim];
            String[][] originalMatrix = new String[dim][dim];
            String line;

            int counter = 0;

            int count_i = 0;

            int count_j = 0;

            while (counter < lines) {

                if(count_j == dim){
                    count_i++;
                    count_j = 0;
                }

                originalMatrix[count_i][count_j] = String.valueOf(numbers.charAt(counter));
                count_j++;

                counter++;

            }

            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    matrix[j][dim - 1 - i] = originalMatrix[i][j];
                }
            }

            String fileName = "matrixOut.txt";
            File newFile = new File(fileName);

            try {
                if (newFile.createNewFile()) {
                    System.out.println("File has been created");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            FileWriter writer = new FileWriter(fileName, true);

            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    writer.write(originalMatrix[i][j] + " ");
                }
                writer.write("\n");
            }

            writer.write("\n");

            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    writer.write(matrix[i][j] + " ");
                }
                writer.write("\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
