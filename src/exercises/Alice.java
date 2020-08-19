package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence =
                "Alice was beginning to get very tired of sitting by her sister on the bank, \n" +
                "and of having nothing to do: once or twice she had peeped into the book her \n" +
                "sister was reading, but it had no pictures or conversations in it, 'and what \n" +
                "is the use of a book,' thought Alice 'without pictures or conversation?'\n";
        System.out.println(firstSentence);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your word for searching: ");
        String searching = input.nextLine();
        String lowerSentence = firstSentence.toLowerCase();
        String lowerSearching = searching.toLowerCase();
        System.out.println(lowerSentence.contains(lowerSearching));
        int index = lowerSentence.indexOf(lowerSearching);
        int length = lowerSearching.length();
        System.out.println("the length of your word: "+ length + "\nthe index is: " + index);
        String updatedFirstSentence = firstSentence.toLowerCase().replace(searching.toLowerCase(), "");
        System.out.println(updatedFirstSentence);
    }
}
