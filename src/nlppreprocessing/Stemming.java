/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlppreprocessing;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HaithamGamal
 */
public class Stemming {

    private LinkedList<String[]> dataAfterTokin2;

    /**
     * @return the dataAfterTokin2
     */
    public LinkedList<String[]> getDataAfterTokin2() {
        return dataAfterTokin2;
    }

    /**
     * @param dataAfterTokin2 the dataAfterTokin2 to set
     */
    public void setDataAfterTokin2(LinkedList<String[]> dataAfterTokin2) {
        this.dataAfterTokin2 = dataAfterTokin2;
    }

    public LinkedList<String> recieveStem(LinkedList<String[]> dataAfterTokin2) {
        String word = "";

        LinkedList<String> dataAfterStemming = new LinkedList<String>();
        for (int j = 0; j < dataAfterTokin2.size(); j++) {
            for (int k = 0; k < dataAfterTokin2.get(j).length; k++) {
                word = dataAfterTokin2.get(j)[k];
                int firstSliceEnd = word.length() - 1;
                int secondSliceEnd = word.length() - 2;
                int thirdSliceEnd = word.length() - 3;
                if (word.charAt(firstSliceEnd) == 's' && word.charAt(secondSliceEnd) == 'e') {

                    word = word.substring(0, secondSliceEnd);
                    dataAfterStemming.add(word);

                } else if (word.charAt(firstSliceEnd) == 't' && word.charAt(secondSliceEnd) == 's' && word.charAt(thirdSliceEnd) == 'e') {
                    word = word.substring(0, thirdSliceEnd);
                    dataAfterStemming.add(word);
                } else if (word.charAt(firstSliceEnd) == 's') {
                    word = word.substring(0, firstSliceEnd);
                    dataAfterStemming.add(word);

                } else if (word.charAt(firstSliceEnd) == 'g' && word.charAt(secondSliceEnd) == 'n' && word.charAt(thirdSliceEnd) == 'i') {

                    word = word.substring(0, thirdSliceEnd);
                    dataAfterStemming.add(word);
                } else if (word.charAt(firstSliceEnd) == 'd' && word.charAt(secondSliceEnd) == 'e') {
                    word = word.substring(0,secondSliceEnd);
                    dataAfterStemming.add(word);
                } else {
                    dataAfterStemming.add(word);
                }
            }

        }
        return dataAfterStemming;

    }

}
