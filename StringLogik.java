package de.b4chi;

import java.util.Random;

/**
 * Created by bachi on 10.10.2016.
 */
public class StringLogik {
    /**
     * Erstellt eine  zufällig generierten String.
     * @param laenge länge des zu generierenden Strings
     * @return gibt den gernerierten String zurück
     **/
    static String stringGenerator(long laenge) {
        String string = "";
        for (int i = 0; i < laenge; i++) {
            Random rand = new Random();
            int zahl = rand.nextInt(26)+97;
            char buchstabe = (char) zahl;
            string = string + Character.toString(buchstabe);
        }
        return string;
    }

    /**
     * Mischt die Buchstaben einen eingegebenen Strings.
     * @param string String der gemischt werden soll.
     * @param mischungen Anzahl wie oft Buchstaben getauscht werden sollen.
     * @return Gibt einen durchmischten String zurück.
     */
    static String anagramMaker(String string, long mischungen){
        char[] array = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i);
        }
        for (int i = 0; i < mischungen; i++) {
            Random rand = new Random();
            int pos1 = rand.nextInt(array.length);
            int pos2 = rand.nextInt(array.length);
            char c1 = array[pos1];
            char c2 = array[pos2];
            array[pos1] = c2;
            array[pos2] = c1;
        }
        String stringReturn = "";
        for (int i = 0; i < array.length; i++) {
            stringReturn += Character.toString(array[i]);
        }

        return stringReturn;
    }
}
