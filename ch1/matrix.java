import java.util.*;

public class matrix{
    public static void main(String[] args){
        matrix m = new matrix();
        m.fillMatrix();
        m.printMatrix();
        System.out.println("\nReplacing Zeros...\n");
        m.replaceZeros();
        m.printMatrix();
    }

    public int[][] matrix = new int[10][10];
    public matrix(){

    }

    public void replaceZeros(){
        int[][] x = new int[10][10];
        x = matrix;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    for(int y = 0; y < matrix.length; y++)
                        x[i][y] = 0;
                    for(int y = 0; y < matrix.length; y++)
                        x[y][j] = 0;
                }
                else{
                    x[i][j] = matrix[i][j];
                }
            }
        }
        matrix = x;
    }


    public void fillMatrix(){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random() * 10 + 0);
            }
        }
    }
    public void printMatrix(){
        for(int i = 0; i < matrix.length; i++){
            System.out.print("| ");
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(Integer.toString(matrix[i][j]) + " | ");
            }
            System.out.println();
        }
    }

}