public class LeapYearCalculator {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear(2000);
        System.out.println(leapYear.leapYear);
        boolean year = leapYear.getLeapYear();
        System.out.println(year);
    }
}
