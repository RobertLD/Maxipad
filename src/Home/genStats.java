package Home;

import static java.lang.Character.isLetter;

public class genStats {

    public static double getRandomNumber(){
        double x = (Math.random() * ((100) + 1));
        x = Math.floor(x * 100) / 100;
        return x;
    }
    public static int countSymbols(String pad) {
        char[] symbols = {'~', '@', '#', '$', '%', '^', '&', '*', '(', ')', ':', ';', '"', '\'', '=', '+', ',', '`', '/', '\\', '|', '[', ']'};
        int count = 0;
        for (int i = 0; i < symbols.length; i++) {
            int finalI = i;
            count += pad.chars().filter(ch -> ch == symbols[finalI]).count();
        }
        return count;
    }
    public static int countAlpha(String pad) {
        int count = 0;
        char character;
        for (int i = 0; i < pad.length(); i++) {
            character = pad.charAt(i);
           if(isLetter(character)){
               count++;
           }
        }
        return count;
    }
    public static int countNumber(String pad) {
        int count = 0;
        char character;
        for (int i = 0; i < pad.length(); i++) {
            character = pad.charAt(i);
            if(isNumeric(Character.toString(character))){
                count++;
            }
        }
        return count;
    }
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }
    public static int countLines(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] lines = input.split("\n");
        return lines.length;
    }
    public static int countParagraphs(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] lines = input.split("\n\t");
        return lines.length;
    }
    public static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
}
