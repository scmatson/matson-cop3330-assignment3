package oop.assignment3.ex45.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Scott Matson
 */

import java.io.IOException;
import java.util.Scanner;

public class WordFinder {

    public static void main(String[] args) throws IOException {

        readFile rf = new readFile();
        outputFile of = new outputFile();

        int a = rf.amount();
        String[] inputData = new String[a];
        String name = "";

        rf.copyInput(a, inputData);
        replaceWord(a, inputData);

        name = of.fileName(name);

        of.outFile(a, inputData, name);

    }

    public static void replaceWord(int size, String[] arr){             //Replaces all words found with a different word

        Scanner ui = new Scanner(System.in);
        System.out.print("Which word would you like to replace?: ");
        String a = ui.next();
        System.out.print("Which word would do you want to replace '" + a + "' with?: ");
        String b = ui.next();

        for(int i = 0; i < size; i++)
        {
            arr[i] = arr[i].replaceAll(a, b);
        }
    }
}
