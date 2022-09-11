package Homework1;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Oluşturulacak matrisin satır ve sütun sayısını giriniz : ");
        int s = sc.nextInt();
        int[][] matrix = new int[s][s]; 
        int[][] transpose = new int[s][s];
        for (i = 0; i < s; i++) {
            for (j = 0; j < s; j++) {
                System.out.println((i + 1) + "x" + (j + 1) + "sayıyı giriniz : ");
                matrix[i][j] = sc.nextInt();
                transpose[i][j] = matrix[i][j];
            }
        }
        for (i = 0; i < s; i++) {  
            for (j = 0; j < s; j++) {
                System.out.print(matrix[i][j] + "\t");

            }

            System.out.println("");

        }

        System.out.println("");
        for (i = 0; i < s; i++) {
            for (j = 0; j < s; j++) {
                System.out.print(transpose[j][i] + "\t"); 

            }

            System.out.println("");

        }

	}

}
