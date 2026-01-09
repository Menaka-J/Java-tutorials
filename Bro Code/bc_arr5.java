
class br_arr5 {

    public static void main(String[] args) {
        String[][] cars = {
            {"Red Bull", "Ferrari", "Mercedes"},
            {"Aston Martin", "Hass", "Ford"},
            {"McClaren", "Williams", "Tesla"}
        };

        System.out.println("CARS:\n");

        for (String[] car1 : cars) {
            for (String car2 : car1) {
                System.out.println(car2);
            }
        }
    }
}
