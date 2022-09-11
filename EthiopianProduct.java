package Homework1;

import java.util.Scanner;

public class EthiopianProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("İlk sayıyı giriniz : ");
		int num1 = sc.nextInt();
		System.out.println("İkinci sayıyı giriniz : ");
		int num2 = sc.nextInt();

		int num3 = num2;
		int count = 0;

		while (num1>=2) {

				num1 = num1 / 2;
				count++;
				
		} System.out.println((Math.pow(2, count)) * num2 + num2 );

	} 

}
