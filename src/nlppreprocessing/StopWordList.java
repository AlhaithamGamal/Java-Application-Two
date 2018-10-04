/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlppreprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author HaithamGamal
 */
public class StopWordList {

    private String path = "";
    File dtw;
    Scanner sc;
    String line;
    private LinkedList<String> stopWords = new LinkedList<String>();
   // LinkedList<String> afterStopWords = new LinkedList<String>();
    
    

    StopWordList(String path, LinkedList<String> stopWords) throws FileNotFoundException {
        this.path = path;
        this.stopWords = stopWords;
        if(path!=null)
        readStopWords();
        

    }

    public void readStopWords() throws FileNotFoundException {
        if (path != null) {
            dtw = new File(path);
            sc = new Scanner(dtw);
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                stopWords.add(line);
            }

        }
      
            
      

    }
      public LinkedList<String[]>checkStopWords(LinkedList<String[]>ckstWords){
          String received="";
          
          for (int i = 0; i < stopWords.size(); i++) {
              received=stopWords.get(i);
              for (int j = 0; j < ckstWords.size(); j++) {
                  for (int k = 0; k < ckstWords.get(j).length; k++) {
                    
                      if(received.equals(ckstWords.get(j)[k])){
                     // ckstWords.get(j)[k].re
                          ckstWords.get(j)[k]="";
                      
                  }
                  
              }
              
          }
        
          
        
        
        }
            return   ckstWords;
      }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the stopWords
     */
    public LinkedList<String> getStopWords() {
        return stopWords;
    }

    /**
     * @param stopWords the stopWords to set
     */
    public void setStopWords(LinkedList<String> stopWords) {
        this.stopWords = stopWords;
    }


            
        
    }
