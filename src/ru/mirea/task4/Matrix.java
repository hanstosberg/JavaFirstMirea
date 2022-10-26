package ru.mirea.task4;

public class Matrix {

    public double[][] arr;
    int columns;

    int str;

    public void addition(Matrix matrix2){
        for(int i = 0; i < columns; i++){
            for (int j = 0; j < str; j++){
                arr[i][j] = arr[i][j] + matrix2.arr[i][j];
            }
        }
    }

    public void multiplication(int num){
        for(int i = 0; i < columns; i++){
            for (int j = 0; j < str; j++){
                arr[i][j] = arr[i][j] * num;
            }
        }
    }

    public void printMatrix(){
        for(int i = 0; i < columns; i++){
            for (int j = 0; j < str; j++){
                System.out.print(arr[i][j] + "     ");
            }
            System.out.println();
        }
    }

    public void multimatrix(Matrix array2){
        for(int i = 0; i < columns; i++){
            for (int j = 0; j < str; j++){
                arr[i][j] = arr[i][j] * array2.arr[i][j];
            }
        }

    }
}







