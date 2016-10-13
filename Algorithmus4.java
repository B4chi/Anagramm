package de.b4chi;

/**
 * Created by bachi on 12.10.2016.
 */
public class Algorithmus4  {
    long algorithmus(String a, String b) {
        long t = 0;
        int word1[] = new int[26];
        int word2[] = new int[26];

        for (int i = 0; i < a.length(); i++) {
            int pos = (int) a.charAt(i)-97;
            t++;
            word1[pos]++;
            t++;
        }
        for (int i = 0; i < b.length(); i++) {
            int pos = (int) b.charAt(i)-97;
            t++;
            word2[pos]++;
            t++;
        }
        for (int i = 0; i < word1.length; i++) {

            if (word1[i] != word2[i]) {
                return t;
            }
            t++;
        }

        return t;
    }
}
