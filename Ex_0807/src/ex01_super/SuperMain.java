package ex01_super;

public class SuperMain {
public static void main(String[] args) {
	Child c = new Child(1);
	//자식객체를 생성하고 실행했는데 부모생성자 안에 있는 명령어 실행이 됨
	//부모생성자 실행이 됐다는 의미 
	
	//부모객체가 만들어지면서, 자식 객체가 부모의 필드를 사용할 수 있다. 
	System.out.println("money : " + c.money );
}
}
