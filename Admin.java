import java.time.LocalDate;

public class Admin extends User {
    public Admin(){
        super();
    }

    public Admin(String name,int year,int month,int day){
        super(name, year, month, day);
    }
    public void displayHappyBirthday() {
        int age = LocalDate.now().getYear()-dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("User Type: Admin");
    }

    public void displayInfo(Boolean full){
        if (full){
            displayInfo();
            System.out.println("Date of today : " + LocalDate.now());
        }
        else {
            System.out.println("Admin Name: " + getName());
        }
    }
}
