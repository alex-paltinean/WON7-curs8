package com.fasttrack.homework;

public class Homework5 {

    public static void main(String[] args) {
        String[] sensitiveWords = {"Ana", "mere"};
        System.out.println(confidential("Ana are mere Merele sunt multe", sensitiveWords));
    }

    public static String redact(String input) {
        return input.replaceAll(".", "*");
//        String result = "";
//        for (int i = 0; i < input.length(); i++) {
//            result += "*";
//        }
//        return result;
    }

    public static boolean contains(String[] words, String searchString) {
        for (String word : words) {
            if (word.equals(searchString)) {
                return true;
            }
        }
        return false;
    }

    public static String confidential(String phrase, String[] sensitiveWords) {
        String[] words = phrase.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            if (contains(sensitiveWords, word)) {
                stringBuilder.append(redact(word));
            } else {
                stringBuilder.append(word);
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
