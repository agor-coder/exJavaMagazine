/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.gorzki.exjavamagazine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author A
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Podaj plik");
        String fileName = sc.nextLine();

        try (
                  var fileReader = new FileReader(fileName);
                  var reader = new BufferedReader(fileReader);) {
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                list.add(nextLine);
            }
        } catch (IOException e) {
            System.out.println("no such file");
        }

        Map<String, Integer> note = new HashMap<>();
        for (String row : list) {
            String[] element = row.split(";");
            note.put(element[0], Integer.valueOf(element[1]));
        }
        

    }
}
