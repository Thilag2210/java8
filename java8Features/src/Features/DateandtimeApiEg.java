package Features;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class DateandtimeApiEg {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDate yesterday=date.minusDays(2);
		System.out.println(yesterday);
		LocalDate tomorrow =date.plusDays(2);
		System.out.println(tomorrow);
		LocalDate date1=LocalDate.of(1999,10, 22);
		System.out.println(date1.isLeapYear());
		LocalDate date2=LocalDate.of(2000,10, 22);
		System.out.println(date2.isLeapYear());
		LocalDate date3=LocalDate.of(2002, 04, 01);
		LocalDateTime datetime=date3.atTime(10,55);
		System.out.println(datetime);
	}

}
