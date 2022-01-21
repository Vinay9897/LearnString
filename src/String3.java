import java.util.HashMap;
import java.util.Map;

public class String3 {
    // find the occurance of characters 
    public static void main(String[] args) {
        String s = "VinaYYadav";
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }
            else{
                     map.put(ch[i],1);
            }
            
        }
        System.out.println(map);
    }
}
