/*
 * @author  Oleksii Shevchenko KNUTE 1m
 *
 *
 * @version 23.06.20
 *
 *
 * Final course task
 *
 * 1. GLOSSARY - 10 points

    1.1. Download a text about Harry Potter.

    1.2. For each distinct word in the text calculate the number of occurrence.

    1.3. Use RegEx..

    1.4. Sort in the DESC mode by the number of occurrence..

    1.5. Find  the first 20 pairs.

    1.6  Find all the proper names

    1.7.  Count them and arrange in alphabetic order.

    1.8.   First 20 pairs and names write into to a file test.txt

    1.9.  Create a fine header for the file

    1.10  Use Java  Collections to demonstrate your experience (Map, List )

Show all your skills and experience.  All the tricks will be taken into account.
 */


package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        // get text from the file
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\London\\Desktop\\harry.txt")));

        // get all words from the text
        String word = "";
        int index = 1;
        String[] words = text.toUpperCase().replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll("\"", "")
                .replaceAll("", "")
                .replaceAll("/", "")
                .replaceAll("!", "")
                .replaceAll(";", "")
                .replaceAll(":", "")
                .replaceAll("\\?", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .replaceAll("\"", "")
                .replaceAll("\n", "")
                .replaceAll("0'", "")
                .replaceAll("--", "")
                .replaceAll(" -", "")
                .replaceAll(" - ", "")
                .replaceAll("- ", "")
                .replaceAll("' ", "")
                .replaceAll(" '", "")
                .replaceAll(" ' ", "")
                .replaceAll("'", "")
                .replaceAll("1", "")
                .replaceAll("2", "")
                .replaceAll("3", "")
                .replaceAll("4", "")
                .replaceAll("5", "")
                .replaceAll("6", "")
                .replaceAll("7", "")
                .replaceAll("8", "")
                .replaceAll("9", "")
                .replaceAll("", "")
                .replaceAll("0", "")
                .toLowerCase().split("\\s");

        String[] words1 = text.toUpperCase(^"A")
        Arrays.sort(words);
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i - 1])) {
                index++;
            } else if (!words[i].equals(words[i - 1])) {
                word = words[i - 1];
                System.out.println("Word '" + word + "' occurs in the text: " + index + " \n" +
                        "time.");
                index = 1;
            }
            word = words[i-1];
        }

        //Find all the proper names
        List<String> names = new ArrayList<>();

        Pattern patt = Pattern.compile("\\b[A-Z][a-z]{4,}\\b");
        Matcher mat = patt.matcher(text);
        while (mat.find())
        {
            String word2 = mat.group();
            names.add(word2);
        }

        // Count them and arrange in alphabetic order.
        Collections.sort(names);                                // sort proper names in alphabetic order
        int properNamesAmount = names.size(); // count proper names
        System.out.println("Proper names amount: " + properNamesAmount);



    }

    }




