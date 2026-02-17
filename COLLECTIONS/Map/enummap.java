
import java.util.EnumMap;

enum DAY {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}

class enummap {

    public static void main(String[] args) {
        EnumMap<DAY, String> map = new EnumMap<>(DAY.class);

        System.out.println("Map: " + map);

        //adding elements from DAY
        map.put(DAY.MONDAY, "Working day");
        map.put(DAY.WEDNESDAY, "Working day");
        map.put(DAY.SUNDAY, "Rest day");
        map.put(DAY.SATURDAY, "Rest day");
        map.put(DAY.FRIDAY, "Last working day");

        System.out.println("Map: " + map);

        //replacing
        map.replace(DAY.MONDAY, "Hell day");

        System.out.println("Map: " + map);

        //removing
        map.remove(DAY.WEDNESDAY);
        System.out.println("map: " + map);

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entry: " + map.entrySet());

        System.out.println("\n\n");
        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
