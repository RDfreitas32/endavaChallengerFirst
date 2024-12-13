# VowelCounter

## Description
`VowelCounter` is a Java class designed to count the vowels in a given string and generate statistics about the total
and repeated vowels. This utility is useful for text analysis in natural language processing applications or simple character analytics.

## Features
1. **Total vowel count:** Calculates the total number of vowels in a string.
2. **List of found vowels:** Returns the vowels present in the original string, separated by commas.
3. **Repeated vowels:** Displays vowels that appear more than once, along with the number of repetitions.

## Code Explanation (Line by Line)
### Method: `countVowels`
1. **`String lowerName = name.toLowerCase();`**
   - Converts the input string to lowercase to ensure comparisons are case-insensitive.

2. **`Map<Character, Integer> vowelMap = new HashMap<>();`**
   - Initializes a `HashMap` to store vowels (`a, e, i, o, u`) as keys and their counts as values.

3. **`char[] vowels = {'a', 'e', 'i', 'o', 'u'};`**
   - Defines an array of vowels to iterate over and initialize the map.

4. **`for (char vowel : vowels) { vowelMap.put(vowel, 0); }`**
   - Populates the `vowelMap` with vowels as keys and initializes their counts to `0`.

5. **`for (char ch : lowerName.toCharArray()) {`**
   - Converts the string to a character array and iterates through each character.

6. **`if (vowelMap.containsKey(ch)) {`**
   - Checks if the current character is a vowel (exists in `vowelMap`).

7. **`vowelMap.put(ch, vowelMap.get(ch) + 1);`**
   - Increments the count for the vowel in the map if it is found.

8. **`int totalVowels = 0;`**
   - Initializes a counter for the total number of vowels.

9. **`StringBuilder totalVowelsDetail = new StringBuilder();`**
   - Creates a `StringBuilder` to store a detailed list of all vowels found.

10. **`StringBuilder repeatedVowelsDetail = new StringBuilder();`**
    - Creates a `StringBuilder` to store details of repeated vowels.

11. **`for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {`**
    - Iterates over each entry in the `vowelMap` to process the results.

12. **`int count = entry.getValue();`**
    - Retrieves the count of the current vowel.

13. **`if (count > 0) {`**
    - Processes vowels that have been found in the string.

14. **`totalVowels += count;`**
    - Adds the count of the vowel to the `totalVowels` counter.

15. **`totalVowelsDetail.append(entry.getKey()).append(", ");`**
    - Appends the vowel to the total vowels detail string.

16. **`if (count > 1) {`**
    - Checks if the vowel is repeated.

17. **`repeatedVowelsDetail.append(count).append("(").append(entry.getKey()).append("), ");`**
    - Appends the repeated vowel and its count to the repeated vowels detail string.

18. **`if (totalVowelsDetail.length() > 0) { totalVowelsDetail.setLength(totalVowelsDetail.length() - 2); }`**
    - Removes the trailing comma and space from the total vowels detail string.

19. **`if (repeatedVowelsDetail.length() > 0) { repeatedVowelsDetail.setLength(repeatedVowelsDetail.length() - 2); }`**
    - Removes the trailing comma and space from the repeated vowels detail string.

20. **`results.put("TotalVowels", totalVowels + " (" + totalVowelsDetail.toString() + ")");`**
    - Constructs the output string for total vowels and adds it to the results map.

21. **`results.put("RepeatedVowels", repeatedVowelsDetail.length() > 0 ? repeatedVowelsDetail.toString() : "None");`**
    - Constructs the output string for repeated vowels and adds it to the results map.

22. **`return results;`**
    - Returns the map containing both total and repeated vowels details.

## Explanation of Output
### Line by Line Breakdown
1. **Total Vowels:**
   - Displays the total number of vowels found, along with a list of unique vowels.

   Example:
   ```
   Total Vowels: 11 (a, e, i, o)
   ```
   Explanation:
   - `11` indicates the total occurrences of vowels in the input string.
   - `(a, e, i, o)` lists all unique vowels found.

2. **Repeated Vowels:**
   - Lists vowels that appear more than once, along with their counts.

   Example:
   ```
   Repeated Vowels: 2(a), 2(e), 4(i), 3(o)
   ```
   Explanation:
   - `2(a)`: The vowel `a` appears 2 times.
   - `2(e)`: The vowel `e` appears 2 times.
   - `4(i)`: The vowel `i` appears 4 times.
   - `3(o)`: The vowel `o` appears 3 times.

## Usage Example
### Main Code
```java
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String name = "Rodrigo de Freitas Marcilio";
        Map<String, Object> result = VowelCounter.countVowels(name);

        System.out.println("Total Vowels: " + result.get("TotalVowels"));
        System.out.println("Repeated Vowels: " + result.get("RepeatedVowels"));
    }
}
```

### Expected Output
```
Total Vowels: 11 (a, e, i, o)
Repeated Vowels: 2(a), 2(e), 4(i), 3(o)
```

## How to Compile and Run
1. Save the files `VowelCounter.java` and `Main.java` in the same directory.
2. Compile both files:
   ```
   javac VowelCounter.java Main.java
   ```
3. Run the program:
   ```
   java Main
   ```

## Possible Improvements
- Add support for accented characters (`á`, `é`, `í`, etc.).
- Allow the method to accept different languages with customized sets of vowels.
- Optimize resource usage when handling very large strings.

## Contribution
If you want to contribute with improvements or fixes, please submit a Pull Request to the GitHub repository.

