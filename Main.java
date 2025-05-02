public class Main {
    public static void main(String[] args) 
    {
        System.out.println("Number of leap years between 2000 and 2025: " + 
            APCalendar.numberOfLeapYears(2000, 2025));
        
        System.out.println("January 5, 2019 was day: " + 
            APCalendar.dayOfWeek(1, 5, 2019));
        System.out.println("January 10, 2019 was day: " + 
            APCalendar.dayOfWeek(1, 10, 2019));
        
        System.out.println("February 29, 2020 was day: " + 
            APCalendar.dayOfWeek(2, 29, 2020));
    }
}