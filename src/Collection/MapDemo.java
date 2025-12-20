package Collection;

import java.util.Map;
import java.util.HashMap;
public class MapDemo {
    public static void main(String args[]){
        Map<String,Integer> mp=new HashMap<>();
        mp.put("Alice",21);
        mp.put("bob",23);
        mp.put("Jony",19);
        System.out.println("Alice age is:"+ mp.get("Alice"));


        System.out.println("display all person with age");
        for(Map.Entry<String,Integer> entry:mp.entrySet()){
                          System.out.println(entry.getKey() +":" + entry.getValue()) ;

        }
    }

}
