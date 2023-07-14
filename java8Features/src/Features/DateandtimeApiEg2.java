package Features;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateandtimeApiEg2 {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		String form=dt.format(format);
		System.out.println(form);
		        
		}

}
