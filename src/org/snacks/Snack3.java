package org.snacks;

public class Snack3 {
    //Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
    public static void main(String[] args) {

        int[] numbersArr = {1, 32, 12, 27, 2, 45, 17, 85, 2, 65, 15};
        int total = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            //bitwise operator and. If i is odd, add the value in total
            if ((i & 1) == 1) {
                total += numbersArr[i];
            }
        }
        System.out.println("Somma totale delle posizioni dispari: " + total);
    }
}
