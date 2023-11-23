package demo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command line argument.");
            return;
        }
        String inputString = args[0];
        Map<String, Integer> frequencyMap = calculateTokenFrequency(inputString);
        displayTokenFrequency(frequencyMap);
    }
    private static Map<String, Integer> calculateTokenFrequency(String input) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] tokens = input.split("\\s+");
        for (String token : tokens) {
            String lowercaseToken = token.toLowerCase();
            frequencyMap.put(lowercaseToken, frequencyMap.getOrDefault(lowercaseToken, 0) + 1);
        }
        return frequencyMap;
    }
    private static void displayTokenFrequency(Map<String, Integer> frequencyMap) {
        String[] sortedTokens = frequencyMap.keySet().toArray(new String[0]);
        Arrays.sort(sortedTokens);
        for (String token : sortedTokens) {
            System.out.println(token + ": " + frequencyMap.get(token));
        }
    }
}
