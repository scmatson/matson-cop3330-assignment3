package oop.assignment3.ex46.base;

public class countWords {

    public int Occurrences(String str, String word)              //Returns occurrence of desired word in each line
    {

        String[] a = str.split(" ");

        int count = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(word.equals(a[i]))
            {
                count++;
            }
        }
        return count;
    }

    public int wordLength(String word) {                        //Returns length of a single word string
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ')
                count++;
        }
        return count;
    }

    public int frequencyCount(int a, int b)                     //Helps with if/else decision making in highestCount method
    {
        if(a > b)
            return 1;
        else
            return 0;
    }

    public int highestCount(int a, int b, int c){               //Returns a value that will be used in a switch/case statement to determine which word occurs the most

        if(frequencyCount(a, b) == frequencyCount(a,c)) {
            if(frequencyCount(b, c)==1) {
                return 1;
            }
            else {
                return 2;
            }
        }
        else if(frequencyCount(b, a) == frequencyCount(b, c)) {
            if(frequencyCount(a, c)==1) {
                return 3;
            }
            else {
                return 4;
            }
        }
        else{
            if(frequencyCount(a, b)==1) {
                return 5;
            }
            else {
                return 6;
            }
        }
    }
}
