import java.util.Scanner;
public class MatrixToDeterminant {
    
        public static double determinant2x2(double[][] matrix) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
    
        public static double determinant3x3(double[][] matrix) {
            double a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
            double d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
            double g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];
    
            double det = a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
            return det;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // System.out.print("Enter the size of the matrix (2 or 3): ");
            int n = scanner.nextInt();
            
            if (n != 2 && n != 3) {
                // System.out.println("Invalid matrix size. This program supports 2x2 and 3x3 matrices only.");
                return;
            }
    
            double[][] matrix = new double[n][n];
            
            // System.out.println("Enter the matrix elements:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextDouble();
                }
            }
            
            double determinant;
            if (n == 2) {
                determinant = determinant2x2(matrix);
            } else {
                determinant = determinant3x3(matrix);
            }
    
            System.out.println("Determinant of the matrix is: " + determinant);
    
            scanner.close();
        }
    }

