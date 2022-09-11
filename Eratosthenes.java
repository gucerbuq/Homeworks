package Homework1;

import java.util.ArrayList;
import java.util.Scanner;

public class Eratosthenes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayı giriniz : ");
		int num1 = sc.nextInt();

		int[] allNum = new int[num1];

		for (int i = 0; i < num1; i++) {
			allNum[i] = i;
		}
		allNum[0] = 0;
		allNum[1] = 0;
		
		int limit = (int) Math.ceil(Math.sqrt(num1));

		for (int i = 2; i <= limit; i++) {
			
			int notPrime = i * i;
			
			for (int j = notPrime; j < num1; j += i) {
				
				if (allNum[j] != 0) {
					allNum[j] = 0;
				}
			}
		}

		for (int i = 0; i < allNum.length; i++) {
			
			if (allNum[i] != 0) {
				
				System.out.println("Asal : " + allNum[i]);
				
			}
		}
	}

}
