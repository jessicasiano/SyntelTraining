
public class EnumPractice
{
    enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
        
    public static void main(String[] args)
    {
        WorkDay startDay = WorkDay.MONDAY;
        WorkDay endDay = WorkDay.FRIDAY;
        
        Month birthMonth = Month.JUNE;

        System.out.println("Work starts on " + startDay);
        System.out.println("Work ends on " + endDay);
        System.out.println("I was born in " + birthMonth + " and it is month " + birthMonth.getMonthNumber());
    }
}