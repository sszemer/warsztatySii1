package przypomnienie.tablice;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        printArray(theMethod(fillArray(new Random().nextInt(100)), new Random().nextInt(100), new Random().nextInt(100)));
    }

    private static int[] fillArray(int j) {
        int[] input;
        input = new int[j];
        for (int i = 0; i < j; i++) {
            input[i] = i;
        }
        return input;
    }

    private static int[] theMethod(int[] t, int start, int end) {
        int[] wynik = null;

        if (t.length == 0) {
            throw new RuntimeException("tablica wejsciowa jest pusta");
        }
        if (start>end) {
            throw new RuntimeException("start nie moze byc wiekszy od konca");
        }
        if(start>t.length||end>t.length){
            throw new RuntimeException("indeksy poza zakresem");
        }
        int wielkosc_nowej_tablicy = end - start + 1;
        wynik = new int[wielkosc_nowej_tablicy];
        System.out.println("wielkosc_nowej_tablicy:" + wielkosc_nowej_tablicy);
        int j = 0;
        for (int i = 0; i < t.length; i++) {
            if (i >= start && i <= end) {
                System.out.println("i:" + i + " j:" + j);
                wynik[j++] = t[i];
            }
        }
        return wynik;
    }

    private static void printArray(int[] t) {
        for (int i : t) {
            System.out.print(i+",");
        }
    }
}
