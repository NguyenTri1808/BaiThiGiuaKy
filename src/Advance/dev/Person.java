package Advance.dev;

public class Person {
	// Thuộc tính
	private String name;
	private int age;

	// Phương thức khởi tạo
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Phương thức getter và setter cho thuộc tính name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Phương thức getter và setter cho thuộc tính age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
