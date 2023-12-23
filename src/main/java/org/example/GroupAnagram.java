package org.example;

import java.util.*;

public class GroupAnagram {

    public static void main (String args[]){

        String[] strs = {"kevine", "evinek", "kevo", "voke", "kev"};
        List<List<String>> result = groupAnagram(strs);

        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
    public static List<List<String>> groupAnagram (String [] strs){

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String s : strs) {
            // Sort the characters in the string and use it as a key
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            // If the key is not in the map, add it with an empty list as the value
            anagramGroups.putIfAbsent(sortedS, new ArrayList<>());

            // Append the original string to the list of anagrams for this key
            anagramGroups.get(sortedS).add(s);
        }

        // Convert the values of the map to a list of lists (the groups of anagrams)
        return new ArrayList<>(anagramGroups.values());
    }

//        char anagram2 [];
//        for (int i = 0; i < strs.length; i++){
//            for (int j = i +1; j< strs.length; j++){
//                anagram1 = strs[i].toCharArray();
//                anagram2 = strs[j].toCharArray();
//                Arrays.sort(anagram1);
//                Arrays.sort(anagram2);
//
//                if (Arrays.equals(anagram1, anagram2)){
//                    System.out.println(strs[i] +" is an anagram of "+ strs[j]);
//                }
//            }
//
//        }

}
