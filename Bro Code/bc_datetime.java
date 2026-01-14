
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class bc_datetime {

    public static void main(String[] args) {
        LocalDate localdate = LocalDate.now();
        System.out.println("Current date is : " + localdate + "\n");

        LocalTime localtime = LocalTime.now();
        System.out.println("Current time is : " + localtime + "\n");

        LocalDateTime localdt = LocalDateTime.now();
        System.out.println("Current date time is : " + localdt + "\n");

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String ans = localdt.format(format);
        System.out.println("Formatted date time is : " + ans + "\n");

        //is.After -> for checking two dates
        //isBefore
        //isEqual

    }
}
