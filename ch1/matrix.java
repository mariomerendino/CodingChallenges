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

        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                //if there is a zero, that entire row and column must be
                //replaced with zeros
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i =0; i < row.length; i++){
            if(row[i] == 1){
                for(int j = 0; j < matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        for(int i =0; i < col.length; i++){
            if(col[i] == 1){
                for(int j = 0; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }

    }


    //fill matrix with random values
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