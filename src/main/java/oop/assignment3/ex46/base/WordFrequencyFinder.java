package oop.assignment3.ex46.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Scott Matson
 */

import oop.assignment3.ex46.base.readFile;

import java.io.FileNotFoundException;

public class WordFrequencyFinder {

    public static void main(String[] args) throws FileNotFoundException {
        readFile rf = new readFile();
        countWords cw = new countWords();
        displayOutput disOut = new displayOutput();

        int a = rf.amount();

        String[] inputData = new String[a];
        rf.copyInput(a, inputData);

        int badger = 0, snake = 0, mushroom = 0;

        for(int i = 0; i < a; i++)                                  //Gathers frequency of each line in .txt file
        {
            badger += cw.Occurrences(inputData[i], "badger");       //7
            mushroom += cw.Occurrences(inputData[i], "mushroom");   //2
            snake += cw.Occurrences(inputData[i], "snake");         //1
        }

        int ordered_words = cw.highestCount(badger,mushroom,snake);
        disOut.output(ordered_words, badger, mushroom, snake);
    }
}
