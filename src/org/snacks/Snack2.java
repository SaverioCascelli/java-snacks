package org.snacks;

import java.util.Random;

public class Snack2 {

//    Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

    public static void main(String[] args) {

        String[] nameArr = {"Filippo", "Piero", "Andrea", "Mario", "Gianluca"};
        String[] lastNameArr = {"Rossi", "Bianchi", "Stelluti", "Mariani", "Alberti",};

        for (int i = 0; i < nameArr.length; i++) {
            Random rand = new Random();
            int nameIndex = rand.nextInt(nameArr.length);
            int lastNameIndex = rand.nextInt(lastNameArr.length);

            System.out.println(nameArr[nameIndex] + " " + lastNameArr[lastNameIndex]);

        }
    }


}
