package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, i, brojac = 0, sumacifara = 0;
        int niz[];
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite velicinu niza n: ");
        n = unos.nextInt();
        niz = new int[n + 2];
        for (i = 1; i < n + 1; i++) {
            niz[i] = i;
            while (brojac < i) {
                sumacifara += (niz[i] % 10);
                niz[i] = niz[i] / 10;
                sumacifara += niz[i];
                brojac++;
            }
         niz[i] = i;
            if (niz[i] % sumacifara == 0) {
                System.out.println(niz[i]); }
            sumacifara = 0;
            }
        }
}

