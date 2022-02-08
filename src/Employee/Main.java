package Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Date joining_date = new Date();
        try {
            joining_date = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse("31-10-2019");
        }
        catch (Exception e) {
            System.out.println("Date Format Error: " + e.getMessage());
        }

        Details employee_details = new Details(
                1,
                "vamsi",
                "meenavilli",
                "vamsi.meenavilli@gmail.com",
                Sex.M,
                joining_date,
                new String[] {"Python", "Perl", "Java"}
        );

        Utils.PrintEmployeeDetails(employee_details);
    }
}
