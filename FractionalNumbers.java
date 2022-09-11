package Homework1;

import java.util.Scanner;

public class FractionalNumbers {

	public static void main(String[] args) {
		
		int ebob = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Birinci kesirli sayının payını giriniz : ");
		int numerator1 = sc.nextInt();
		System.out.println("Birinci kesirli sayının paydasını giriniz : ");
		int denominator1 = sc.nextInt();
		System.out.println("İkinci kesirli sayının payını giriniz : ");
		int numerator2 = sc.nextInt();
		System.out.println("İkinci kesirli sayının paydasını giriniz : ");
		int denominator2 = sc.nextInt();

		System.out.println("Yapmak istediğiniz işlemi seçiniz :\n" + "1 - Toplama\n" + "2 - Çıkarma\n" + "3 - Bölme\n"
				+ "4 - Çarpma\n" + "Çıkmak için 0'a basınız");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			int sumNumerator = numerator1 * denominator2 + numerator2 * denominator1;
			int sumDenominator = denominator1 * denominator2;
			
			System.out.println("Sonuç : " + sumNumerator + "/" + sumDenominator);
			
			for (int i=1;i<=sumNumerator && i<=sumDenominator;i++) {
				
				if (sumNumerator%i==0 && sumDenominator%i==0) {
					
					ebob=i;			
				}
				
			}
			
			System.out.println("Kesrin sadeleşmiş hali : " + sumNumerator/ebob + "/" + sumDenominator/ebob);
			
			break;
			
		case 2:
			int minusNumerator = numerator1 * denominator2 - numerator2 * denominator1;
			int minusDenominator = denominator1 * denominator2;
			
			System.out.println("Sonuç : " + minusNumerator + "/" + minusDenominator);
			
			for (int i=1;i<=minusNumerator && i<=minusDenominator;i++) {
				
				if (minusNumerator%i==0 && minusDenominator%i==0) {
					
					ebob=i;			
				}
				
			}
			
			System.out.println("Kesrin sadeleşmiş hali : " + minusNumerator/ebob + "/" + minusDenominator/ebob);
			
			break;
			
		case 3:
			int divNumerator = numerator1 * denominator2;
			int divDenominator = numerator2 * denominator1;
			
			System.out.println("Sonuç : " + divNumerator + "/" + divDenominator);
			
			for (int i=1;i<=divNumerator && i<=divDenominator;i++) {
				
				if (divNumerator%i==0 && divDenominator%i==0) {
					
					ebob=i;			
				}
				
			}
			
			System.out.println("Kesrin sadeleşmiş hali : " + divNumerator/ebob + "/" + divDenominator/ebob);
			
			break;
			
		case 4:
			int prodNumerator = numerator1 * numerator2;
			int prodDenominator = denominator1 * denominator2;
			
			System.out.println("Sonuç : " + prodNumerator + "/" + prodDenominator);
			
			for (int i=1;i<=prodNumerator && i<=prodDenominator;i++) {
				
				if (prodNumerator%i==0 && prodDenominator%i==0) {
					
					ebob=i;			
				}
				
			}
			
			System.out.println("Kesrin sadeleşmiş hali : " + prodNumerator/ebob + "/" + prodDenominator/ebob);
			
			break;
			
		case 0:
			break;
		
		default:
			System.out.println("Lütfen menüden bir seçenek giriniz.");
		}

	}

}
