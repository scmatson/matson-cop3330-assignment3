/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Scott Matson
 */

package oop.assignment3.ex42.base;

import java.io.FileNotFoundException;

public class ParsingADataFile {

    public static void main(String[] args) throws FileNotFoundException {
        //Initialize objects
        readFile rf = new readFile();
        Manipulate manip = new Manipulate();

        //Initialize variable
        int a = rf.amount();
        String[] inputData = new String[a];

        //Method calls
        rf.copyInput(a, inputData);
        manip.headerData();
        for(int i = 0; i < a; i++)
        {
            manip.splitData(i, inputData);
        }
    }
}
