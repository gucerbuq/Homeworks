package Homework1;

import java.util.Scanner;

public class BackwardWord {

	public static void main(String[] args) {
	    
        Scanner input = new Scanner(System.in);
        System.out.print("Tersten yazmak istediğiniz kelimeyi girin :");
        String word = input.nextLine();

        String transformed = transform(word);
        System.out.println("Çevrilen Yazı: " + transformed);
    }

    public static String transform(String word)
    {
        if (word.isEmpty())
            return word;

        return transform(word.substring(1)) + word.charAt(0);
    }

}
