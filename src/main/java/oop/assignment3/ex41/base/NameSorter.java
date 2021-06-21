/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Scott Matson
 */

package oop.assignment3.ex41.base;

import java.io.IOException;

public class NameSorter {

    public static void main(String[] args) throws IOException {         //Executes the program

        readFile rf = new readFile();
        CheckAlpha alpha = new CheckAlpha();
        outputFile of = new outputFile();

        int a = rf.amount();

        String[] inputArray = new String[a];
        rf.copyInput(a, inputArray);
        alpha.strAlpha(a, inputArray);
        of.outFile(a, inputArray);

    }
}
