
import java.util.TreeMap;

class treemap {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Damon Salvatore", 3);
        map.put("Stefan Salvatore", 4);
        map.put("Elena Gilbert", 1);
        map.put("Caroline Forbes", 2);
        map.put("Bonnie Benette", 5);
        map.put("Klaus Mikelson", 6);
        map.put("Katherine Pierce", 7);

        System.out.println("Map: " + map);
        System.out.println("Map keys: " + map.keySet());
        System.out.println("Map values: " + map.values());

        System.out.println("\n");
        System.out.println("First Key: " + map.firstKey());
        System.out.println("last Key: " + map.lastKey());

        System.out.println("First entry: " + map.firstEntry());
        System.out.println("last entry: " + map.lastEntry());

        System.out.println("lower Key[Elena]: " + map.lowerKey("Elena Gilbert"));
        System.out.println("higher Key[Elena]: " + map.higherKey("Elena Gilbert"));

        System.out.println("lower entry[Elena]: " + map.lowerEntry("Elena Gilbert"));
        System.out.println("higher entry[Elena]: " + map.higherEntry("Elena Gilbert"));

        System.out.println("Head map: " + map.headMap("Klaus Mikelson"));
        System.out.println("Tail map: " + map.tailMap("Klaus Mikelson"));

        System.out.println("Sub map[caroline,stefan]: " + map.subMap("Caroline Forbes", "Stefan Salvatore"));

        System.out.println("Pooling first entry: " + map.pollFirstEntry());
        System.out.println("Pooling last entry: " + map.pollLastEntry());

        System.out.println("Map: " + map);
    }
}

//special methods
/*
1) firstKey() and firstEntry()->returns lower element ...
2) lastKey() and lastEntry()-> returns higher element ...
3) higherKey() and higherEntry(object) -> return least higher element than object ...
4) lowerKey() and lowerEntry(object) -> return highest lower element than object ...
5) subMap(e1,e2) -> return subset from e1 to e2 ...
6) headMap(element) -> return set of elements lesser than element ...
7) tailMap(element) -> return set of elements higher tha element ...
8) descendingMap() -> return reverse Set
9) floorkey() and floorEntry(element) -> return element floor to element in Set
10) ceilingKey() and ceilingEntry(element) -> return element ceil of element in Set
11) poolFirstEntry(e) -> return and remove least ...
12) poolLastEntry(e) -> return and remove higher ...
 */
