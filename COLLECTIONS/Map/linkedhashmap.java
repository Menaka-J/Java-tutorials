
import java.util.LinkedHashMap;
import java.util.Map;

class linkedhashmap {

    public static void main(String[] args) {
        //implements from map interface -- preserve insertion order
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        //adding entry using put() method
        map.put("The Vampire Diaries", 2009);
        map.put("Supernatural", 2005);
        map.put("Stranger Things", 2016);
        map.put("Money heist", 2016);
        map.put("Game Of Thrones", 2011);
        map.put("Breaking Bad", 2008);
        map.put(null, null);
        map.put(null, 1);

        System.out.println("Map: " + map);

        //removing using remove()
        map.remove("Game Of Thrones");

        //updating using put()
        map.replace("Money Heist", 2017);
        System.out.println("Accessing Money Hesit: " + map.get("Money Heist"));
        System.out.println("Map: " + map);

        System.out.println("Key set: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entry set: " + map.entrySet());

        System.out.println("is dexter present: " + map.containsKey("Dexter"));
        map.putIfAbsent("Dexter", 2005);

        //printing map using entryset
        System.out.println("");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\n");
    }
}

/*
put(k,v) -> adding elements
putAll(collection) -> adding elements
putIfAbsent(k,v) -> add only if key not present
replace(k,v)
remove(k)
get(k)
isEmpty()
clear()
size()
containsKey()
containsValue()

keySet()
values()
entrySet()
getKey() -> from entry
getValue() -> from entry
setValue()
 */
