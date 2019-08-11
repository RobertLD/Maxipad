package Home;

import java.util.Random;

import static java.lang.Character.isLetter;

class genStats {

    //public variables for dummy stats
    public int length = 0;
    public int startTime = Main.startTime;
    public int duration= 0;
    public int babies= 0;
    public long hate= 0;
    public int bananas= 0;
    public char[] banana = {'(',')'};
    public int reddit= 0;


    public static double getRandomNumber(){
        double x = (Math.random() * ((100) + 1));
        x = Math.floor(x * 100) / 100;
        return x;
    }
    public void calcDummy(String pad, double currentTime){
        /* TODO: Fix calculations involving duration, as the current format doesn't work properly actually upon further inspection no calculation in this function actually works. Woops
         */
        this.length += pad.length();
        this.duration += (int) ((currentTime - startTime)/ 1000);
        this.babies  += (int) Math.log((((length * duration)/10000)));
        this.hate += ((length + (duration/100000000)));
        this.bananas += countSymbols(pad, this.banana);
        this.reddit += (int) (duration / 1000000000) + 1;
    }
    public static int countSymbols(String pad) {
        if (pad == null || pad.isEmpty()) {
            return 0;
        }
        char[] symbols = {'~', '@', '#', '$', '%', '^', '&', '*', '(', ')', ':', ';', '"', '\'', '=', '+', ',', '`', '/', '\\', '|', '[', ']'};
        int count = 0;
        for (int i = 0; i < symbols.length; i++) {
            int finalI = i;
            count += pad.chars().filter(ch -> ch == symbols[finalI]).count();
        }
        return count;
    }
    public static int countSymbols(String pad, char[] symbolArray) {
        if (pad == null || pad.isEmpty()) {
            return 0;
        }
        char[] symbols = symbolArray;
        int count = 0;
        for (int i = 0; i < symbols.length; i++) {
            int finalI = i;
            count += pad.chars().filter(ch -> ch == symbols[finalI]).count();
        }
        return count;
    }
    public static int countAlpha(String pad) {
        if (pad == null || pad.isEmpty()) {
            return 0;
        }
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
        if (pad == null || pad.isEmpty()) {
            return 0;
        }
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
