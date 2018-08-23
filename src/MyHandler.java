import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javax.script.Invocable;
import javax.script.ScriptException;

public class MyHandler implements InvocationHandler {

	private TestProxy tp = new TestProxyImpl();
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(method.getName()+"   "+method.getClass());
		return method.invoke(tp, args);
	}
	
}
