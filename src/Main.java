import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                if (!map.containsKey(string.charAt(i))) {
                    map.put(string.charAt(i), 1);
                } else {
                    int count = map.get(string.charAt(i));
                    map.put(string.charAt(i), count + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            System.out.println(kv.getKey() + " = " + kv.getValue());
        }

        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (maxEntry == null || kv.getValue() > maxEntry.getValue()) {
                maxEntry = kv;
            }
        }
        System.out.println(maxEntry);

        Map.Entry<Character, Integer> minEntry = null;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (minEntry == null || kv.getValue() < minEntry.getValue()) {
                minEntry = kv;
            }
        }
        System.out.println(minEntry);
    }
}