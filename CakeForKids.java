package Homework1;

import java.util.Scanner;

public class CakeForKids {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dilim sayısını giriniz : ");
		int n = sc.nextInt();

		System.out.println("Çocuk sayısını giriniz : ");
		int r = sc.nextInt();

		if (n < r) {

			System.out.println("Dilim Sayısı Çocuk Sayısından Büyük Olmalıdır. Lütfen Tekrar Dilim Sayısını Giriniz : ");
			n = sc.nextInt();
			Combination(n, r);
		} else {
			Combination(n, r);
		}
	}

	private static void Combination(int n, int r) {

		int factorial1 = 1;
		int factorial2 = 1;
		int factorial3 = 1;
		int difference = n - r;

		for (int i = 1; i <= n; i++) {

			factorial1 = factorial1 * i;
		}
		System.out.println("Dilim Sayısının Faktöriyeli : " + factorial1);

		for (int j = 1; j <= r; j++) {

			factorial2 = factorial2 * j;
		}
		System.out.println("Çocuk Sayısının Faktöriyeli : " + factorial2);

		for (int k = 1; k <= difference; k++) {

			factorial3 = factorial3 * k;
		}
		System.out.println("(N-R)'nin Faktöriyeli : " + factorial3);

		int prod = factorial2 * factorial3;
		int combination = factorial1 / prod;

		System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + combination);

	}

}
