public class LeapYear {

    int leapYear;

    public LeapYear(int leapYear) {

        this.leapYear = leapYear;
    }

    public boolean getLeapYear() {
        if (this.leapYear % 4 != 0) {
            System.out.println("this isn't a leap year");
            return false;
        }
        else if (this.leapYear % 100 != 0) {
            System.out.println("This is a leap year");
            return true;
        }
        else if (this.leapYear % 400 != 0) {
            System.out.println("this isn't a leap year");
            return false;
        }
        else {
            System.out.println("leap year");
            return true;
        }
    }


}
