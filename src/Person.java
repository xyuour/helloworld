
public class Person {
	
	private int age;
	private String name;
	public static int id = 0;
	
	static {
		int rnum = 0;
		rnum++;
//		System.out.println(rnum);
	}
	public Person() {
		// TODO Auto-generated constructor stub
		age = 0;
		name = "";
	}
	public Person(String n,int a) {
		// TODO Auto-generated constructor stub
		age = a;
		name = n;
	}
	
	public String toName(String s) {
		System.out.println(s+123);
		return this.toString();
	}
	public void addAge() {
		this.age = this.getAge() + 1;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
