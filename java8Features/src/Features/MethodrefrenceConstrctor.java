package Features;
interface hello1{
	hello1 h(String msg);
}
class welcome{
	welcome (String msg){
		System.out.println(msg);
	}
}
public class MethodrefrenceConstrctor {

	public static void main(String[] args) {
		hello1 h1= welcome::new;
		h1.h("msd");

	}

}
