/**
 *
 * Quickfix code to correctly format a resource text file for Weather app for Android(HCI)
 */

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileProcessor {


    public static void main(String[] args) throws IOException {

        File inputFile = new File("cities.txt");
        File tempFile = new File("newCities.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String st;
        while((st = reader.readLine()) != null){
            st= st.replaceAll("[0-9]","\r\n");
            writer.write(st);
            //writer.write("\n");
        }

        writer.close();
        reader.close();

        //System.out.println(writer);
    }

}
