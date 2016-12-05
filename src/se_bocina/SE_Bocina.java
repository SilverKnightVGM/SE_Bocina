/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_bocina;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enzo
 */
public class SE_Bocina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String fileName = "input.txt";

        try {
//            Scanner input = new Scanner(new BufferedReader(new FileReader(fileName)));
            Scanner input = new Scanner(new File(fileName), "Unicode");
            input.useDelimiter("\\s*;\\s*|\n");
            ArrayList<Rule> test = new ArrayList<>();

            while (input.hasNext()) {
                int id = input.nextInt();
                String pregunta = input.next();
                int valor = input.nextInt();
                test.add(new Rule(pregunta, valor, Integer.toString(id)));
            }

            for (int i = 0; i < test.size(); i++) {
//                System.out.println(test.get(i).toString());
            }

            System.out.println(test.get(1).getPregunta() + "?");
            Rule ru = new Rule("Hola1", 1, test);
            System.out.println(ru.getOpciones().get(1).getPregunta());
            input.close();

        } catch (FileNotFoundException | InputMismatchException ex) {
//            Logger.getLogger(SE_Bocina.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print(ex.getMessage());
            ex.printStackTrace();
        }

//        Rule R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16;
//        ArrayList<Rule> rules = new ArrayList<>();
//        rules.add(R1);
    }

    public static void examples1() {
        Tree<String> tree = new Tree<>("Root");
        tree.addLeaf("A");
        tree.addLeaf("A", "B");
        tree.addLeaf("A", "C");
        tree.addLeaf("B", "D");
        tree.addLeaf("E", "D");
        tree.addLeaf("X");

        System.out.println(tree.toString());
        System.out.println("--------------");
        System.out.println(tree.getSuccessors("Root"));
        System.out.println(tree.getSuccessors("E"));
    }
}
