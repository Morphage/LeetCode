/**
 * You are given an n x n 2D matrix representing an image.
 *
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Follow up:
 * Could you do this in-place?
 */

public class RotateImage {
    public void transpose(int[][] matrix) {
        int N = matrix.length;
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
    
    public void reverse(int[][] matrix) {
        int N = matrix.length;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][N - 1 - j];
                matrix[i][N - 1 - j] = tmp;
            }
        }
    }
    
    // In-place rotate 90 degrees clockwise 
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
}
