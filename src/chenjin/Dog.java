package chenjin;

public class Dog {
	String name;
	String type;
	String sex;
	public void eat(int food)
	{
		int Dfood=food;
	System.out.println("eating NO."+Dfood+"ʳ��");	
	}
	public String bark() {
		String voice="����";
		return "���У�"+voice;
	}
	public void sleep()
	{
		System.out.println("��������i am sleep,be quite��");
	}
	public static void main(String[] args) {
	Dog a= new Dog();
	String jiao;
	a.name="����";
	a.type="��ĦҮ";
	a.sex="girl";
	System.out.println("������"+a.name+"\tƷ�֣�"+a.type+"\t�Ա�"+a.sex);
	jiao=a.bark();
	System.out.println(jiao);
	a.eat(3);
	a.sleep();
	
	}

}
