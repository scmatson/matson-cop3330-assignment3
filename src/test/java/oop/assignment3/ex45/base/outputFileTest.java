package oop.assignment3.ex45.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Scanner;

class outputFileTest {

    @Test
    void outFile() {

        File tmpDir = new File("/Users/scott/Development/COP3330-Java/matson-cop3330-assignment3/.txt");

        boolean exists = tmpDir.exists();

        if(exists)
        {
            System.out.println("File exists.");
        }
        else
            System.out.println("File does not exist");
    }
}
