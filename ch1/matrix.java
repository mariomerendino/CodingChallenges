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
    //UGH REALLY HARD TO EXPLAIN But....
    //when rotating you only need to use half the rows and a quarter of the colums like this
    //
    //////////////////////////////
    /*
        1| 2| 3| 4| 5| 6| 7 // a[0][0] ___ a[0][matrix[i].length - (i+1)]
        8, 9| 1| 2| 3| 4, 5
        6, 7, 8| 9| 1, 2, 3
        4, 5, 6, 7, 8, 9, 1
        2, 3, 4, 5, 6, 7, 8
        9, 1, 2, 3, 4, 5, 6 // a[matrix.length-(i+1)][0] __ a[matrix.length-(i+1)][matrix[i].length]
    */
    public void rotateMatrix(){
        int temp = 0;
        int temp2 = 0;
        for(int i = 0; i < matrix.length/2; i++){
            for(int j = i; j < matrix[i].length-(i+1); j++){
                temp = a[i][matrix[i].length-j];
                a[i][matrix[i].length-j] = a[i][j];
                temp2 = a[matrix.length-(i+1)][matrix[i].length-(i+1)];
                a[matrix.length-(i+1)][matrix[i].length-(i+1)] = temp;
                a[matrix.length-(i+1)][i] = temp2;

            }
        }
    }

}