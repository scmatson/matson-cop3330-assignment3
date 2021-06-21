package oop.assignment3.ex45.base;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class outputFile {

    public String fileName(String name){
        System.out.print("What would you like to name the output file?: ");                 //Takes user input to name future .txt file
        Scanner ui = new Scanner(System.in);
        name = ui.next();
        return name;
    }

    public void outFile(int size, String[] arr, String name) throws IOException {           //Outputs .txt file with desired name using fileName method
        FileWriter output_file = new FileWriter("/Users/scott/Development/COP3330-Java/matson-cop3330-assignment3/" + name + ".txt");
        for(int i = 0; i < size; i++)
        {
            output_file.write(arr[i] + "\n");
        }
        output_file.close();
    }
}
