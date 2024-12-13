import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String name = "Rodrigo de Freitas Marcilio";
        Map<String, Object> result = VowelCounter.countVowels(name);

        System.out.println("The Total of vowels: " + result.get("TotalVowels"));
        System.out.println("Repeated Vowels: " + result.get("RepeatedVowels"));
    }
}