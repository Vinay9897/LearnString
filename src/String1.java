import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class String1 {

    // program to find the non unique character in the String

    // program similar to unique(first last and all character),
    // non-unique(first last and all character) ;

    // Second approach using Collections

    public static void main(String[] args) {
        String s = "AABCDBE";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (java.util.Map.Entry<Character, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() == 1) {
                System.out.println(entrySet.getKey());
                break;
            }

        }

    }

}
