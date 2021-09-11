package main.java.cryption;

import java.util.HashMap;
import java.util.Random;

public class Generator
{
    private final String sentence;
    private String[] criptionLetterWord;
    private HashMap<String, String[]> letterCription;
    private final Random rnd;
    private String cryptedWord = "";
    private String cryptedSymbol;

    public Generator(String sentence)
    {
        this.sentence = sentence;
        rnd = new Random();
    }

    public char[] generateCriptionLetter() throws NullPointerException
    {
        String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ?/.," ;
        char[] letterArray = new char[5];
        char rant;
        for (int i = 0; i < 5; i++)
        {
            rant = alphabet.charAt(rnd.nextInt(alphabet.length()));
            letterArray[i] = (char) rant;
        }
        return letterArray;
    }

    public String[] criptLetter()
    {
        criptionLetterWord = new String[5];
        for (int i = 0; i < 5; i++)
        {
            String chars = new String(generateCriptionLetter());
            criptionLetterWord[i] = chars;
        }
        return criptionLetterWord;
    }

    public HashMap<String, String[]> createPossibleCryptionsForLetters()
    {
        letterCription = new HashMap<>();

        char[] sentenceLetter = separateStringToLetter();
        for (char c : sentenceLetter)
        {
            criptLetter();
            letterCription.put(String.valueOf(c), criptionLetterWord);
        }
        return letterCription;
    }

    public char[] separateStringToLetter()
    {
        return sentence.toCharArray();
    }

    public String cryptSentence()
    {
        char[] letters = separateStringToLetter();
        String[] currentCryption;
        int i = 0;
        for (char c : letters)
        {
            currentCryption = letterCription.get(Character.toString(c));
            cryptedSymbol = currentCryption[rnd.nextInt(5)];
            cryptedWord = String.format("%s%s" , cryptedWord, cryptedSymbol);
            i++;
        }
        return cryptedWord;
    }
    //ToDo if AMOGUS or Among Us - it incrypts to SUS
}