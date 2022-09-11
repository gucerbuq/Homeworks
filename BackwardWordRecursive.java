package Homework1;

import java.util.Scanner;

public class BackwardWordRecursive {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tersten yazmak istediğiniz kelimeyi girin : ");
		String word = sc.nextLine(); 
        Reverse(word);

	}	

	static void Reverse(String str) {
		if ((str == null) || (str.length() <= 1))
			System.out.println(str);
		else {
			System.out.print(str.charAt(str.length() - 1));
			Reverse(str.substring(0, str.length() - 1));
		}
	}

	

}
