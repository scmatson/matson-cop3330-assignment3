package oop.assignment3.ex41.base;

import java.io.FileWriter;
import java.io.IOException;

public class outputFile {       //Prints the newly alphabetized array from the input file to an output file

    public void outFile(int size, String[] arr) throws IOException {
        FileWriter output_file = new FileWriter("/Users/scott/Development/COP3330-Java/matson-cop3330-assignment3/exercise41_output.txt");

        int i;
        output_file.write("Total of " + size + " names\n-----------------\n");
        for(i = 0; i < size; i++)
        {
            output_file.write(arr[i] + "\n");
        }
        output_file.close();
    }
}
