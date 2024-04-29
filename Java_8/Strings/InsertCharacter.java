package org.example.Strings;

public class InsertCharacter {
    public static void main(String[] args) {
        String originalString = "Hello World";
        char charToInsert = '!';
        int positionToInsert = 5;

        StringBuilder sb = new StringBuilder();
        originalString.codePoints().forEach(sb::appendCodePoint);
        sb.insert(positionToInsert,charToInsert);

        System.out.println(sb);
    }
}
