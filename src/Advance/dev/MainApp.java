package Advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Khai báo mảng persons
		Person[] persons = new Person[5];

		// Nhập thông tin cho danh sách students và teachers
		input(persons);

		// In ra thông tin của mảng persons
		print(persons);
	}

	// Hàm nhập thông tin cho mảng persons
	public static void input(Person[] persons) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < persons.length; i++) {
			if (i < 3) {
				// Nhập thông tin cho sinh viên
				System.out.println("Nhập thông tin cho học sinh thứ " + (i + 1) + ":");
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Age: ");
				int age = scanner.nextInt();
				System.out.print("Điểm Toán: ");
				double mathScore = scanner.nextDouble();
				System.out.print("Điểm Lý: ");
				double physicsScore = scanner.nextDouble();
				System.out.print("Điểm Hóa: ");
				double chemistryScore = scanner.nextDouble();
				scanner.nextLine(); 
				persons[i] = new Student(name, age, mathScore, physicsScore, chemistryScore);
			} else {
				// Nhập thông tin cho giáo viên
				System.out.println("Nhập thông ti cho giáo viên " + (i - 2) + ":");
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Age: ");
				int age = scanner.nextInt();
				System.out.print("Hệ số lương: ");
				double hsl = scanner.nextDouble();
				scanner.nextLine(); // Consume the newline character
				persons[i] = new Teacher(name, age, hsl);
			}
		}
		scanner.close();
	}

	// Hàm in ra thông tin của mảng persons
	public static void print(Person[] persons) {
		System.out.println("Information of persons:");
		for (Person person : persons) {
			if (person instanceof Student) {
				Student student = (Student) person;
				System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Điểm Toán: "
						+ student.getToan() + ", Điểm Lý: " + student.getLy() + ", Điểm Hóa: " + student.getHoa()
						+ ", Điểm Trung Bình: " + student.diemTrungBinh());
			} else if (person instanceof Teacher) {
				Teacher teacher = (Teacher) person;
				System.out.println("Name: " + teacher.getName() + ", Age: " + teacher.getAge()
						+ ", Hệ số lương: " + teacher.getHsl() + ", Tiền Lương: " + teacher.tinhLuong());
			}
		}
	}

}
