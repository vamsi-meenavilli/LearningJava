package Employee;

import java.util.Date;

public class Details {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String sex;
    private Date date_of_joining;
    private String[] skills;

    public Details(int id, String first_name, String last_name, String email, Sex sex, Date date_of_joining, String[] skills) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.sex = String.valueOf(sex);
        this.date_of_joining = date_of_joining;
        this.skills = skills;
    }

    public int GetId() {
        return id;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public String GetFirstName() {
        return first_name;
    }

    public void SetFirstName(String first_name) {
        this.first_name = Utils.FormatName(first_name);
    }

    public String GetLastName() {
        return last_name;
    }

    public void SetLastName(String last_name) {
        this.last_name = Utils.FormatName(last_name);
    }

    public String GetEmail() {
        return email;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

    public String  GetSex() {
        return sex;
    }

    public void SetSex(String sex) {
        this.sex = sex;
    }

    public Date GetDateOfJoining() {
        return date_of_joining;
    }

    public void SetDateOfJoining(Date date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public String[] GetSkills() {
        return skills;
    }

    public void SetSkills(String[] skills) {
        this.skills = skills;
    }
}
