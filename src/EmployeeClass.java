import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class EmployeeClass {
    int id;
    String first_name;
    String last_name;
    String email;
    char sex;
    Date date_of_joining;
    String[] skills;

    public EmployeeClass(
            int id,
            String first_name,
            String last_name,
            String email,
            char sex,
            Date date_of_joining,
            String[] skills
    ){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.sex = sex;
        this.date_of_joining = date_of_joining;
    }

    public String UCFirst(String string) {
        if (string.isEmpty() || string == null) {
            return string;
        }

        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    public String GetName() {
        String name = "";

        if (!this.first_name.isEmpty()) {
            name = UCFirst(this.first_name);
        }

        if (!this.last_name.isEmpty()) {
            if (!name.isEmpty()) {
                name += " ";
            }

            name += UCFirst(this.last_name);
        }

        return name;
    }

    public void PrintEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("\tId: " + this.id);
        System.out.println("\tName: " + this.GetName());
        System.out.println("\tEmail: " + this.email);
        System.out.println("\tSex: " + this.sex);
        System.out.println(
                "\tJoining Date: "
                + new SimpleDateFormat("dd-MMMM-yyyy")
                .format(this.date_of_joining)
        );
    }

    public static void main(String[] args) {
        Date joining_date = new Date();
        try {
            joining_date = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).parse("31-10-2019");
        }
        catch (Exception e) {
            System.out.println("Date Format Error: " + e.getMessage());
        }

        EmployeeClass employee1 = new EmployeeClass(
                1,
                "Vamsi",
                "Meenavilli",
                "vamsi.meenavilli@gmail.com",
                'M',
                joining_date,
                new String[] {"Python", "Perl", "Java"}
        );

        employee1.PrintEmployeeDetails();
    }
}
