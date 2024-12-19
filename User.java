import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User(){
        name = null;
        dob = LocalDate.now();

    }
    public User (String name, int year, int month , int day){
        this.name = name;
        this.dob = LocalDate.of(year, month , day);
    }
    public Boolean isBirthday(){
        if(LocalDate.now().getDayOfMonth() == dob.getDayOfMonth() && LocalDate.now().getMonth() == dob.getMonth()){
            return true;
        }
        else {
            return false;
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public LocalDate getDob(){
        return dob;
    }
    public void setDob(LocalDate dob){
        this.dob = dob;
    }

    protected void displayInfo(){
        System.out.println("User Name : " + getName());
        System.out.println("Birthday : " + getDob());
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }








}