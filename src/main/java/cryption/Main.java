package main.java.cryption;

import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    static HashMap<String, String[]> hashMap;
    public static void main(String[] args)
    {
        // Puts words for cription
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word: ");
        String sentence = scanner.nextLine();
        //Cript every letter with possible crypts and return it as hashmap
        Generator generator = new Generator(sentence);
        hashMap = generator.createPossibleCryptionsForLetters();
        System.out.println(">>> We created cription for word: " + sentence);
        System.out.println(">>> We created cription for word: " + sentence);
        // Crypt sentence
        String cryptedSentence = generator.cryptSentence();
        System.out.println("The sentence without cryption: " + sentence + "\n The sentence with cryption: " +cryptedSentence);
        cryptedSentence = generator.cryptSentence();
        System.out.println("The sentence without cryption: " + sentence + "\n The sentence with cryption: " +cryptedSentence);
        cryptedSentence = generator.cryptSentence();
        System.out.println("The sentence without cryption: " + sentence + "\n The sentence with cryption: " +cryptedSentence);
    }
}
