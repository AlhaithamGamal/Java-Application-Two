/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlppreprocessing;

import java.util.LinkedList;

/**
 *
 * @author HaithamGamal
 */
public class Tokeinization {

    public String[] tokenSentence(String sentence) {

        return sentence.split("\\s");

    }
    public LinkedList<String[]> tokenstokenFile(LinkedList<String>data,LinkedList<String[]> tokens){
    
        for (int i = 0; i < data.size(); i++) {
            String []t=this.tokenSentence(data.get(i));
            tokens.add(t);
            
        }
//        this.printToken(tokens);
    return tokens;
        
    
    
    }

    private void printToken(LinkedList<String[]> tokens) {
        for (int i = 0; i <= tokens.size(); i++) {
            for (int j = 0; j <= tokens.get(i).length; j++) {
                System.out.println(tokens.get(i)[j]);
                
            }
            
            
        }
    }
    

}
