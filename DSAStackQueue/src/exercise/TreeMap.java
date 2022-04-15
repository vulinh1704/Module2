package exercise;

import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào văn bản : ");
        String str = scanner.nextLine();
        System.out.println("Văn bản bạn vừa nhập là : " + str);
        System.out.println("---------------------------------");
        System.out.println("Liệt kê số lần xuất hiện các từ : ");
        Map<String, Integer> wordMap = countWords(str);
        for (String key : wordMap.keySet()) {
            System.out.print(key + " " + wordMap.get(key) + "\n");
        }
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordMap = new java.util.TreeMap<>();
        if (input == null) {
            return wordMap;
        }
        int size = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE) {
                sb.append(input.charAt(i)); // build 1 tu
            } else {
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
        addWord(wordMap, sb);
        return wordMap;
    }

    public static void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
}