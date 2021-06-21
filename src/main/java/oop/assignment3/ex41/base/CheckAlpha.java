package oop.assignment3.ex41.base;

public class CheckAlpha {

    public void strAlpha(int size, String[] arr){       //Compares two strings to see which has a lower value (first in the alphabet) and organizes the array alphabetically.
        String temp;
        for(int i = 0; i < size; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                if(arr[i].compareTo(arr[j]) > 0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
