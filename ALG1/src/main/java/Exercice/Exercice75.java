/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice;

/**
 *
 * @author alecw
 */
public class Exercice75 {

    public static void main(String[] args) {
        ListePremiers(100);
    }

    public static boolean estPremier(int n) {
        boolean estpremier = true;
        int i = 2;
        while (estpremier && i <= n - 1) {
            estpremier = n % i == 0;
            i++;
        }

        return estpremier;

    }

    public static void ListePremiers(int n) {
        for (int i = 2; i <= n; i++) {
            if (estPremier(i)) {
                System.out.println(i + "");
            }
        }

    }
}
