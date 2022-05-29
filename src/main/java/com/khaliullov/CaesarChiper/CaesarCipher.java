package com.khaliullov.CaesarChiper;


public class CaesarCipher {

    private static String text = "Здесь будет перевод";
    private static int offset = 11;


    public static String run(String text, String confirm){
        if (confirm.equals("on")){
            return decoder(text);
        }
        return cipher(text);
    }

    public static String getText() {
        return text;
    }


    public static String cipher(String message){
        StringBuilder result = new StringBuilder();
        for (char chara : message.toCharArray()){
            if (chara != ' '){
                int originalAlphabetPosition = chara - (char) 'а';
                int newAlphabetPosition = (originalAlphabetPosition + offset);
                char newCharacter = (char) ('а' + newAlphabetPosition);
                result.append(newCharacter);
            } else result.append(chara);
        }
        text = result.toString();
        return text;

    }

    public static String decoder(String message){
        int index = offset - (offset * 2);
        StringBuilder result = new StringBuilder();
        for (char chara : message.toCharArray()){
            if (chara != ' '){
                int originalAlphabetPosition = chara - 'а';
                int newAlphabetPosition = (originalAlphabetPosition + index);
                char newCharacter = (char) ('а' + newAlphabetPosition);
                result.append(newCharacter);
            } else result.append(chara);
        }
        text = result.toString();
        return text;
    }

    private static boolean check(char symbol){
        int i = symbol;
        if ((i < (char) 'А') && (i > (char) 'я') ){
            return false;
        }
        return true;
    }

}
