package chenjin;

public class Dog {
	String name;
	String type;
	String sex;
	public void eat(int food)
	{
		int Dfood=food;
	System.out.println("eating NO."+Dfood+"食物");	
	}
	public String bark() {
		String voice="汪汪";
		return "狗叫："+voice;
	}
	public void sleep()
	{
		System.out.println("狗狗：“i am sleep,be quite”");
	}
	public static void main(String[] args) {
	Dog a= new Dog();
	String jiao;
	a.name="球球";
	a.type="萨摩耶";
	a.sex="girl";
	System.out.println("姓名："+a.name+"\t品种："+a.type+"\t性别："+a.sex);
	jiao=a.bark();
	System.out.println(jiao);
	a.eat(3);
	a.sleep();
	
	}

}
