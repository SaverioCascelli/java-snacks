package org.snacks;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Snack1 {
    public static void main(String[] args) {
        //Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int number = parseInt(scan.nextLine());

        System.out.println((number%2 == 0) ? number : number + 1);
    }
}
