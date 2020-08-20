package org.launchcode.java.studios.countingCharacters;

import java.util.*;

public class countingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Text: ");
        String userInput = input.nextLine().toLowerCase();
        char[] charactersInText = userInput.toCharArray();
        HashMap<Character, Integer> numberOfCharacter = new HashMap<>();

        for (char character : charactersInText) {
            if (Character.isAlphabetic(character)) {
                if (numberOfCharacter.containsKey(character)) {
                    numberOfCharacter.put(character, numberOfCharacter.get(character) + 1);
                } else numberOfCharacter.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> Character : numberOfCharacter.entrySet()) {
            System.out.println(Character.getKey() + ":" + Character.getValue());
        }
    }
}
//    Set<Character> characterSet = numberOfCharacter.keySet();
//        for (Character character : characterSet) {
//        int currentCharacterCount = numberOfCharacter.get(character);
//        System.out.println(character + ": " + currentCharacterCount);
