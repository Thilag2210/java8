package Features;
import java.util.*;
import java.util.stream.Stream;
public class StreamApiEg {

	public static void main(String[] args) {
		Stream s1=Stream.of(0,1,2,3);
		//System.out.println(s1);
		s1.forEach(p ->System.out.println(p));
	}

}
