import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;


public class ObservedPin {
  static void func(HashMap<String, String[]> possibly, String observed, List<String> list, int i, String str){
         for (String string : possibly.get(observed.split("")[i])){
             if (i == observed.length()-1) {
                 list.add(str+string);
                 continue;
             }
             str+=string;
             i++;
             func(possibly, observed, list, i, str);
             i--;
             str = str.substring(0, i);
         }
     }
    public static List<String> getPINs(String observed) {
      HashMap<String, String[]> possibly = new HashMap<>();
        possibly.put("0", new String[]{"8", "0"});
        possibly.put("1", new String[]{"1", "2", "4"});
        possibly.put("2", new String[]{"1", "2", "3", "5"});
        possibly.put("3", new String[]{"2", "3", "6"});
        possibly.put("4", new String[]{"1", "4", "5", "7"});
        possibly.put("5", new String[]{"2", "4", "5", "6", "8"});
        possibly.put("6", new String[]{"3", "5", "6", "9"});
        possibly.put("7", new String[]{"4", "7", "8"});
        possibly.put("8", new String[]{"5", "7", "8", "9", "0"});
        possibly.put("9", new String[]{"6", "8", "9"});
        List<String> list =new ArrayList<>();
        int i = 0;
        String str = "";
        func( possibly, observed, list, i,str);
        return list;
    } // getPINs

} // ObservedPin
