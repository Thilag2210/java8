package Features;
import  java.util.*;
import java.util.stream.Stream;
public class ArrayToStream {

	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3};
		Stream s2=Stream.of(arr);
		s2.forEach(p->System.out.println(p));
	}

}
