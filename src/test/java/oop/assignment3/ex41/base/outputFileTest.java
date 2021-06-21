package oop.assignment3.ex41.base;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class outputFileTest {

    @Test
    void outFile_outputs_txt_file() {
        File tmpDir = new File("/Users/scott/Development/COP3330-Java/matson-cop3330-assignment3/exercise41_output.txt");
        boolean exists = tmpDir.exists();

        if(exists)
        {
            System.out.println("File exists.");
        }
        else
            System.out.println("File does not exist");
    }
}