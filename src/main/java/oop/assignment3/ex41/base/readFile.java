package oop.assignment3.ex41.base;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {

    public int amount() throws FileNotFoundException {          //Gets the amount of rows in the text file
        int a = 0;
        File file = new File("/Users/scott/Development/COP3330-Java/matson-cop3330-assignment3/src/main/java/oop/assignment3/ex41/base/exercise41_input.txt");
        Scanner input_file = new Scanner(file);

        while (input_file.hasNextLine()) //Gets amount of strings
        {
            input_file.nextLine();
            a++;
        }
        input_file.close();
        return a;

    }

    public void copyInput(int size, String[] arr) throws FileNotFoundException {        //Copies each line of the text file into a string array

        File file = new File("/Users/scott/Development/COP3330-Java/matson-cop3330-assignment3/src/main/java/oop/assignment3/ex41/base/exercise41_input.txt");
        Scanner input_file = new Scanner(file);

        for(int i = 0; i < size; i++)
        {
            String temp = input_file.nextLine();
            arr[i] = temp;
        }

        input_file.close();
    }
}
