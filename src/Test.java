import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) throws Exception {
//		short s1 = 1;
////		s1 = s1 + 1;
//		s1 += 1;
//		int a = 1;
//		int b = 1;
//		System.out.println(a == b);
//		String str = "1   2    3";
//		Pattern p = Pattern.compile("\\s+");
//		Matcher m = p.matcher(str);
//		System.out.println(m.replaceAll(" "));
//		
//		Scanner sc = new Scanner(System.in);
//		int k = sc.nextInt();
//		int[] a = new int[] {k};
//		System.out.println(Arrays.toString(a));
		
//		int[][] aa = new int[2][];
		
//		Class c1 = Class.forName("Person");
//		Field[] fields = c1.getFields();
//		System.out.println(fields.length);
//		for (Field f : fields) {
//			System.out.println("f:"+f);
//		}
//		Constructor[] constructors = c1.getConstructors();
//		System.out.println(constructors.length);
//		for (Constructor c : constructors) {
//			System.out.println(c);
//		}
//		Method[] methods = c1.getMethods();
//		System.out.println(methods.length);
//		for (Method m : methods) {
//			System.out.println(m);
//		}
//		Method[] methods = c1.getDeclaredMethods();
//		System.out.println(methods.length);
//		for (Method m : methods) {
//			System.out.println(m);
//		}
//		int modifiers = c1.getModifiers();
//		
//		System.out.println(Modifier.toString(c1.getModifiers()));
//		System.out.println(Modifier.isFinal(c1.getModifiers()));
		
//		Person p1 = new Person("xy",21);
//		Class cp = p1.getClass();
//		Field nf = cp.getDeclaredField("name");
//		System.out.println(nf);
//		nf.setAccessible(true);
//		Object obj = nf.get(p1);
//		System.out.println(obj);
//		nf.set(p1, "123");
//		Object obj2 = nf.get(p1);
//		System.out.println(obj2);
		
//		Person p1 = new Person("xy",21);
//		Class cp = p1.getClass();
//		Method m1 = cp.getMethod("toName",String.class);
//		m1.invoke(p1,"name");
//		Person p1 = new Person("xy",21);
//		InvocationHandler h = new MyHandler();
//		Object proxyInstance = Proxy.newProxyInstance(TestProxyImpl.class.getClassLoader(), new Class[]{TestProxy.class}, h);
//		TestProxy tp = (TestProxy) proxyInstance;
//		tp.sayHi();
	}

}
