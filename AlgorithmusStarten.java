package de.b4chi;

import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.concurrent.Future;

/**
 * Created by bachi on 12.10.2016.
 */
public class AlgorithmusStarten extends Thread {
    ArrayList<Label> labels;
    int algo;


    public AlgorithmusStarten(ArrayList<Label> labels, int algo) {
        this.labels = labels;
        this.algo = algo;
    }

    @Override
    public void run() {
        long[] ergebniss = starteTest(100);
        auswerten(ergebniss, labels.get(0), labels.get(1), labels.get(2));
        ergebniss =  starteTest(1000);
        auswerten(ergebniss, labels.get(3), labels.get(4), labels.get(5));
        ergebniss =  starteTest(10000);
        auswerten(ergebniss, labels.get(6), labels.get(7), labels.get(8));
    }



    synchronized void auswerten(long[] ergebnisse, Label l1,Label l2,Label l3){
        long summe = 0;
        long min = 0;
        long max = 0;
        for (long l : ergebnisse) {
            if (min==0|| min > l) min = l;
            if (max < l ) max=l;
            summe += l;
        }
        l1.setText("Best Case:      " + min + " t");
        l2.setText("Worst Case:     " + max+ " t");
        l3.setText("Average Case:   " + summe/ergebnisse.length+ " t");

    }

   synchronized long[] starteTest(long anzahlZeichen){
        long[] test = new long[5];
       Algorithmus4 algorithmus = new Algorithmus4();
       switch (algo){
           case 1:
               break;
           case 2:
               break;
           case 3:
               break;
           case 4:
               algorithmus = new Algorithmus4();
               break;
           case 5:
               break;
           default:

       }

        for (int i = 0; i < test.length; i++) {
            if (i%2==0){
                String wort1 = StringLogik.stringGenerator(anzahlZeichen);
                String wort2 = StringLogik.anagramMaker(wort1, wort1.length());
                test[i] = algorithmus.algorithmus(wort1,wort2);
            } else {
                String wort1 = StringLogik.stringGenerator(anzahlZeichen);
                String wort2 = StringLogik.stringGenerator(anzahlZeichen);
                test[i] = algorithmus.algorithmus(wort1, wort2);
            }
        }
        return test;
    }






}
