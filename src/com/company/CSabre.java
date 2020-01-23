package com.company;


import java.util.*;

import static java.util.Collections.sort;

public class CSabre {

    public static void main(String[] args) {

        String inputText = "ala ma kota, kot koduje w Javie Kota";

       System.out.println(solution(inputText));


    }

    public static String solution(String input) {

       if(input != null) //checking if input is not null
       {
           Map<Character, String> outputTextMap = new TreeMap<>();

           List<Character> keysList = new ArrayList<>();

           StringBuilder outputTextBuilder = new StringBuilder();

           List<String> splittedStringArrayList =
                   new ArrayList<>(Arrays.asList(input.toLowerCase().split("[^\\p{L}0-9']+")));
           // splitting words from input to list
           List<String> splittedStringArrayListNoDuplicates = new ArrayList<>();
           for (String s : splittedStringArrayList) {
               if (!splittedStringArrayListNoDuplicates.contains(s))
                   splittedStringArrayListNoDuplicates.add(s);
           }
           //removing duplicates from words list
           sort(splittedStringArrayListNoDuplicates);
           // alphabetical sorting for no duplicates list

           for (char c : input.toLowerCase().toCharArray()) {
               if (!keysList.contains(c) && (c >= 'a') && (c <= 'z')) {
                   keysList.add(c);// adding unique letters from inputString to keys
                   StringBuilder stringValueBuilder = new StringBuilder();
                   for (String s : splittedStringArrayListNoDuplicates) {
                       if (s.contains(String.valueOf(c))) {
                           stringValueBuilder.append(s + "," + " ");
                       }
                   }
                   String stringValue = new String(stringValueBuilder);
                   outputTextMap.put(c, stringValue);//putting words with the unique character to map
               }
           }

           for (Map.Entry<Character, String> entry : outputTextMap.entrySet()) {
               outputTextBuilder.append(entry.getKey() + ":" + " ");
               outputTextBuilder.append(entry.getValue().substring(0, entry.getValue().length() - 2) + "\n"); // deleting last ',' and ' '
           }

           String outputText = new String(outputTextBuilder); //creating String object from builder for return
           return outputText;
       }
       String n = new String("Received null value");
       return n;
    }
}



