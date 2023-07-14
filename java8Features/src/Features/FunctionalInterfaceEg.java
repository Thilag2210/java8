package Features;


	public interface FunctionalInterfaceEg{
		public void test();
		
		default void test1() {
			System.out.println("test1 running...");
		}
		static void test2() {
			System.out.println("test2 running....");
		}
	}

	


