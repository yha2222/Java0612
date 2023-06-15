package ddit.chap05.sec21;

public class Student {
	//Ŭ���� �ܺο��� ���� ������ �� �ִ� ���X Ŭ������ �� ��� ������� ��
	//������ Ÿ�� �տ� private <=��κ�= ���������� 
	//            + gather-Ŭ���� ������ ������ => �ʿ�! ��ȯ��
	//				setter-�ܺ� �����Ͱ� �����ͼ� ���� => �ʿ�! �������� ���(�Ű�����) ��ȯ��X
	private String name;
	private int age;
	private boolean gender;
	//heap�� �����
	//�Ű� ���� - Ŭ���� ������ ������ �� �� ����
	//call stack -  ȣ�� ����
	
	//������ �޼ҵ� ���� : ��� ���� �ʱ�ȭ
	public Student(String name, int age, boolean gender) {  
		//���� ����: ���� ���� ���� ���� private�� ��
		this.name = name;
		//������ ���� this - �ڱⰡ ���� Ŭ���� �ּ�(��ġ��-heap����)
		//���� ���� �� ���� �̸� ���� �� �� �����ϱ� ����
		this.age = age;
		this.gender = gender;
	}
	
	public void setName(String name) { //��ȯ��X => void , �Ű�����O => (String name)
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
