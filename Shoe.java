import java.util.HashMap;
enum Foot { LEFT, RIGHT};
record Shoe(Foot foot, int size) { }

class Solution {
  
  public static boolean pairOfShoes(Shoe[] shoes) {
    
    if (shoes.length % 2 != 0) {
            return false;                    
        }
        HashMap<Foot, Foot> leg = new HashMap<>();
        leg.put(Foot.LEFT, Foot.RIGHT); leg.put(Foot.RIGHT, Foot.LEFT);
        
        for (int i = 0; i != shoes.length; i++) {
            
            if (shoes[i] == null) continue;
            
            for (int j = i+1; j != shoes.length; j++) {
                if(shoes[j] != null){
                  if (shoes[i].size() == shoes[j].size() && shoes[i].foot() == leg.get(shoes[j].foot())) {
                    shoes[i] = null;
                    shoes[j] = null;                    
                    break;
                  }
                }
            }            
        }
        for (Shoe shoe : shoes) if(shoe != null) return false;
         
        return true;
  }
}
