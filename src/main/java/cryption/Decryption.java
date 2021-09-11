package main.java.cryption;

import jdk.nashorn.internal.ir.Splittable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Spliterator;
import java.util.Spliterators;

public class Decryption extends Generator
{
    String sentence;
    private String cryptedSplitMessage;

    public Decryption(String sentence)
    {
        super(sentence);
    }

    public void decryptSentence()
    {
        //        char[] letters = separateStringToLetter();
        //        String[] currentCryption;

        //        int i = 0;
        //        for (char c : letters)
        //        {
        //            currentCryption = letterCription.get(Character.toString(c));
        //            String cryptedSymbol = currentCryption[rnd.nextInt(5)];
        //            cryptedWord = String.format("%s%s" , cryptedWord, cryptedSymbol);
        //            i++;
        //        }
        //        return cryptedWord;
        ArrayList<String> uncryptedMessage = new ArrayList<>();
        for (int i = 0; i < cryptedMessage.length(); i = i + cryptionSymbolsAmount)
        {
            cryptedSplitMessage = cryptedMessage.substring(i, i + cryptionSymbolsAmount);
            uncryptedMessage.add(cryptedSplitMessage);
        }
//        for (String c : letterCryption)
//        {
//            letterCryption.get(uncryptedMessage.get(Integer.parseInt(c)));
//            System.out.println("23123");
//        }

    }
}
