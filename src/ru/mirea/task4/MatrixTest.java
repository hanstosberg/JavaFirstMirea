package ru.mirea.task4;

public class MatrixTest {
    public static void main(String[] args) {
        double[][] twoDimArray = {{5.7, 7.4, 3.9}, {7.5, 0, 1.8}, {8, 1, 2}};

        Matrix matrix1 = new Matrix();
        matrix1.arr = twoDimArray;
        matrix1.str = 3;
        matrix1.columns = 3;

        Matrix matrix2 = new Matrix();
        matrix2.arr = twoDimArray;
        matrix2.str = 3;
        matrix2.columns = 3;

        matrix1.addition(matrix2);
        matrix1.printMatrix();

        System.out.println();

        matrix2.multiplication(3);
        matrix2.printMatrix();
        System.out.println();

        matrix1.multimatrix(matrix2);
        matrix1.printMatrix();
        System.out.println();
    }
}











/*
        matrix.printMatrix();

       // matrix.addition();
        matrix.printAdditionalMatrix();
        System.out.println();
        matrix.multiplication(3);
        matrix.printMultiplicationMatrix();
    }
}



    private int[][] arr = {
            {1,2,3},
            {3,4,5},
            {5,6,7}
    };

    private int[][] arr1 = {
            {1,2,3},
            {3,4,5},
            {5,6,7}
    };
    private int[][] arr2 = {
            {0,0,0},
            {0,0,0},
            {0,0,0}
    };*/
