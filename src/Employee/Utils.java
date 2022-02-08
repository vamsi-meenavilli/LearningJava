package Employee;

import java.text.SimpleDateFormat;

public class Utils {
    public static String FormatName(String name) {
        if (!name.isEmpty() || !(name == null)) {
            return name;
        }

        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public static String GetName(Details employee_details) {
        String name = "";
        String first_name = employee_details.GetFirstName();

        if (!first_name.isEmpty() || !(first_name == null)) {
           name += first_name;
        }

        String last_name = employee_details.GetLastName();

        if (!last_name.isEmpty() || !(last_name == null)) {
            name += " ";
            name += last_name;
        }

        return name;
    }

    public static void PrintEmployeeDetails(Details employee_details) {
        System.out.println("Employee Details:");
        System.out.println("\tId: " + employee_details.GetId());
        System.out.println("\tName: " + GetName(employee_details));
        System.out.println("\tEmail: " + employee_details.GetEmail());
        System.out.println("\tSex: " + employee_details.GetSex());
        System.out.println(
                "\tJoining Date: "
                + new SimpleDateFormat("dd-MMMM-yyyy")
                .format(employee_details.GetDateOfJoining())
        );
    }
}
