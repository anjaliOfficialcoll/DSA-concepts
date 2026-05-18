package Strings;

import java.util.Scanner;

public class checkAnagram {

    public static boolean CheckAnagram(String s1, String s2) {

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Length check
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Increase count for s1
        // Decrease count for s2
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        // Check all counts are zero
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(CheckAnagram(s1, s2));

        sc.close();
    }
}