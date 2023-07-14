package Features;
interface bye{
	void say();
}
public class MethodrefrenceStatic {
	public static void hello() {
		System.out.println("Hello Everyone");
	}

	public static void main(String[] args) {
	bye b=	MethodrefrenceStatic::hello;
	b.say();
	}

}
