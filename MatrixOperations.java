import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of rows and columns:");
        int n = scanner.nextInt(); // Assuming square matrix for simplicity
        
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        
        System.out.println("Enter elements of first matrix:");
        fillMatrix(scanner, matrix1);
        
        System.out.println("Enter elements of second matrix:");
        fillMatrix(scanner, matrix2);
        
        System.out.println("Matrix Addition:");
        printMatrix(addMatrices(matrix1, matrix2));
        
        System.out.println("Matrix Subtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2));
        
        System.out.println("Matrix Multiplication:");
        printMatrix(multiplyMatrices(matrix1, matrix2));
        

        
        System.out.println("Trace of First Matrix: " + findTrace(matrix1));
        
        scanner.close();
    }
    
    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = scanner.nextInt();
    }
    
    private static int[][] addMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }
    
    private static int[][] subtractMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }
    
    private static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }
    
   
    
    private static int findTrace(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < matrix.length; i++)
            trace += matrix[i][i];
        return trace;
    }
    
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
