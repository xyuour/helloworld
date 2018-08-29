
public class TestAotoClose implements AutoCloseable {

	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("hello!");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(123);
	}

}
