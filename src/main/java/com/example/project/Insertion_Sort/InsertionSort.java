package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        for (int i = 1; i < elements.length; i++) {
            int current = elements[i];
            int inner = i;
            while (inner > 0 && current < elements[inner - 1]) {
                count++;
                elements[inner] = elements[inner - 1];
                inner--;
            }
            elements[inner] = current;
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        int count = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            int min = i;
            for (int j = i + 1; i < elements.length; j++) {
                count++;
                if (elements[j] < elements[min]) {
                    j = min;
                }
            }
            int temp = elements[i];
            elements[i] = elements[min];
            elements[min] = temp;
        } 
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int count = 0;
        for (int i = 1; i < words.size(); i++) {
            String current = words.get(i);
            int inner = i;
            while (inner > 0 && current.compareTo(words.get(inner - 1)) < 0) {
                count++;
                words.set(inner, words.get(inner - 1));
                inner--;
            }
            words.set(inner, current);
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
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
    }

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

    public static void main(String[] args) {
        int[] arrA = {8, 10, 7, 16, 3, 12, 5, 2, 13, 4, 15, 9, 6, 1, 14, 11};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {8, 10, 7, 16, 3, 12, 5, 2, 13, 4, 15, 9, 6, 1, 14, 11};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));
    }
   
}