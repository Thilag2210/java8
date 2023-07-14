package Features;
interface hello{
	void say();
}
public class MethodrefrenceNonstatic {
	public void some() {
		System.out.println("i am thilagaraj");
	}
	public static void main(String[] args) {
		MethodrefrenceNonstatic m=new MethodrefrenceNonstatic();
	hello h=	m::some;
		h.say();
	}

}
