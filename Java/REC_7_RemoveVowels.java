package Java;

import java.util.Scanner;

public class REC_7_RemoveVowels {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string :: ");

            String str = sc.nextLine();

            String res = removeVowel(str);
            
            System.out.println("Orginal String :: " + str);

            System.out.println("String without Vowels :: " + res);
        }
    }

    public static String removeVowel(String str){
        return str.replaceAll("[AEIOUaeiou]", " ");
    }
}
