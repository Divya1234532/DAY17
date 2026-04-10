import java.util.*;

public class ShortCharacter {
    public static void main(String[] args) {
        String s = "tree";

        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Convert to list
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort: frequency descending, character ascending
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                if (!a.getValue().equals(b.getValue())) {
                    return b.getValue() - a.getValue(); // descending frequency
                }
                return a.getKey() - b.getKey(); // ascending character
            }
        });
        /*Collections.sort(list, (a, b) -> {  by Lamda Function
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // descending frequency
            }
            return a.getKey() - b.getKey(); // ascending character
        });*/

        // Store result
        List<Character> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> i : list) {
            result.add(i.getKey());
        }

        // Print result
        System.out.println(result);
    }
}
