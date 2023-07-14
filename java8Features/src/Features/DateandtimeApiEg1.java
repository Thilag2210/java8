package Features;
import java.time.LocalTime;
public class DateandtimeApiEg1 {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		LocalTime time1=LocalTime.of(11, 50);
		System.out.println(time1);
		LocalTime time2=time.minusHours(2);
		System.out.println(time2);
		LocalTime time3=time.minusMinutes(1);
		System.out.println(time3);
	}

}
