package com.company;

public class cesarMethod {
    public String cesarEncryption(String string) {
        int asciiValue;
        char letter;
        String result = "";
        string = string.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            asciiValue = (int)string.charAt(i);
            switch (asciiValue){
                case 88: letter = 'A';
                break;
                case 89: letter = 'B';
                break;
                case 90: letter = 'C';
                break;
                case 32: letter = (char)asciiValue;
                break;
                default: letter = (char)(asciiValue + 3);
                break;
            }
            result += letter;
        }
        return result;
    }
}
