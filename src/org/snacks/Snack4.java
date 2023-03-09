package org.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack4 {
    //    Crea due array che hanno un numero di elementi diversi. Mostra a video dei nuovi elementi random finchè il numero di elementi presenti nell’array che ne ha di meno + quelli mostrati a
    //    video non è uguale al numero di elementi presenti nell’array che ne ha di più
    public static void main(String[] args) {

        int[] intArr1 = {12, 7, 3, 35, 5, 48};
        int[] intArr2 = {13, 28};

        int[] smallerArr = intArr1.length > intArr2.length ? intArr2 : intArr1;
        int[] biggerArr = intArr1.length < intArr2.length ? intArr2 : intArr1;

        String smallArrToString = Arrays.toString(smallerArr);
        String biggerArrToString = Arrays.toString(biggerArr);

        System.out.println(smallArrToString);
        System.out.println(biggerArrToString);

        int arrayLengthDiff = biggerArr.length - smallerArr.length;
        int[] equalArr = new int[biggerArr.length];

        Random rand = new Random();

        for (int i = 0; i < equalArr.length; i++) {
            if (i < smallerArr.length) {
                equalArr[i] = smallerArr[i];
            } else {
                int randNumb = rand.nextInt(50);
                equalArr[i] = randNumb;
                System.out.println(randNumb);
            }
        }

        String equalArrToString = Arrays.toString(equalArr);
        System.out.println("L'array più piccolo è diventato:");
        System.out.println(equalArrToString);

    }
}

