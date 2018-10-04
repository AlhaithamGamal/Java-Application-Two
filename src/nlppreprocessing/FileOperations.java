/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nlppreprocessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author HaithamGamal
 */
public class FileOperations {

    private String path = "";

    FileOperations(String path) {
        this.path = path;

    }

    FileOperations() {
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

    public LinkedList<String> readFile(LinkedList<String> fileData) throws IOException {
        FileReader file = new FileReader(path);
        String line = "";
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            fileData.add(line);
        }

        return fileData;

    }

    /*  public String readLineFromFile() throws FileNotFoundException, IOException {
        String line = "";
        FileReader file = new FileReader(path);
        Scanner sc = new Scanner(file);
        line=sc.nextLine();   
        return line;

    }*/
    public LinkedList<String[]> readSentenceFromTheUser(String received, LinkedList<String> fileData) throws FileNotFoundException {
        String line = "";
        String filewName = "";
        File dtw;
        PrintWriter writer;
        LinkedList<String[]> dataAfterTokinization;
        Scanner sc;
        LinkedList<String[]> dataAfterTokinization2;
        if (path == null) {
            filewName = "DataWrite.txt";
            dtw = new File(filewName);
            writer = new PrintWriter(dtw);
            writer.write(received);
            writer.close();
            dataAfterTokinization = new LinkedList<String[]>();
            sc = new Scanner(dtw);
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                fileData.add(line);
            }
        } else {
            line = "";
            filewName = path;
            dtw = new File(filewName);
            sc = new Scanner(dtw);
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                fileData.add(line);
            }
            dataAfterTokinization = new LinkedList<String[]>();

        }
        dataAfterTokinization2 = new Tokeinization().tokenstokenFile(fileData, dataAfterTokinization);

        return dataAfterTokinization2;

    }

}
