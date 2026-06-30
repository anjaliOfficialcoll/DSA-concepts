package Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Chocola {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        Integer hori[] = new Integer[m - 1];
        Integer verti[] = new Integer[n - 1];

        for (int i = 0; i < m - 1; i++) {
            hori[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            verti[i] = sc.nextInt();
        }

        Arrays.sort(hori, Collections.reverseOrder());
        Arrays.sort(verti, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < hori.length && v < verti.length) {

            if (hori[h] >= verti[v]) {
                cost += hori[h] * vp;
                hp++;
                h++;
            } else {
                cost += verti[v] * hp;
                vp++;
                v++;
            }
        }

        while (h < hori.length) {
            cost += hori[h] * vp;
            hp++;
            h++;
        }

        while (v < verti.length) {
            cost += verti[v] * hp;
            vp++;
            v++;
        }

        System.out.println(cost);
    }
}