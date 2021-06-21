package oop.assignment3.ex42.base;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Manipulate {

    public void splitData(int index, String[] arr) {         //Clears commas and stores back in the array with a space
        List<String> result = Arrays.stream(arr[index].split(",")).collect(Collectors.toList());

        for(int i = 0; i < result.size(); i++){              //Each row is split up into a list of size 'x' (3 for this exercise)
            sortData(result.get(i));
        }
        System.out.println("");
    }

    public void sortData(String list_item){                 //Sorts the lists' data into columns
        boolean numeric = true;
        try {
            Double num = Double.parseDouble(list_item);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        if(numeric){
            System.out.printf("%-5s", list_item);
        }
        else
            System.out.printf("%-10s", list_item);
    }

    public void headerData(){                               //Displays header information
        System.out.printf("%-10s%-10s%-5s", "Last", "First", "Salary");
        System.out.println();
        System.out.println("--------------------------");
    }
}
