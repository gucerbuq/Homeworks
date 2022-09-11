package Homework1;

import java.util.Scanner;

public class Palindrom {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Tersten yazmak istediğiniz kelimeyi girin :");
        String word = input.nextLine();

        String transformed = transform(word);
        
        if (word.equals(transformed)) {
        	
        	System.out.println(" - " + word + " - " + " kelimesi palindrom bir kelimedir.");
        	
        } else {
        	
        	System.err.println(word + " kelimesi palindrom bir kelime değildir.");
        	
        }
        
    }

    public static String transform(String word)
    {
        if (word.isEmpty())
            return word;

        return transform(word.substring(1)) + word.charAt(0);
        
    }
		
}
