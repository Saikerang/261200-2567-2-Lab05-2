public class Lec05 {
    public static void main(String[] args) {
        User John = new User("John",1954,2,18);
        John.displayInfo();
        System.out.println();
        Admin Nicolas = new Admin("Nicolas",1964,7,1);
        Nicolas.displayInfo();
        System.out.println();
        Nicolas.displayInfo(true);
        System.out.println();
        Nicolas.displayInfo(false);
        System.out.println();

        Admin Ken = new Admin("Ken",2004, 12,20);
        Ken.displayInfo(false);
        Ken.displayHappyBirthday();



    }
}
