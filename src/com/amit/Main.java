package com.amit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    String texto, reverse = "";

    System.out.print("Dame un texto: ");
    texto = entrada.nextLine();

    for(int i = texto.length() - 1; i >= 0; i-- ){
        reverse = reverse + texto.charAt(i);
    }

    texto.toLowerCase();
    reverse.toLowerCase();

    if(texto.equals(reverse)){
        System.out.print("Es un texto palindromo ");
    }else {
        System.out.print("No es un texto palindromo ");
    }


    entrada.close();
    }
}
