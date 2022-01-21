import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class String2 {

    // program to find the longest unique subString from a String 
    public static void main(String[] args) {

        String s = "abbac";
        String longestSubString = null;
        int  lengthOfLongestSubstring = 0;

        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],i);
            }
            else{
               i =  map.get(ch[i]);
                map.clear();
            }

            if(map.size()>lengthOfLongestSubstring){
                lengthOfLongestSubstring = map.size();
                longestSubString = map.keySet().toString();
            }
           
        }
        System.out.println("LongestSubstring is :"+ longestSubString.toString());
        System.out.println("LengthOfLongestSubstring is :"+ lengthOfLongestSubstring);
        
    }
    
}
