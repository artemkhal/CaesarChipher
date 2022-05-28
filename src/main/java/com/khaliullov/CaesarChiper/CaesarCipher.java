package com.khaliullov.CaesarChiper;

import org.springframework.stereotype.Service;

public class CaesarCipher {

    public static String run(String text, boolean flag){
        if (flag) return cipher(text);
        else return decoder(text);
    }

    private static int offset = 11;

    public static String cipher(String message){
        StringBuilder result = new StringBuilder();
        for (char chara : message.toCharArray()){
            if (check(chara)){
                int originalAlphabetPosition = chara - (char) 'а';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 33;
                char newCharacter = (char) ('а' + newAlphabetPosition);
                result.append(newCharacter);
            } else result.append(chara);
        }
        return result.toString();

    }

    public static String decoder(String message){
        int index = offset - (offset * 2);
        StringBuilder result = new StringBuilder();
        for (char chara : message.toCharArray()){
            if (check(chara)){
                int originalAlphabetPosition = chara - 'а';
                int newAlphabetPosition = (originalAlphabetPosition + index) % 33;
                char newCharacter = (char) ('а' + newAlphabetPosition);
                result.append(newCharacter);
            } else result.append(chara);
        }
        return result.toString();
    }

    private static boolean check(char symbol){
        char[] uncorrected = {' ', '.', ',', 'ё', '!', '?', ':', '-', '%', ';', '—'};
        for (char ch : uncorrected){
            if (symbol == ch) return false;
        }
        return true;
    }

}
