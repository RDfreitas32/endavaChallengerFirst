import java.util.HashMap;
import java.util.Map;

public class VowelCounter {

    public static Map<String, Object> countVowels(String name) {
        String lowerName = name.toLowerCase();

        // Initializing the MAP
        Map<Character, Integer> vowelMap = new HashMap<>();

        // Creating the Vowel Array
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            vowelMap.put(vowel, 0);
        }

        // Iterating through the name and If the map has name letters
        for (char ch : lowerName.toCharArray()) {
            if (vowelMap.containsKey(ch)) {
                vowelMap.put(ch, vowelMap.get(ch) + 1);
            }
        }

        // counting the total vowels and the repeated vowels
        int totalVowels = 0;
        StringBuilder totalVowelsDetail = new StringBuilder();
        StringBuilder repeatedVowelsDetail = new StringBuilder();

        //Iterating through the vowelMap entry
        for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {
            int count = entry.getValue();
            if (count > 0) {
                totalVowels += count;

                // Add a vowel to the totalVowelsDetails with a comma
                    totalVowelsDetail.append(entry.getKey()).append(", ");

                // add to VowelsDetails the Vowels and parenthesis
                if (count > 1) {
                    repeatedVowelsDetail.append(count).append("(").append(entry.getKey()).append("), ");
                }
            }
        }

        // Removing the last comma and space -2 -- totalVowelsDetail
        if (totalVowelsDetail.length() > 0) {
            totalVowelsDetail.setLength(totalVowelsDetail.length() - 2);
        }
        // Removing the last comma and space -2 -- repeatedVowelsDetail
        if (repeatedVowelsDetail.length() > 0) {
            repeatedVowelsDetail.setLength(repeatedVowelsDetail.length() - 2);
        } else {
            repeatedVowelsDetail.append("None");
        }

        // Preparing the results
        Map<String, Object> results = new HashMap<>();
        results.put("TotalVowels", totalVowels + " (" + totalVowelsDetail.toString() + ")");
        results.put("RepeatedVowels", repeatedVowelsDetail.toString());

        return results;
    }
}
