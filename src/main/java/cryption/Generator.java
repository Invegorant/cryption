package main.java.cryption;

import java.util.HashMap;
import java.util.Random;

public class Generator
{
    private final String sentence;
    public static HashMap<String, String[]> letterCryption;
    private final Random rnd;
    public static String cryptedMessage;
    public static final int cryptionSymbolsAmount = 5;

    public Generator(String sentence)
    {
        this.sentence = sentence;
        rnd = new Random();
    }

    public char[] generateCryption() throws NullPointerException
    {
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ?/.," ;
        char[] letterArray = new char[cryptionSymbolsAmount];
        char rant;
        for (int i = 0; i < cryptionSymbolsAmount; i++)
        {
            rant = alphabet.charAt(rnd.nextInt(alphabet.length()));
            letterArray[i] = (char) rant;
        }
        return letterArray;
    }

    public String[] cryptLetter()
    {
        String[] cryptionLetterWord = new String[cryptionSymbolsAmount];
        for (int i = 0; i < cryptionSymbolsAmount; i++)
        {
            String chars = new String(generateCryption());
            cryptionLetterWord[i] = chars;
        }
        return cryptionLetterWord;
    }

    public HashMap<String, String[]> createPossibleCryptionsForLetters()
    {
        letterCryption = new HashMap<>();

        char[] sentenceLetter = separateStringToLetter();
        for (char c : sentenceLetter)
        {
            letterCryption.put(String.valueOf(c), cryptLetter());
        }
        return letterCryption;
    }

    public char[] separateStringToLetter()
    {
        return sentence.toCharArray();
    }

    public String cryptSentence()
    {
        char[] letters = separateStringToLetter();
        String[] currentCryption;
        String cryptedString = "";
        int i = 0;
        for (char c : letters)
        {
            currentCryption = letterCryption.get(Character.toString(c));
            String cryptedSymbol = currentCryption[rnd.nextInt(cryptionSymbolsAmount)];
            cryptedString = String.format("%s%s" , cryptedString, cryptedSymbol);
            i++;
        }
        return cryptedMessage = cryptedString;
    }
}