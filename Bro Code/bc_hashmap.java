
import java.util.HashMap;

class bc_hashmap {

    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        //put => add elements
        map.put("MS Dhoni", 170.23);
        map.put("Ravindra Jadeja", 180.23);
        map.put("Mathew hayden", 200.34);

        //get=> to get value
        //size => to get size
        System.out.println("Size of map is " + map.size());
        //containskey , containsvalue => check if has key/value
        if (map.containsKey("Virat")) {
            System.out.println("map does not have key virat");
        }
        //remove => to remove element by key
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

