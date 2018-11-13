package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result;
        cesarMethod encryptation = new cesarMethod();
        System.out.print("Introduce una cadena: ");
        result = sc.nextLine();
        System.out.println();
        System.out.printf("La cadena sin encriptar es: %s\n", result);
        System.out.printf("y la cadena encriptada es: %s", encryptation.cesarEncryption(result));
    }
}
