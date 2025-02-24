package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
     public static int[] selectionSort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            int min = i;
            for (int j = i + 1; i < elements.length; j++) {
                if (elements[j] < elements[min]) {
                    j = min;
                }
            }
            int temp = elements[i];
            elements[i] = elements[min];
            elements[min] = temp;
        } 
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; i < words.size(); j++) {
                if (words.get(j).compareTo(words.get(min)) < 0) {
                    j = min;
                }
            }
            String temp = words.get(i);
            words.set(i, words.get(min));
            words.set(min, temp);
        } 
        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }
}
