import java.util.Scanner;

public class VowelConsonant2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int consonant = 0;
        int vowel = 0;

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            char ch = Character.toLowerCase(a);       // used to convert a letter to lowercase.

            if (Character.isLetter(ch)) {                  // checks if a character is a letter.
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                }
                else {
                    consonant++;
                }
            }

        }
        System.out.println("Number of consonants: " + consonant);
        System.out.println("Number of vowels: " + vowel);
    }
}
