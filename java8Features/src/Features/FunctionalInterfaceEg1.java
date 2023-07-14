package Features;

public class FunctionalInterfaceEg1 implements FunctionalInterfaceEg {

	public static void main(String[] args) {
		FunctionalInterfaceEg1 l=new FunctionalInterfaceEg1();
		l.test();
		l.test1();
		FunctionalInterfaceEg.test2();
	}

	@Override
	public void test() {
		System.out.println("Game test");
		
	}

}
